package com.jsp.LMS.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.jsp.LMS.controller.Controller;

import co.jsp.LMS.model.Book;
import co.jsp.LMS.model.Library;

public class View {
	static private Library library = new Library();
	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	
     public static Library getLibrary() {
		return library;
	}

	public static void setLibrary(Library library) {
		View.library = library;
	}

   static boolean status = true;
	static {
	
		try {
		System.out.println("-------Welcome to LMS----------");
		System.out.print("Enter the name of library : ");
		library.setLibraryName(myInput.nextLine());
		System.out.print("Enter the address of library : ");
		library.setLibraryAddress(myInput.nextLine());
		System.out.print("Enter the pin code : ");
		library.setPincode(myInput.nextInt());
		myInput.nextLine();
		}catch(InputMismatchException e) {
	       status = false;
			myInput.nextLine();
		}
		

	}
	

	public static void main(String[] args) {
		
		if(status) {
		do {
			try {
			System.out.println("Select the option to perform");
			System.out.println("1. Add Book\n2. Remove Book\n3. Update Book\n4. Get Book\n0. Exit");
			System.out.print("Enter the digit for operation : ");
			byte userChoise = myInput.nextByte();
			myInput.nextLine();
			switch (userChoise) {
			case 0:
				myInput.close();
				System.out.println("-----E X I T E D-----");
				System.exit(0);

				break;
			case 1:
				Book book = new Book();
				System.out.print("Enter the name of book : " );
			     book.setBookName(myInput.nextLine());
			     System.out.print("Enter the Author name : ");
			     book.setAuthorName(myInput.nextLine());
			     System.out.print("Enter the price of book : ");
			     book.setBookPrice(myInput.nextDouble());
			     controller.addBook(book);
			     
			    			     
			     break;
			case 2:
				System.out.print("Enter the name of book to remove : ");
				boolean removedBook = controller.removeBook(myInput.nextLine());
				if(removedBook) {
					System.out.println("Successfully deleted ");
				}
				else {
					System.out.println("Book is not present ");
				}
				
				

				break;
			case 3:
				
				System.out.print("Enter book Name");
				Book existBook = controller.getBook(myInput.nextLine());
				if(existBook != null) {
					System.out.println("What to update ");
					System.out.println("1. Book Name \n2. Author Name \n 3. Price");
					System.out.print("Enter teh respective digit");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					Book toUpdate = existBook;
					switch (updateChoice) {
					case 1:
						System.out.print("Enter the name to update ");
						String newBookName = myInput.nextLine();
						toUpdate.setBookName(newBookName);
						
						
						
						break;
                   case 2:
                	   System.out.print("Enter the author to update ");
						String newAuthorName = myInput.nextLine();
						toUpdate.setAuthorName(newAuthorName);
						
						
						break;
                   case 3:
                	   System.out.print("Enter the new price to update ");
						Double newPrice = myInput.nextDouble();
						myInput.nextLine();
						toUpdate.setBookPrice(newPrice);
						
	
	               break;

					default:
						System.out.println("Enter the valid operation");
						break;
					}
					boolean updateBook = controller.updateBook(existBook, toUpdate);
					if(updateBook) {
						System.out.println("Updated ");
					}
					else {
						System.out.println("not Updated");
					}

				}
				
				
				
				
				

				
				
				
				
//				System.out.print("Enter the name of book you want to update : ");
//				String bookName = myInput.nextLine();
//
//				
//				boolean updatedBook = controller.updateBook(bookName);
//				
//				if(updatedBook) {
//					System.out.println("Select the respective code to update ");
//					System.out.println("1. Update Author Name ");
//					System.out.println("2. Update Price of Book  ");
//					System.out.print("Enter the code : ");
//					int updateChoice = myInput.nextInt();
//					myInput.nextLine();
//					switch (updateChoice) {
//					case 1:
//						System.out.print("Enter the new auth name : ");
//						String authName = myInput.nextLine();
//						
//						boolean updateAuth = controller.updateAuth(bookName,authName);
//						if(updateAuth) {
//							System.out.println("Author name Updated");
//						}
//						else {
//							System.out.println("Author Not Updated ");
//						}
//					
//						break;
//					case 2: 
//						System.out.print("Enter the new price of book : ");
//					   double newPrice = myInput.nextDouble();
//					   boolean updatePrice = controller.updatePrice(bookName, newPrice);
//					   
//					   if(updatePrice) {
//							System.out.println("Price Updated");
//						}
//						else {
//							System.out.println("Price Not Updated ");
//						}
//						break;
//						
//						
//
//					default:
//						System.out.println("Enter the valid option ");
//						break;
//					}
//					
//				}
//				else {
//					System.out.println("Book is not present ");
//				}
				
				

				break;
			case 4:
				System.out.println("select the choice code to search ");
				System.out.println("1. Get All records");
				System.out.println("2. Search by book Name ");
				System.out.print("Enter the code : ");
				int coiceCode = myInput.nextInt();
				myInput.nextLine();
				switch (coiceCode) {
				case 1:
					List<Book> books = library.getBooks();
					for (Book bookData : books) {
						System.out.println(bookData);
						System.out.println("----------------------------------------");
						
					}
					
					
					break;
				case 2:
					System.out.print("Enter the name of book you looking for : ");
					Book fetchBook = controller.getBook(myInput.nextLine());
					if(fetchBook != null) {
						System.out.println("Book is Available ");
						System.out.println("Details ");
						System.out.println(fetchBook);
					}
					else {
						System.out.println("Book is not available ");
					}
					break;
					

				default:
					System.out.println("Enter the valid code ");
					break;
				}
				
			break;

			default:
				System.out.println("invalid option ");
				break;
			}
			}catch(InputMismatchException e) {
				System.out.println("please enter the input in Number only :)");
				myInput.nextLine();
			}

		} while (true);

	}else {
		System.out.println("PinCode should be In Number Only! Please Re-Run the Application Again :)");
	}
		
	}
	

}
