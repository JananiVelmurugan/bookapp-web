package com.janani.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.janani.model.Book;
import com.janani.util.ConnectionUtil;

public class BookDAO {
	public void save(Book book) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "insert into books(name,author_name,price) values (?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, book.getName());
		pst.setString(2, book.getAuthorName());
		pst.setFloat(3, book.getPrice());
		int row = pst.executeUpdate();
		System.out.println(row + "Book added successfully");
	}

	public void update(Book book) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "update books set name=?,author_name=?,price=? where id=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, book.getName());
		pst.setString(2, book.getAuthorName());
		pst.setFloat(3, book.getPrice());
		pst.setInt(4, book.getId());
		int row = pst.executeUpdate();
		System.out.println(row + "Book updated successfully");
	}

	public void delete(int id) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "delete from books where id=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		int row = pst.executeUpdate();
		System.out.println(row + "Book deleted successfully");
	}

	public Book findById(int id) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select id,name,author_name,price,published_date from books where id=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		Book book = null;
		if (rs.next()) {
			String name = rs.getString("name");
			String authorName = rs.getString("author_name");
			float price = rs.getFloat("price");
			LocalDateTime publishedDate = rs.getTimestamp("published_date").toLocalDateTime();
			book = new Book();
			book.setId(id);
			book.setName(name);
			book.setPrice(price);
			book.setAuthorName(authorName);
			book.setPublishedDate(publishedDate);
		}
		return book;
	}

	public List<Book> findAll() throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select id,name,author_name,price,published_date from books";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		List<Book> bookList = new ArrayList<Book>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String authorName = rs.getString("author_name");
			float price = rs.getFloat("price");
			LocalDateTime publishedDate = rs.getTimestamp("published_date").toLocalDateTime();
			Book book = new Book();
			book.setId(id);
			book.setName(name);
			book.setPrice(price);
			book.setAuthorName(authorName);
			book.setPublishedDate(publishedDate);
			bookList.add(book);
		}
		return bookList;
	}
}
