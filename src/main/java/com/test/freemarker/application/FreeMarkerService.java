package com.test.freemarker.application;

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfWriter;
import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

@Service
@Log4j2
public class FreeMarkerService {


    @Autowired
    private Configuration cfg;

    public File getPdf() throws IOException {

        log.info("START getPdf()");
        Path tempFilePath = getPath();
        File tempFile = tempFilePath.toFile();

        log.info("file {}", tempFile.getAbsolutePath());

        Map<String, Object> input = getInput();

        Writer fileWriter = new FileWriter(tempFile);

        try {
            Template template = cfg.getTemplate("listpersona.ftl");
            template.process(input, fileWriter);

            String html = Files.readString(tempFilePath);

            HtmlConverter.convertToPdf(html,new PdfWriter(tempFile));

        }catch (Exception e){
            log.error(e);
        }finally {
            fileWriter.close();
        }

        return tempFile;
    }

    private Map<String, Object> getInput() {
        Map<String, Object> input = new HashMap<String, Object>();

        input.put("title", "Il mio titolo preferito");
        input.put("persone",ModelPersona.getTestList());
        input.put("html","<b style='color:red;'><i>Il mio nome &#233; Nessuno</i></b>");
        return input;
    }

    private Path getPath(){
        //        Path tempFilePath = Files.createTempFile("file-",".pdf");
        Path tempFilePath = Path.of("file.pdf");
        try {
            tempFilePath = Files.createFile(tempFilePath);
        } catch (java.nio.file.FileAlreadyExistsException e) {
            tempFilePath.toFile().delete();
            return getPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return tempFilePath;
    }
}
