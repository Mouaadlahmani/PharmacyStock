<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PharmacyStock</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container">
<nav class="navbar navbar-dark bg-dark">
  <form action="chercher.do" method="get">
	<input type="text" placeholder="Chercher" name="motCle"/>
	<button type="submit" class="btn btn-outline-success">Chercher</button>
</form>
</nav>
<table class="table table-dark">
    <tr>
      <th>id</th>
      <th>Name</th>
      <th>Quantity</th>
      <th>Price</th>
    </tr>
    <c:forEach items="${model.products}" var="p">
     <tr>
	    <td>${p.id}</td>
	    <td>${p.name}</td>
	    <td>${p.quantity}</td>
	    <td>${p.price}</td>
     </tr>
    </c:forEach>
</table>
</div>
</body>
</html>