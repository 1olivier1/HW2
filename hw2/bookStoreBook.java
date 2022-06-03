package hw2;

public class bookStoreBook {
	private String isbn,title,author;
	private  double Lprice;
	private  double price;
	
	public String getIsbn() {
		return isbn;
	}

	public double getLprice() {
		return Lprice;
	}

	public void setLprice(double lprice) {
		Lprice = lprice;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString () {
		return "[" +isbn +"-"+ title + " by " +author+ "," + "$"+price 
				+" listed for "+ Lprice +"]";
	}
	
	
}
