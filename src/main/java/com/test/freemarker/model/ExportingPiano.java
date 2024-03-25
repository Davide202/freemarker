package com.test.freemarker.model;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class ExportingPiano {


    private int id = 123456;

    /** The descrizione. */
    private String descrizione = "Formazione sicurezza 2019 - Rosenheimer Fenstertage - Rubner Tueren Srl";

    /** The interaziendale. */
    private boolean interaziendale;

    /** The contributo concesso. */
    private boolean contributoConcesso = true;

    /** The date piano. */
    private DatiProcessiPiano datePiano = new DatiProcessiPiano();

    /** The rappresentante legale. */
    private RappresentanteLegaleAzienda rappresentanteLegale;

    /** The azienda aggregante. */
    private ExportingAzienda aziendaAggregante;

    /** The aziende aggregate. */
    private ExportingAzienda[] aziendeAggregate;

    /** The referenti. */
    private ReferentePiano[] referenti;

    /** The aree intervento. */
    private MinimalBean[] areeIntervento;

    /** The motivazioni. */
    private String motivazioni;

    /** The obiettivi. */
    private String obiettivi;

    /** The data avvio. */
    private Date dataAvvio;

    /** The data conclusione. */
    private Date dataConclusione;

    /** The dimensione. */
    private DimensionePiano dimensione;

    /** The regioni coinvolte. */
    // nomi delle regioni
    private String[] regioniCoinvolte;

    /** The unita produttive coinvolte. */
    // denominazione delle unita produttive
    private UnitaProduttivaCoinvolta[] unitaProduttiveCoinvolte;

    /** The accordo sindacale. */
    private AccordoSindacale accordoSindacale;

    /** The nuovo accordo. */
    private boolean nuovoAccordo;

    /** The azioni formative. */
    private AzioneFormativa[] azioniFormative;

    /** The totale azioni complessive. */
    private String totaleAzioniComplessive;

    /** The totale ore corso. */
    private String totaleOreCorso;

    /** The assetto organizzativo. */
    private MinimalBean assettoOrganizzativo;

    /** The descrizione assetto organizzativo. */
    private String descrizioneAssettoOrganizzativo;

    /** The preventivo. */
//    private Preventivo preventivo;
//
//    /** The monitoraggio. */
//    private ExportingMonitoraggioPiano monitoraggio;
//
//    /** The rendicontazione. */
//    private ExportingRendicontazionePiano rendicontazione;

    /** The tipo piano. */
    private String tipoPiano = "Piano Formativo Speciale" ;

    /** The tipologia piani avviso. */
    private String tipologiaPianiAvviso = "TipologiaPianiAvvisoSpec";

    /** The has contributo aggiuntivo. */
    private boolean hasContributoAggiuntivo;

    /** The proroghe. */
//    private Proroga[] proroghe;
//
//    /** The finalita. */
//    private FinalitaPianoContoFormazione[] finalita;

    /** The data estrazione. */
    private String dataEstrazione  = new Date().toString();

    /** The data avvio anticipato. */
    private Date dataAvvioAnticipato;

    /** The codice avviso. */
    private String codiceAvviso;

    /** The verifica rendicontazione. */
    private boolean verificaRendicontazione;

    /** The quadro riepilogativo. */
//    private RiepilogoMonitoraggioControllo quadroRiepilogativo;
//
//    /** The totale azioni. */
//    private RiepilogoAzione totaleAzioni;

    /** The piano attivato da ente formativo. */
    private boolean pianoAttivatoDaEnteFormativo = true;

    /** The data erogazione anticipo. */
    //MEV385 aggiunta date per richiesta anticipo
    private Date dataErogazioneAnticipo;

    /** The data annullamento anticipo. */
    private Date dataAnnullamentoAnticipo;

    /** The azione catalogo. */
    //CP MEV 600
    private boolean azioneCatalogo; // per visualizzare diciture sul voucher o meno

    /** The flag doc identita formulario. */
    private boolean flagDocIdentitaFormulario;

    /**CP MEV 1325 The piano su avviso anpal FNC. */
    private boolean pianoSuAvvisoAnpalFNC;

    //LI MEV 1375 - stream per passare l'informativa
    /** The stream. */
    private byte[] streamInformativaPrivacyFinePDF = null;

    /**
     * stream informativa privacy partecipanti
     */
    private byte[] streamInformativaPrivacyPartecipantiPDF = null;

    private String totaleOreRealizzateEffettive;

    /**
     * Instantiates a new exporting piano.
     */
    public ExportingPiano() {
        aziendaAggregante = null;
        aziendeAggregate = null;
        rappresentanteLegale = null;
        referenti = null;
        motivazioni = null;
        obiettivi = null;
        dataAvvio = null;
        dataConclusione = null;
        areeIntervento = null;
        dimensione = null;
        regioniCoinvolte = null;
        unitaProduttiveCoinvolte = null;
        accordoSindacale = null;
        nuovoAccordo = false;
        azioniFormative = null;
        totaleOreCorso = null;
        descrizioneAssettoOrganizzativo = null;
        assettoOrganizzativo = null;
//        preventivo = null;
//        monitoraggio = null;
//        rendicontazione = null;
//        proroghe = null;
        totaleAzioniComplessive = null;
//        finalita = null;
        dataEstrazione = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        dataAvvioAnticipato = null;
        codiceAvviso = null;
        totaleOreRealizzateEffettive = "";
        flagDocIdentitaFormulario = false;
    }

}
