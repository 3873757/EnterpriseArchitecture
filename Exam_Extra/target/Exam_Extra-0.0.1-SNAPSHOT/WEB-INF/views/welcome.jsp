<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>

	<div class="jumbotron">
		<div class="container">
			<a href="<spring:url value='addMovie' />" class="btn btn-default">
				<span class="glyphicon-hand-left glyphicon"></span> Goto movie site
			</a>
		</div>
	</div>

<p>Hello Movie Lovers</p>
</body>
</html>
