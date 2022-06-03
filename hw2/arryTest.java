package hw2;

public class arryTest {

	private bookStoreBook[] list;
	final int SIZE = 100;

	public arryTest() {
		list = new bookStoreBook[SIZE];
		for (int i = 0; i < SIZE; i++)
			list[i] = null;
	}
	public boolean addBook(bookStoreBook bsb) {

		int index = indexOfNull();

		if (index == -1)
			return false;
		list[index] = bsb;
		return true;
	}
	private int indexOfNull() {
		int index = -1;
		for (int i = 0; i < 100; i++)
			if (list[i] == null) {
				index = i;
				break;
			}
		return index;
	}
}
