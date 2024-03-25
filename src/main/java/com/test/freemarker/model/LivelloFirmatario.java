package com.test.freemarker.model;

import lombok.Data;

@Data
public class LivelloFirmatario {

    private int id;

    /** The organizzazione firmatario. */
    private OrganizzazioneFirmatario organizzazioneFirmatario;

    /** The descrizione. */
    private String descrizione;

    /**
     * Instantiates a new livello firmatario.
     */
    public LivelloFirmatario() {
        id = 0;
        organizzazioneFirmatario = new OrganizzazioneFirmatario();
        descrizione = "";

    }

    @Data
    public class OrganizzazioneFirmatario {

        private static final long serialVersionUID = -4133510395367700044L;
        private int id;
        private String descrizione;
        public OrganizzazioneFirmatario() {
            id = 0;
            descrizione = "";
        }
    }
}
