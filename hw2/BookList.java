package hw2;

public class BookList {
	private Book[] list;
	final int SIZE = 1000;

	public BookList() {
		list = new Book[SIZE];
		for (int i = 0; i < SIZE; i++)
			list[i] = null;
	}
}
