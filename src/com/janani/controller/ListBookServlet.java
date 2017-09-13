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
 * Servlet implementation class ListBookServlet
 */
@WebServlet("/ListBookServlet")
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookDAO dao = new BookDAO();
		try {
			List<Book> bookList = dao.findAll();
			request.setAttribute("BOOKLIST", bookList);
			RequestDispatcher rd = request.getRequestDispatcher("listbooks.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
