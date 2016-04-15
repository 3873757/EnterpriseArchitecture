<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<p>List will  displayed here </p>

<table>
	<c:forEach var="movie" items="${movies}">
	<tr>
		<td>${movie.title}</td>
		<td>${movie.genre}</td>
		<td>${movie.year}</td>
		<td>${movie.rating}</td>
		<td><a href="movies/${movie.id}">edit</a></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>