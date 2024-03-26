<#assign pageNumber=0>


<!-- COVER -->
<div class="page">
    <div style="position: absolute; top: 0px; left: 0px;  right: 100px; border: solid blue 2px;">
        <#include "exp-piano-cover.ftl">
    </div>
</div>


<!-- PAGE 1 -->
<div class="page" >
    <#assign pageNumber=pageNumber+1>

    <div class="header" style=" border: solid green 2px;">
        <#include "exp-piano-header.ftl">
    </div>

    <div style="position: absolute; top: 80px; left: 0px;  right: 100px; border: solid blue 2px;">
        Contenuto Pagina ${pageNumber} <br>
        <#include "autocertificazione-loop.ftl">
    </div>

    <div class="footer" style=" border: solid yellow 2px;">
        <#include "exp-piano-footer.ftl">
    </div>

</div>

<!-- PAGE 2 -->
<div class="page" >
    <#assign pageNumber=pageNumber+1>

    <div class="header" style=" border: solid green 2px;">
        <#include "exp-piano-header.ftl">
    </div>

    <div style="position: absolute; top: 80px; left: 0px;   right: 100px; border: solid blue 2px;"> Contenuto Pagina ${pageNumber} </div>

    <div class="footer" style=" border: solid yellow 2px;">
        <#include "exp-piano-footer.ftl">
    </div>

</div>

