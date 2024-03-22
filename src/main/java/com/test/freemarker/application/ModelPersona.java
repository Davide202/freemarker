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

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }


    public static List<ModelPersona> getTestList(){
        List<ModelPersona> list = new ArrayList<>();
        list.add(new ModelPersona("davide","dinnocente"));
        list.add(new ModelPersona("marco","barcellona"));
        list.add(new ModelPersona("venanzio","figliolino"));
        list.add(new ModelPersona("pietro","santurelli"));
        return list;
    }
}
