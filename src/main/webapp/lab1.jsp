<%-- 
    Document   : lab1
    Created on : Sep 12, 2017, 8:35:00 PM
    Author     : Aruni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculators</title>
    </head>
    <body>
        <h1>Area of a Rectangle</h1>
        <img src="rectangle.gif">
        
        <form name="rectangleForm" id="rectangleForm" method="POST" action="calculatorController?calcType=rectangle&labNo=lab1">
            Enter width: <input type="text" value="" name="width">
            <br>
            Enter height: <input type="text" value="" name="height">
            <br>
            <input type="submit" name= "submit" value="Calculate Area"> 
        </form>
    </body>
</html>
