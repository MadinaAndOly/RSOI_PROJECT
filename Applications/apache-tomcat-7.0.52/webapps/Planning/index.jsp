<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hellllllllllllo</title>
  </head>
  <body>


  <FORM action="stateprogdoc">

      <c:if not empty="${items}">
          <table>
              <c:forEach items="${items}" var="item">
                  <tr>
                      <td>${item.id}</td>
                      <td>${item.caption}</td>
                  </tr>
              </c:forEach>
          </table>
      </c:if>

  </FORM>
  </body>
</html>