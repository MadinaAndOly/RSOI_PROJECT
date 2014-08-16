<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="utf-8">
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="navbar">
  <div class="navbar-inner">
    <c:if test="${user != null}">   
   <ul class="nav">
      <li class="active"><a href="index.jsp">Домой</a></li>
    </ul>
    </c:if>
  </div>
</div>
	<div class="container">
		<div class="hero-unit">
			<h1>${errorMsg}</h1>
		</div>
	</div>
</body>
</html>
