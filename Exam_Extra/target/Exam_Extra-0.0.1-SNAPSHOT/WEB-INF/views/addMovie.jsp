<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Movies</title>
</head>
<body>
	<section class="container">
		<form:form modelAttribute="movieAdd" action="movie" method="post">
			<fieldset>
				<legend>Add new movie</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div" />
				
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="id"> Id</label>
					<div class="col-lg-10">
						<form:input id="id" path="id" type="text" class="form:input-large" />
						<form:errors path="id" cssClass="text-danger" />
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-lg-2" for="title">Title </label>
					<div class="col-lg-10">
						<form:input id="title" path="title" type="text"
							class="form:input-large" />
						<form:errors path="title" cssClass="text-danger" />
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-lg-2" for="genre">Genre</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="genre" path="genre" type="text"
								class="form:input-large" />
							<form:errors path="genre" cssClass="text-danger" />
						</div>
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-lg-2" for="age">Year</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="year" path="year" type="text"
								class="form:input-large" />
							<form:errors path="year" cssClass="text-danger" />
						</div>
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-lg-2" for="rating">Rating</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="rating" path="rating" type="text"
								class="form:input-large" />
							<form:errors path="rating" cssClass="text-danger" />
						</div>
					</div>
				</div>
				

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Add" />
					</div>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>
