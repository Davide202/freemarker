package com.test.freemarker.model;

import lombok.Data;

@Data
public class Anagrafica {

    private String matricolaINPS;

    /** The natura giuridica. */
    private String naturaGiuridica;

    /** The denominazione. */
    private String denominazione;

    /** The settore attivita economica. */
    private String settoreAttivitaEconomica;

    /** The indirizzo. */
    private Indirizzo indirizzo;
}
