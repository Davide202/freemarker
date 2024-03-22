<!DOCTYPE html>
<html>
<body>

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

    <div>${html}</div>

    <a href="https://freemarker.apache.org/docs/dgui_quickstart_template.html">Documentation</a>
</body>
</html>