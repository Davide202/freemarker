package com.test.freemarker.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UnitaProduttivaCoinvolta {

    private String codiceFiscale;

    /** The matricola INPS. */
    private String matricolaINPS;

    /** The denominazione. */
    private String denominazione;

    /** The indirizzo. */
    private Indirizzo indirizzo;

    /** The organico. */
    private Organico organico;

    /** The storica. */
    InfoStorica storica;

    /** The id unita produttiva UPC. */
    private int idUnitaProduttivaUPC;

    /** The id azienda. */
    private int idAzienda;

    /** The stato presentazione. */
    private int statoPresentazione;

    /** The stato monitoraggio. */
    private int statoMonitoraggio;

    /** The stato adesione. */
    //AC MEV385
    private int statoAdesione;

    /** The stato abilitazione. */
    private int statoAbilitazione;

    /** The desc stato adesione. */
    private String descStatoAdesione;

    /** The desc stato abilitazione. */
    private String descStatoAbilitazione;

    /** The stato risorse. */
    private int statoRisorse;

    /** The saldo disponibile. */
    private BigDecimal saldoDisponibile;

    /** The spesa up. */
    private BigDecimal spesaUp;

    /** The deleted. */
    private boolean deleted;

    /** The matricola INPS accentrante. */
    //AC MEV659
    private String matricolaINPSAccentrante;

    //AP MAD 1159 START
    /** The rappresentante sindacale. */
    private boolean rappresentanteSindacale;
    //AP MAD 1159 END

    /**
     * Instantiates a new unita produttiva coinvolta.
     */
    public UnitaProduttivaCoinvolta() {
        codiceFiscale = "";
        matricolaINPS = "";
        denominazione = "";
        indirizzo = null;
        organico = null;
        storica = new InfoStorica();
        idUnitaProduttivaUPC = 0;
        idAzienda = 0;
        statoPresentazione = 0;
        statoMonitoraggio = 0;
        deleted = false;
    }

}
