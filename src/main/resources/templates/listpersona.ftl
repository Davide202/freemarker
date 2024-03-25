<!DOCTYPE html>
<html>
<head>
    <title>
        How to Append HTML Code to
        a Div using Javascript?
    </title>

    <style>


        h1 {
            color: green;
        }

        .page
        {
          background: white;
          width: 21cm;
          height: 27cm;
          display: block;
          margin: 0 auto;

        }


    </style>
</head>
<body>

    <div class="page"> Pagina 1

    <p> paragraph 1 </p>
    </div>

    <div class="page"> Pagina 2 </div>
    <#include "testinclude.ftl">
    <div class="page"> Pagina 3 </div>


    <!-- commento -->
    <h6>Dashboard page</h6>

    <div>${title}</div>

    <div>Titolo vuoto <#if titlee?? >${titlee}<#else>EMPTY</#if> </div>
    <#if titlee?? ><div>Titolo vuoto ${titlee} </div><#else><span>EMPTY</span></#if>

    <div>Titolo vuoto ${titlee!'default value'}</div>

    <p> La mia prima Tabella </p>

    <div>
        <table>
            <thead>
            <td>Nome</td>
            <td>Cognome</td>
            </thead>
            <tbody>
                <#list persone as p>
                    <tr>
                        <td>${p.nome}</td>
                        <td>${p.cognome}</td>
                    </tr>
                </#list>
                <tr>
                    <td>---</td>
                    <td>---</td>
                </tr>
                <#list persone >
                   <#items as p>
                     <tr>
                         <td>${p.nome}</td>
                         <td>${p.cognome}</td>
                     </tr>
                   </#items>
                </#list>
            </tbody>
        </table>
    </div>
<div id="add_to_me">
        <h1>GeeksforGeeks</h1>
        <p>
            This is the text which has
            already been typed into
            the div
        </p>
    </div>



    <script>
    const collection = document.getElementsByClassName("page");
        for (let i = 0; i < collection.length; i++) {
          collection[i].innerHTML +=
           "<h3> This is the text which has been inserted by JS </h3>";
        }

            document.getElementById("add_to_me")
                .innerHTML +=
                `<h3>
                    This is the text which has
                    been inserted by JS
                </h3>`;

    </script>

    <div>${html}</div>

    <a href="https://freemarker.apache.org/docs/dgui_quickstart_template.html">Documentation</a>
</body>
</html>