<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list books</title>
</head>
<body>
	<jsp:include page="layout/header.jsp"></jsp:include>

	<div class="container">
		<h3>List of Books</h3>
		<table border="1" id="booktable" class="table bordered">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Author Name</th>
					<th>Price</th>
					<th>Published Date</th>
					<th>Action</th>
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
						<td><a
							href="<%=request.getContextPath()%>/EditBookServlet?id=${book.id}"
							class="fa fa-pencil" data-toggle="tooltip" data-placement="top"
							aria-hidden="true" title="edit"></a> <a
							href="<%=request.getContextPath()%>/DeleteBookServlet?id=${book.id}"
							class="fa fa-times" aria-hidden="true" data-toggle="tooltip"
							data-placement="top" title="remove"> </a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>