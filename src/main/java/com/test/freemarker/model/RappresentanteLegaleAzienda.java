package com.test.freemarker.model;

import lombok.Data;

@Data
public class RappresentanteLegaleAzienda {

    private String codiceFiscaleAzienda = "DDDDDDDDDDDDDDDDDDDD";

    /** The nome. */
    private String nome = "NOME";

    /** The cognome. */
    private String cognome = "COGNOME";

    /** The telefono. */
    private String telefono = "3331234567";

    /** The email. */
    private String email = "TEST@MAIL.COM";
}
