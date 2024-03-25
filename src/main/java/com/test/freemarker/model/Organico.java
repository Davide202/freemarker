package com.test.freemarker.model;

import lombok.Data;

@Data
public class Organico {

    private int idUnitaProduttiva;

    /** The codice fiscale. */
    private String codiceFiscale;

    /** The matricola INPS. */
    private String matricolaINPS;

    /** The operai uomini. */
    private int operaiUomini;

    /** The operai donne. */
    private int operaiDonne;

    /** The impiegati uomini. */
    private int impiegatiUomini;

    /** The impiegati donne. */
    private int impiegatiDonne;

    /** The quadri uomini. */
    private int quadriUomini;

    /** The quadri donne. */
    private int quadriDonne;

    /** The dirigenti uomini. */
    private int dirigentiUomini;

    /** The dirigenti donne. */
    private int dirigentiDonne;

    /** The totale operai. */
    private int totaleOperai;

    /** The totale impiegati. */
    private int totaleImpiegati;

    /** The totale quadri. */
    private int totaleQuadri;

    /** The totale dirigenti. */
    private int totaleDirigenti;

    /** The totale uomini. */
    private int totaleUomini;

    /** The totale donne. */
    private int totaleDonne;

    /** The dipendenti adesioni INPS. */
    private int dipendentiAdesioniINPS;

    /** The totale. */
    private int totale;

    /** The totale effettivo. */
    private int totaleEffettivo;

    /** The tipo. */
    private MinimalBean tipo;
}
