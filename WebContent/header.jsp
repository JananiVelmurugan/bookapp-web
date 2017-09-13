<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css">

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.jsp">Online Book Store</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="<%=request.getContextPath()%>/ListBookServlet">List
					Books</a></li>
			<li><a href="addbook.jsp">Add Book</a></li>
			<li><a href="editbook.jsp">Edit Book</a></li>
			<li><a href="deletebook.jsp">Delete Book</a></li>
		</ul>
	</div>
</nav>