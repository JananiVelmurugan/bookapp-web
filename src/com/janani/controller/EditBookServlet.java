package com.janani.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.janani.dao.BookDAO;
import com.janani.model.Book;

/**
 * Servlet implementation class EditBookServlet
 */
@WebServlet("/EditBookServlet")
public class EditBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		BookDAO dao = new BookDAO();
		try {
			Book book = dao.findById(id);
			request.setAttribute("BOOK", book);
			RequestDispatcher rd = request.getRequestDispatcher("updatebook.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
