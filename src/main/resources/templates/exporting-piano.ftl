<!DOCTYPE html>
<html>
<head>
<style>
.cover
{
    width: 21cm;
    height: 27cm;
    display: block;
    border: solid red 1px;
}
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

.s1
{
    color: black;
    font-family: sans-serif;
    font-style: normal;
    font-weight: bold;
    text-decoration: none;
    font-size: 16pt;
}

</style>
</head>
<body>
    <p>
    <#include "fragments/exp-piano.ftl">
    </p>
</body>
</html>