package com.test.freemarker.model;

import lombok.Data;

@Data
public class ModalitaFormativa {

    private int id;

    /** The descrizione. */
    private String descrizione;
    private String oreCorso;

    /** The aziendale. */
    private boolean aziendale;

    /** The tipo. */
    private int tipo;

    //LI MEV 1235
    /** The distanza. */
    private Boolean distanzaSincrona;

    /** The abilita distanza sincrona. */
    private boolean abilitaDistanzaSincrona;

    //AN.CH. MEV 1235
    /** The descrizione distanza sincrona. */
    private String descrizioneDistanzaSincrona;
}
