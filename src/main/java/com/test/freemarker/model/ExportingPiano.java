package com.test.freemarker.model;

import lombok.Data;

import java.util.Date;

@Data
public class ExportingPiano {

    private int id = 123456;

    /** The descrizione. */
    private String descrizione = "Formazione sicurezza 2019 - Rosenheimer Fenstertage - Rubner Tueren Srl";
    private DatiProcessiPiano datePiano = new DatiProcessiPiano();

    private String dataEstrazione = new Date().toString();
}
