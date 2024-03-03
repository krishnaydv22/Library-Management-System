package com.jsp.LMS.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.LMS.view.View;

import co.jsp.LMS.model.Book;
import co.jsp.LMS.model.Library;

public class Controller {
	private Library library = View.getLibrary();
	
	public void addBook(Book book) {
		List<Book> books = library.getBooks();
		if(books == null) {
			books = new ArrayList<Book>();
		}
		books.add(book);
		library.setBooks(books);
		}
	
	public Book getBook(String bookName) {
		List<Book> books = library.getBooks();
		
		if(books != null) {
			for (Book book : books) {
				if(book.getBookName().equalsIgnoreCase(bookName)) {
					return book;
				}
				
			}
		}
		return null;
	}
	
	public boolean removeBook(String bookName) {
		List<Book> books = library.getBooks();
		if(books != null) {
			for (Book book : books) {
				if(book.getBookName().equalsIgnoreCase(bookName)) {
					books.remove(book);
					return true;
				}
				
			}
		}
		return false;

		
	}
	
	public boolean removeBooke(String bookName) {//Sir's Method
		Book book = getBook(bookName);
		if(book != null) {
			List<Book> books = library.getBooks();
			books.remove(book);
			library.setBooks(books);
			return true;
		}
		return false;
		
	}
	
	
	
	public boolean updateBook(Book exist, Book updated) {
		List<Book> books = library.getBooks();
		for (Book book : books) {
			if(book.getBookName().equalsIgnoreCase(exist.getBookName())) {
				books.remove(exist);
				books.add(updated);
				library.setBooks(books);
				return true;
			}
			
		}
		return false;
		
		
		
	}
	
	
	public boolean updateBook(String bookName) {
		List<Book> books = library.getBooks();
		if(books != null) {
			for (Book book : books) {
				if(book.getBookName().equalsIgnoreCase(bookName)) {
//					book.setAuthorName(authName);
					return true;
				}
				
			}
		}
		return false;

		
	}
	
	public boolean updateAuth(String bookName, String authName) {
		List<Book> books = library.getBooks();
	   for (Book book : books) {
		   if(book.getBookName().equalsIgnoreCase(bookName)) {
			   book.setAuthorName(authName);
			   return true;
		   }
		
		
	       }
		return false;

		
	}
	
	public boolean updatePrice(String bookName, double price) {
		List<Book> books = library.getBooks();
	   for (Book book : books) {
		   if(book.getBookName().equalsIgnoreCase(bookName)) {
			   book.setBookPrice(price);
			   return true;
		   }
		
		
	       }
		return false;

		
	}


	
	

}
