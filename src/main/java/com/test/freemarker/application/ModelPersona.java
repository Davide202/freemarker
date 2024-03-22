package com.test.freemarker.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelPersona {

    private String nome;
    private String cognome;

    public static List<ModelPersona> getTestList(){
        List<ModelPersona> persone = new ArrayList<>();
        persone.add(new ModelPersona("davide","dinnocente"));
        persone.add(new ModelPersona("marco","barcellona"));
        persone.add(new ModelPersona("venanzio","figliolino"));
        persone.add(new ModelPersona("pietro","santurelli"));
        return persone;
    }
}
