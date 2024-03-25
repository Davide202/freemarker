package com.test.freemarker.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

@Data
public class AzioneFormativa {
    private int id;

    /** The rimodulazione. */
    private int rimodulazione;

    /** The ore allievo. */
    private String oreAllievo;

    /** The titolo. */
    private String titolo;

    /** The obiettivi. */
    private String obiettivi;

    /** The data validazione. */
    private Date dataValidazione;

    /** The settore intervento. */
    private MinimalBean settoreIntervento;

    /** The numero lavoratori. */
    private int numeroLavoratori;

    /** The certificazione competenze. */
    private String certificazioneCompetenze;

    /** The livello. */
    private MinimalBean livello;

    /** The tipologie progetto. */
    private MinimalBean[] tipologieProgetto;

    /** The collocazione temporale. */
    private MinimalBean collocazioneTemporale;

    /** The stato. */
    private ClasseStatoAzione stato;

    /** The voucher. */
    private boolean voucher;

    /** The presenza certificazione competenze. */
    private boolean presenzaCertificazioneCompetenze;

    /** The calendario voucher. */
    private String calendarioVoucher;

    /** The fornitori. */
    private Fornitore[] fornitori;

    /** The territorio interessato. */
//    private Provincia territorioInteressato;

    /** The finalita. */
    private MinimalBean finalita;

    /** The tematiche formative. */
    private MinimalBean[] tematicheFormative;

    /** The altro tematiche. */
    private MinimalBean[] altroTematiche;

    /** The modalita formative. */
    private ModalitaFormativa[] modalitaFormative;

    /** The partecipanti azione. */
//    private Partecipante[] partecipantiAzione;

    /** The partecipanti effettivi. */
    private Integer partecipantiEffettivi;

    /** The perc frequenza. */
    private BigDecimal percFrequenza;

    /** The tipo certificazione esiti. */
    private MinimalBean tipoCertificazioneEsiti;

    /** The Constant A_DISTANZA. */
    // SR 292.4.3
    public final static int A_DISTANZA = 1;

    /** The Constant IN_AULA. */
    public final static int IN_AULA = 2;

    /** The Constant A_DISTANZA_E_IN_AULA. */
    public final static int A_DISTANZA_E_IN_AULA = 3;
    // SR 292.4.3

    /** The lista azioni. */
    private String listaAzioni;

    /** The calendario azioni. */
//    private CalendarioAzioni calendarioAzioni;

    /** The tot azioni voucher. */
    private int totAzioniVoucher;

    /** The storica. */
    private InfoStorica storica;

    /** The id corso. */
    //CP MEV 600
    private BigDecimal idCorso; // id che posso leggere in FPF_AZIONE_FORMATIVA

    /** The mostra rosso. */
    private boolean mostraRosso;

    /** The codice corso. */
    private int codiceCorso; // codice di 9 cifre

    /** The part azione azienda. */
//    private Collection<PartecipantiAzionePerAzienda> partAzioneAzienda;
//
//    /** The part azione azienda array. */
//    private PartecipantiAzionePerAzienda[] partAzioneAziendaArray;

    /** The deleghe annullate. */
    //LA MEV 600
    private Collection<String> delegheAnnullate;

    /** The partner annullati. */
    private Collection<String> partnerAnnullati;

    //GC MEV 1130
    /** The provenienzaPSP. */
    private boolean provenienzaPSP;

    //AN.CH. MEV 1315
    /** The aziende coinvolte. */
//    private List<AziendaBeneficiariaResult> aziendeCoinvolte;

    /**
     * AN.CH. MEV 1250
     * Aggiunto per avere lo stato della progettazione dell'azione nella ricerca delle azioni
     * dalla pagina elenco progettazioni
     * The stato progettazione.
     * */
    private MinimalBean statoProgettazione;

    /**
     * AN.CH. MEV 1250
     * Aggiunto per avere lo stato della progettazione dell'azione nella ricerca delle azioni
     * dalla pagina elenco progettazioni
     * The id progettazione. */
    private int idProgettazione;

    /**CP MEV 1325 The id percorso formativo. */
    private int idPercorsoFormativo;

    /**AN.CH. MEV 1336 The lavoratori cassintegrati. */
    private Boolean lavoratoriCassintegrati;


    public AzioneFormativa() {
        id = 0;
        rimodulazione = 0;
        oreAllievo = "";
        obiettivi = "";
        numeroLavoratori = 0;
        voucher = false;
        presenzaCertificazioneCompetenze = false;
        tematicheFormative = new MinimalBean[0];
        modalitaFormative = new ModalitaFormativa[0];
        fornitori = new Fornitore[0];
//        partecipantiAzione = new Partecipante[0];
        titolo = "";
        certificazioneCompetenze = "";
        calendarioVoucher = "";
        collocazioneTemporale = null;
        stato = null;
        altroTematiche = new MinimalBean[0];
        listaAzioni = "";
        partecipantiEffettivi = null;
        percFrequenza = null;
//        calendarioAzioni = new CalendarioAzioni();
        storica = new InfoStorica();
        tipoCertificazioneEsiti = null;
        tipologieProgetto = new MinimalBean[0];
    }



    @Data
    public class ClasseStatoAzione extends MinimalBean {
        private boolean aziendale;
    }
}
