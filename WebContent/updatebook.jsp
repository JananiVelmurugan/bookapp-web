<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update book</title>
</head>
<body>
	<jsp:include page="layout/header.jsp"></jsp:include>
	<div class="container">
		<h3>Edit Book</h3>
		<form action="UpdateBookServlet" method="post">
			<div class="form-group row">
				<label for="id" class="col-2 col-form-label">Book Id</label>
				<div class="col-5">
					<input class="form-control" type="text" id="id" name="id"
						value="${BOOK.id}" readonly />
				</div>
			</div>
			<div class="form-group row">
				<label for="name" class="col-2 col-form-label">Book Name</label>
				<div class="col-5">
					<input class="form-control" type="text" id="name" name="name"
						value="${BOOK.name}" required autofocus />
				</div>
			</div>
			<div class="form-group row">
				<label for="author_name" class="col-2 col-form-label">Author
					Name</label>
				<div class="col-5">
					<input class="form-control" type="text" id="author_name"
						name="author_name" value="${BOOK.authorName}" required />
				</div>
			</div>
			<div class="form-group row">
				<label for="price" class="col-2 col-form-label">Book Price</label>
				<div class="col-5">
					<input class="form-control" type="text" id="price" name="price"
						value="${BOOK.price}" min="1" required />
				</div>
			</div>
			<div class="form-group row">
				<label for="published_date" class="col-2 col-form-label">Book
					Published Date</label>
				<div class="col-5">
					<input class="form-control" type="text" id="published_date"
						name="published_date" value="${BOOK.publishedDate}" readonly />
				</div>
			</div>
			<div class="form-group row">
				<div class="col-5">
					<input class="form-control-lg btn btn-primary" type="submit"
						value="Update">
				</div>
			</div>
		</form>
	</div>
</body>
</html>