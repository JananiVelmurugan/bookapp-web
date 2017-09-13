package com.janani.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.janani.dao.BookDAO;
import com.janani.model.Book;

/**
 * Servlet implementation class SaveBookServlet
 */
@WebServlet("/SaveBookServlet")
public class SaveBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String authorName = request.getParameter("author_name");
		System.out.println(request.getParameter("price"));
		float price = Float.parseFloat(request.getParameter("price"));
		Book book = new Book();
		book.setName(name);
		book.setAuthorName(authorName);
		book.setPrice(price);
		BookDAO dao = new BookDAO();
		try {
			dao.save(book);
			List<Book> bookList = dao.findAll();
			request.setAttribute("BOOKLIST", bookList);
			RequestDispatcher rd = request.getRequestDispatcher("listbooks.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
