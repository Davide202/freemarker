package com.test.freemarker.model;

import lombok.Data;

import java.util.Date;

@Data
public class InfoStorica {
    private int utente;

    /** The tipo modifica. */
    private String tipoModifica;

    /** The data inserimento. */
    private Date dataInserimento;

    /** The data modifica. */
    private Date dataModifica;

    /**
     * Instantiates a new info storica.
     */
    public InfoStorica() {
        utente = 0;
        tipoModifica = "";
        dataInserimento = null;
        dataModifica = null;
    }
}
