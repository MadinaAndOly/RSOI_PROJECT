<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hellllllllllllo</title>
  </head>
  <body>
  <jsp:useBean id="gc" class="java.util.GregorianCalendar"/>

  <jsp:getProperty name="gc" property="time"/>

  <FORM action="stateprogdoc" method="LOAD">

      <INPUT type="submit" value="Вызвать сервлет">

  </FORM>
  </body>
</html>