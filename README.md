# Library Management System
This project is a Library Management System developed in Java, following the MVC (Model-View-Controller) architecture. The MVC pattern is used to separate the concerns of the application into three main components:

• Model: The Model represents the data and business logic of the application. In this project, the Model includes two main entities: Book and Library. The Book entity represents a book with attributes such as name, price, and author name. The Library entity represents a library with attributes such as name, address, pincode, and a list of books.

• View: The View is responsible for presenting the data to the user and receiving user input. In this project, the View would include the user interface components such as forms, tables, and buttons used to interact with the system.

• Controller: The Controller acts as an intermediary between the Model and the View. It processes user input from the View, interacts with the Model to perform actions such as adding, removing, updating, and deleting books, and updates the View to reflect the changes.

# Entities
# Book
## • Attributes:-     
    • bookName: Name of the book  
    • bookPrice: Price of the book  
    • authorName: Name of the author  
## • Methods:-  
    • getBookName(): Returns the name of the book  
    • setBookName(String bookName): Sets the name of the book  
    • getBookPrice(): Returns the price of the book  
    • setBookPrice(double bookPrice): Sets the price of the book  
    • getAuthorName(): Returns the name of the author  
    • setAuthorName(String authorName): Sets the name of the author  
    • toString(): Returns a string representation of the book  

# Library  
## • Attributes:-    
    • libraryName: Name of the library    
    • libraryAddress: Address of the library    
    • pincode: Pincode of the library location  
    • books: List of books in the library  
## • Methods:-    
    • getBooks(): Returns the list of books in the library  
    • setBooks(List<Book> books): Sets the list of books in the library  
    • getLibraryName(): Returns the name of the library  
    • setLibraryName(String libraryName): Sets the name of the library  
    • getLibraryAddress(): Returns the address of the library  
    • setLibraryAddress(String libraryAddress): Sets the address of the library  
    • getPincode(): Returns the pincode of the library location  
    • setPincode(int pincode): Sets the pincode of the library location  

  ## Functionality  
  • Add a book to the library  
  • Update book details  
  • Remove a book from the library  
  • Retrieve book details  
# How To Run
 1. **Clone the Repository:** Users can clone your repository to their local machine using the following command:  
     git clone https://github.com/krishnaydv22/LibraryManagementSystem.git
 2. **Import the Project:** Users can import the project into their preferred Java IDE (Integrated Development Environment) such as Eclipse, IntelliJ IDEA, or NetBeans.  
 3. **Run the Application:** Users can run the application from their IDE. Provide instructions on how to run the main class or start the application.
 4. **Use the Application:** Provide instructions on how to interact with the application once it's running. Explain how users can add, remove, update, and delete books from the library.
 5. You can Add the required data in command prompt.
 6. The Screen shot of project has been attached.


  
  # Screen Shots
  ### To Add Book  
  ![Add Book](https://github.com/krishnaydv22/Library-Management-System/assets/78638214/4b15fe1a-c427-4123-acd1-282f67d6c5e8)  
  ### To Remove Book
  ![Delete ss](https://github.com/krishnaydv22/Library-Management-System/assets/78638214/7144081d-71e7-4179-a7d8-701ebc8d054c) 
  ### To Fetch Book
![getbook ss](https://github.com/krishnaydv22/Library-Management-System/assets/78638214/1f6db0e3-1039-49cc-915e-045b2acefedc)  
### To Update Book Record
![Update Ss](https://github.com/krishnaydv22/Library-Management-System/assets/78638214/e2e49d41-2870-4a66-9136-792d0cfaeefb)  

  

  
  

