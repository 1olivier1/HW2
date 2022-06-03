package hw2;

public class Book {
	
	private String isbn;
	private double price;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString () {
		return "[ISBN:" + isbn + "/PRICE: $" + price +"]";
	}
	/*public double giveMePrice() {
		return price;
	}
	
	public void changePrice ( double x) {
		price = x;
	}*/
	
	/*public Book() {
		price = -1;
		isbn = "000000";
	}*/
	
	/*public Book(String isbn) {
		this.isbn = isbn;
	}
	
	public Book(double price) {
		this.price = price;
	}
	
	public Book(String isbn, double price) {
		this.isbn = isbn;
		this.price = price;
	}*/
		

}

public class Tester {
	
	public static void main(String[] args) {
	
		//System.out.println("abc".compareTo("aba"));
		/*for (String string : item) {
			System.out.println(string);
		}*/
		
		
		
		
		
	 Book.setPublisher("UCF");
		
	 Book book = new Book("abc", 12.99);
		
	 BookList myBookList = new BookList();
	 
	// myBookList.printBooks();
	 
	 if ( !myBookList.addBook(book) ) System.out.println("Can't be added!");
	 myBookList.addBook(new Book("xyz", 6.99));
	 myBookList.addBook(new Book("akf", 16.99));
	 
	 
	 myBookList.removeBook("4999000");
	 //myBookList.printBooks();
	 
	// myBookList.printBookInfo("123456");
	 
	 myBookList.addBook(new Book("gjg", 6.99));
	 myBookList.addBook(new Book("ert", 160.99));
	 myBookList.addBook(new Book("zyt", 106.99));
	 
	 myBookList.printBooks();
	 myBookList.sortByIsbn();
	 System.out.println("\n___________________________\n\n");
	 myBookList.printBooks();
		
		
	}

}
//______________________________________________________________________________


public class BookList {

	private Book[] list;
	final int SIZE = 1000;

	public BookList() {
		list = new Book[SIZE];
		for (int i = 0; i < SIZE; i++)
			list[i] = null;
	}

	public void printBooks() {
		/*
		 * for (Book b: list) { if (b != null) System.out.println(b); }
		 */
		System.out.println("List of all books....");
		for (int i = 0; i < SIZE; i++)
			if (list[i] != null)
				System.out.println(list[i]);
	}

	private int indexOfNull() {
		int index = -1;
		for (int i = 0; i < SIZE; i++)
			if (list[i] == null) {
				index = i;
				break;
			}
		return index;
	}

//______________________________________________________	
	private int indexOfIsbn(String isbn) {
		for (int i = 0; i < SIZE; i++) {
			if (list[i] != null) {
				if (isbn.equalsIgnoreCase(list[i].getIsbn()))
					return i;
			}
		}
		return -1;
	}

//_____________________________________________________	
	public boolean addBook(Book book) {

		int index = indexOfNull();

		if (index == -1)
			return false;
		list[index] = book;
		return true;
	}

//_______________________________________________________
	public boolean removeBook(String isbn) {

		int index = indexOfIsbn(isbn);
		if (index == -1)
			return false;
		list[index] = null;
		return true;
	}

	public boolean removeBook(Book book) {

		int index = indexOfIsbn(book.getIsbn());
		if (index == -1)
			return false;
		list[index] = null;
		return true;
	}

//_______________________________________________________

	public void printBookInfo(String isbn) {
		int index = indexOfIsbn(isbn);

		if (index == -1)
			System.out.println("Wrong ISBN...");
		else
			System.out.println(list[index]);
	}

//_______________________________________________

	public void sortByPrice() {

		double temp = 999;
		int index = -1;
		Book ref;

		int start = 0;
		do {
			temp = 999;
			for (int i = start; i < SIZE; i++) {
				if (list[i] != null && list[i].getPrice() < temp) {
					temp = list[i].getPrice();
					index = i;

				}
			} // end of for
			ref = list[index];
			list[index] = list[start];
			list[start] = ref;
			start++;
			// break;

		} while (start < SIZE - 1);

	}// end of sort
	//_________________________________________________
	//_______________________________________________

		public void sortByIsbn() {

			String temp;
			int index = -1;
			Book ref;

			int start = 0;
			do {
				temp = "~";
				for (int i = start; i < SIZE; i++) {
					if ( list[i] != null && ( list[i].getIsbn()).compareTo(temp)  < 0) {
						
						temp = list[i].getIsbn();
						index = i;

					}
				} // end of for
				ref = list[index];
				list[index] = list[start];
				list[start] = ref;
				start++;
				// break;

			} while (start < SIZE - 1);

		}// end of sort
	
	
	
	
	

}// end of class
//_______________________________________________________________________________________________________

import java.util.Scanner;

public class Menu {

	public void showOptions() {
		System.out.println("\n\t\t______________________\n\n");
		System.out.println("\n\t\t1-Print All books\n");
		System.out.println("\n\t\t2-Print the info of a  book given the isbn\n");
		System.out.println("\n\t\t3-Sort books by isbn\n");
		System.out.println("\n\t\t4-Sort books by price\n");
		System.out.println("\n\t\t5-Add a book\n");
		System.out.println("\n\t\t6-Remove a book\n");
		System.out.println("\n\t\t0-Exit program\n");
	}

	public int getChoice() {
		int option;
		do {
			System.out.print("Enter your selection: ");
			option = (new Scanner(System.in)).nextInt();
		} while (! (option <= 6 && option >= 0) );
		
		return option;

	}

}
