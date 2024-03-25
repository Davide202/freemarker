package com.test.freemarker.model;

import lombok.Data;

@Data
public class Indirizzo {

    private String via;
    private String CAP;
    private String comune;
    private String provincia;

    public Indirizzo() {
        via = "rrr";
        CAP = "eee";
        comune = "ygafy";
        provincia = "dfd";
    }
}
