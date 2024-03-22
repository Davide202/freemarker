package com.test.freemarker.application;


import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.test.freemarker.model.ModelPersona;
import freemarker.cache.FileTemplateLoader;

import freemarker.core.ParseException;
import freemarker.template.*;
import freemarker.template.Template;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


@Component
@Deprecated
@Log4j2
public class FreeMarkerCommandLineRunner implements CommandLineRunner {

    private final static String list_persona_html = "./src/main/resources/listpersona.html";
    private final static String output_pdf = "./src/main/resources/output.pdf";


    @Override
    public void run(String... args)  {
        log.info("RUN");
        try {
            createHtml();
            writePdfTest();
        } catch (Exception e) {
            log.error("\n*****Exception {}",e.getMessage());

        }
    }



    private void writePdfTest() throws IOException {

        String html = Files.readString(Path.of(list_persona_html));

        HtmlConverter.convertToPdf(
//                "<html><body><div>TEST TEST <br> <b>This text should be written in bold.</b></div></boby></html>",       // html to be converted
                html,
                new PdfWriter(
                        new File(output_pdf)  // destination file
                )
        );
    }

    private Configuration config()  {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
        try {
            String extBasePath = "C:\\FPF-Fondimpresa";
            File extDir = new File(extBasePath);
            if (extDir.exists() && extDir.isDirectory()){
                cfg.setTemplateLoader(new FileTemplateLoader(extDir));
            }else{
                // Where do we load the templates from:
                cfg.setClassForTemplateLoading(this.getClass(), "/templates");
            }
            // Some other recommended settings:
            cfg.setIncompatibleImprovements(new Version(2, 3, 20));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setLocale(Locale.US);
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

            return cfg;
        } catch (IOException e) {
            log.error(e);
            throw new RuntimeException(e);
        }

    }

    private final Configuration cfg = config();

    private void createHtml() throws IOException {
        Map<String, Object> input = new HashMap<String, Object>();

        input.put("title", "Il mio titolo preferito");
        input.put("persone", ModelPersona.getTestList());
        input.put("html","<b style='color:red;'><i>Il mio nome &#233; Nessuno</i></b>");

        Writer fileWriter = null;

        try {
            Template template = cfg.getTemplate("listpersona.ftl");

            // 2.3. Generate the output

            // Write output to the console
            Writer consoleWriter = new OutputStreamWriter(System.out);
            template.process(input, consoleWriter);

            // For the sake of example, also write output into a file:
            fileWriter = new FileWriter(new File(list_persona_html));

            template.process(input, fileWriter);
        } catch (TemplateException e) {
            log.error("TemplateException {}",e.getMessage(),e);
        } catch (TemplateNotFoundException e) {
            log.error("TemplateNotFoundException {}",e.getMessage(),e);
        } catch (ParseException e) {
            log.error("ParseException {}",e.getMessage(),e);
        } catch (MalformedTemplateNameException e) {
            log.error("MalformedTemplateNameException {}",e.getMessage(),e);
        } catch (IOException e) {
            log.error("IOException {}",e.getMessage(),e);
        } finally {
            if (fileWriter != null) fileWriter.close();
        }
    }

}
