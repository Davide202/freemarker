package com.test.freemarker.model;

import lombok.Data;

@Data
public class DimensionePiano {
    private Integer numeroUnitaOrganizzative;

    /** The numero unita organizzative monit. */
    private Integer numeroUnitaOrganizzativeMonit;

    /** The numero regioni. */
    private Integer numeroRegioni;

    /** The numero lavoratori. */
    private Integer numeroLavoratori;

    /** The numero operai. */
    private Integer numeroOperai;

    /** The numero impiegati. */
    private Integer numeroImpiegati;

    /** The numero quadri. */
    private Integer numeroQuadri;

    /** The monte ore allievo. */
    private String monteOreAllievo;

    /** The numero ore totali. */
    private String numeroOreTotali;

    /** The lista regioni coinvolte. */
    private String listaRegioniCoinvolte;

    /** The storica. */
    private InfoStorica storica;

    /** The numero operai cocopro. */
    private Integer numeroOperaiCocopro;

    /** The numero operai apprendisti. */
    private Integer numeroOperaiApprendisti;

    /** The numero operai sospesi. */
    private Integer numeroOperaiSospesi;

    /** The numero operai altro. */
    private Integer numeroOperaiAltro;

    /** The numero impiegati cocopro. */
    private Integer numeroImpiegatiCocopro;

    /** The numero impiegati apprendisti. */
    private Integer numeroImpiegatiApprendisti;

    /** The numero impiegati sospesi. */
    private Integer numeroImpiegatiSospesi;

    /** The numero impiegati altro. */
    private Integer numeroImpiegatiAltro;

    /** The numero quadri cocopro. */
    private Integer numeroQuadriCocopro;

    /** The numero quadri apprendisti. */
    private Integer numeroQuadriApprendisti;

    /** The numero quadri sospesi. */
    private Integer numeroQuadriSospesi;

    /** The numero quadri altro. */
    private Integer numeroQuadriAltro;

    /** The id piano. */
    private Integer idPiano;

    /** The monte ore allievo min. */
    private Integer monteOreAllievoMin;

    /** The num ore totali min. */
    private Integer numOreTotaliMin;


    /**
     * Instantiates a new dimensione piano.
     */
    public DimensionePiano() {

        numeroUnitaOrganizzative = 0;
        numeroRegioni = 0;
        numeroLavoratori = 0;
        numeroOperai = 0;
        numeroImpiegati = 0;
        numeroQuadri = 0;
        monteOreAllievo = "";
        numeroOreTotali = "";
        idPiano=0;
        listaRegioniCoinvolte="";
        numeroUnitaOrganizzativeMonit=0;
        numeroOperaiCocopro= 0;
        numeroOperaiApprendisti= 0;
        numeroOperaiSospesi= 0;
        numeroOperaiAltro= 0;
        numeroImpiegatiCocopro= 0;
        numeroImpiegatiApprendisti= 0;
        numeroImpiegatiSospesi= 0;
        numeroImpiegatiAltro= 0;
        numeroQuadriCocopro= 0;
        numeroQuadriApprendisti= 0;
        numeroQuadriSospesi= 0;
        numeroQuadriAltro= 0;
        storica = new InfoStorica();
    }
}
