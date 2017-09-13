<%@page import="com.janani.model.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list books</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="//cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
<script>
	$(document).ready(function() {
		$('#booktable').DataTable();
	});
</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<table border="1" id="booktable" class="table bordered">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Author Name</th>
					<th>Price</th>
					<th>Published Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${BOOKLIST}">
					<tr>
						<td>${book.id}</td>
						<td>${book.name}</td>
						<td>${book.authorName}</td>
						<td>${book.price}</td>
						<td>${book.publishedDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
	</div>
</body>
</html>