package com.test.freemarker.model;

import lombok.Data;

@Data
public class FirmatarioAccordo {

    private int id;

    /** The nome. */
    private String nome;

    /** The cognome. */
    private String cognome;

    /** The organizzazione. */
    private String organizzazione;

    /** The livello. */
    private LivelloFirmatario livello;

    /** The incarico. */
    private String incarico;

    /** The email. */
    private String email;

    /**
     * Instantiates a new firmatario accordo.
     */
    public FirmatarioAccordo() {

        id = 0;
        nome = "";
        cognome = "";
        organizzazione = "";
        livello = new LivelloFirmatario();
        incarico = "";
        email = "";
    }
}
