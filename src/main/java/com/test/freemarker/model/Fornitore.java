package com.test.freemarker.model;

import lombok.Data;

@Data
public class Fornitore {
    private int id;

    /** The denominazione. */
    private String denominazione;

    /** The partita IVA. */
    private String partitaIVA;

    /** The natura giuridica. */
    private String naturaGiuridica;

    /** The codice fiscale. */
    private String codiceFiscale;

    /** The tipo. */
    private MinimalBean tipo;

    /** The codice fiscale azienda. */
    private String codiceFiscaleAzienda;

    /** The flag PIVA estera. */
    private int flagPIVAEstera;

    /** The id azienda. */
    private int idAzienda;

    /** The deleted. */
    private boolean deleted;

    /** The titolare. */
    //VM MAD 661
    private int titolare;

    /**
     * Instantiates a new fornitore.
     */
    public Fornitore() {
        id = 0;
        denominazione = "";
        partitaIVA = "";
        naturaGiuridica = "";
        codiceFiscale = "";
        tipo = null;
        codiceFiscaleAzienda = "";
        flagPIVAEstera = 0;
        idAzienda = 0;
        deleted = false;
    }

}
