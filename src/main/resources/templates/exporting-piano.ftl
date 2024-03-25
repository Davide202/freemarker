<!DOCTYPE html>
<html>
<head>
<style>
.page
{
    position: relative;
    border: solid red 1px;
    background: white;
    width: 21cm;
    height: 27cm;
    display: block;
  /* margin: 0 auto; */
}
.header
{
    position: absolute;
    top: 0;
    left: 0;
    right: 100px;
}
.footer
{
    position: absolute;
    bottom: 0;
    left: 0;
    right: 100px;
}
</style>
</head>
<body>
    <p>
    <#include "fragments/exp-piano.ftl">
    </p>
</body>
</html>