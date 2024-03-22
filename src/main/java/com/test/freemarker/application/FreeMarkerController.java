package com.test.freemarker.application;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
@Log4j2
public class FreeMarkerController {


    @Autowired
    private FreeMarkerService service;

    @GetMapping
    public ResponseEntity<?> downloadPdf(){
        File file = null;
        try {
            file = service.getPdf2();
            InputStream inputStream = new FileInputStream(file);
            InputStreamResource resource =
                    new InputStreamResource(
                            new FileInputStream(file)
                    );
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName())
                    .contentType(MediaType.parseMediaType(MediaType.APPLICATION_OCTET_STREAM_VALUE))
                    .contentLength(file.length())
                    .body(resource);
        } catch (IOException e) {
           log.error(e);
            return ResponseEntity
                    .status(HttpStatusCode.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()))
                    .body(e.getClass() + " : " + e.getMessage());
        }

    }
}
