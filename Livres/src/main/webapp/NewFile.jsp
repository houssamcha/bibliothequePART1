<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion library</title>
<link rel="stylesheet" type="text/css" href="Css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="Css/style.css">
</head>
<body>
<div class="container">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="ajouter.java">Ajouter</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="home.java">Home</a>
      </li>
    <form action="chercher.java" method="get" class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Chercher" name="motCle" value="${model.motCle}">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Chercher</button>
    </form>
  </div>
</nav>
<table class="table table-dark">
    <tr>
      <th>ID livre</th>
      <th>Titre</th>
      <th>Auteur</th>
      <th>Editeur</th>
      <th>Annee de publication</th>
    </tr>
    <c:forEach items="${Livre.stringList}" var="L">
     <tr>
        <td>${L.id_livre}</td>
        <td>${L.titre}</td>
        <td>${L.auteur}</td>
        <td>${L.editeur}</td>
        <td>${L.annee_publication}</td>
     </tr>
    </c:forEach>
</table>
</div>
</body>
</html>