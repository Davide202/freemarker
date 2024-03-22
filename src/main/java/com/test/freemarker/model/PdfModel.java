package com.test.freemarker.model;


import lombok.Data;

import java.util.List;

@Data
public class PdfModel {

    private String title = "Il mio titolo preferito";
    private String html = "<b style='color:red;'><i>Il mio nome &#233; Nessuno</i></b>";
    private List<ModelPersona> persone = ModelPersona.getTestList();
}
