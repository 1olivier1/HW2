package hw2;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		
		Scanner myScan;
		myScan = new Scanner (System.in);
		arryTest myArryTest = new arryTest();
		myArryTest.addBook(new bookStoreBook());
			
		/*
		String str;
		System.out.println("enter ");
		//str = myScan.nextLine();
		 str = "olivier/red/green";
		String [] arrOfStr = str.split("/");
		
		for (int i=0;i<3;i++){
			System.out.println(arrOfStr[i]);
			
		}
		bookStoreBook [] list;
		list = new bookStoreBook[100];
		list[2] = new bookStoreBook();
		
		list[2].setIsbn(arrOfStr[0]);
		list[2].setAuthor(arrOfStr[1]);
		list[2].setTitle(arrOfStr[2]);
		list[2].setPrice(20.22);
		list[2].setLprice(33.34);
		
	
		
		
		for(int i = 0; i<100;i++) {
			list[i]=null;
			System.out.println(list[2]+"number" +i );
		}
		
		
		*/
		
		
		//b1.setPrice(82);
		//b1.setIsbn("123456");
		
		//System.out.println(b1.getIsbn() + "  "+ b1.getPrice());
		
		
		
		
		
	}

}
