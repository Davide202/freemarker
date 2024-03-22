package com.test.freemarker.application;


import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfWriter;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.core.ParseException;
import freemarker.template.*;
import freemarker.template.Template;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class FreeMarkerService {

    private final static String list_persona_html = "./src/main/resources/listpersona.html";
    private final static String output_pdf = "./src/main/resources/output.pdf";

    public void run()  {
        System.out.println("RUN");
        try {
            String html = createHtml();
            writePdf(html);
            writePdfTest();
        } catch (Exception e) {
            System.out.println("\n*****Exception " + e.getMessage());
        }
    }

    private void writePdf(String html) {

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

    private Configuration config() throws IOException {
        String extBasePath = "C:\\FPF-Fondimpresa";

        Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);

        TemplateLoader templateLoader = new FileTemplateLoader(new File(extBasePath));
        cfg.setTemplateLoader(templateLoader);

        // Where do we load the templates from:
        //cfg.setClassForTemplateLoading(this.getClass(), "/templates");

        // Some other recommended settings:
        cfg.setIncompatibleImprovements(new Version(2, 3, 20));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setLocale(Locale.US);
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        return cfg;
    }

    private String createHtml() throws IOException {
        Map<String, Object> input = new HashMap<String, Object>();

        input.put("title", "Il mio titolo preferito");
        input.put("persone",ModelPersona.getTestList());
        input.put("html","<b style='color:red;'><i>Il mio nome &#233; Nessuno</i></b>");

        Writer fileWriter = null;

        try {
            Template template = config().getTemplate("listpersona.ftl");

            // 2.3. Generate the output

            // Write output to the console
            Writer consoleWriter = new OutputStreamWriter(System.out);
            template.process(input, consoleWriter);

            // For the sake of example, also write output into a file:
            fileWriter = new FileWriter(new File(list_persona_html));

            template.process(input, fileWriter);
        } catch (TemplateException e) {
            System.out.println("TemplateException "+e.getMessage());
        } catch (TemplateNotFoundException e) {
            System.out.println("TemplateNotFoundException "+e.getMessage());
        } catch (ParseException e) {
            System.out.println("ParseException "+e.getMessage());
        } catch (MalformedTemplateNameException e) {
            System.out.println("MalformedTemplateNameException "+e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException "+e.getMessage());
        } finally {
            if (fileWriter != null) fileWriter.close();
        }


        return "";


    }

}
