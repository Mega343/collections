<%@ page import="com.goit.gojavaonline.collections.Calculate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: артур
  Date: 29.05.2016
  Time: 1:55
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Онлайн калькулятор</title>
</head>
<body BGCOLOR="#ffffcc">
<center>
    <h2>Сравнение эффективности коллекций</h2>
    <form action="CalculateServlet">

        <fieldset style="border:1px #00BFFF solid;" >

            <p>  Введите количество элементов в коллекции: <input type="text" name="n" size=26>

                <input type="submit" value="Расчитать">
            <p style="color:red"> Внимание! Расчет проводится в реальном времени и может занять продолжительное время. </p>
            </p>
        </fieldset>
    </form>
</center>

</body>
</html>
