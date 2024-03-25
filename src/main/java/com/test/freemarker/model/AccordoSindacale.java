package com.test.freemarker.model;

import lombok.Data;

@Data
public class AccordoSindacale {

    private int id;

    /** The descrizione. */
    private String descrizione;

    /** The data. */
    private java.util.Date data;

    /** The codice fiscale azienda. */
    private String codiceFiscaleAzienda;

    /** The id azienda aggregante. */
    private int idAziendaAggregante;

    /** The provincia. */
//    private Provincia provincia;

    /** The allegati. */
    private String[] allegati;

    /** The firmatari. */
    private FirmatarioAccordo[] firmatari;

    /** The approvato. */
    private Boolean approvato;

    /** The storica. */
    private InfoStorica storica;

    /**
     * Instantiates a new accordo sindacale.
     */
    public AccordoSindacale() {
        id = 0;
        descrizione = "";
        codiceFiscaleAzienda = "";
        idAziendaAggregante = 0;
        allegati = new String[0];
        firmatari = new FirmatarioAccordo[0];
        approvato = null;
        storica = new InfoStorica();
    }

}
