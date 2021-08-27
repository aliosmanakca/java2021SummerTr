package day35_encapsulation;

import java.util.Scanner;

public class C04_BookMain {
	
	public static void main(String[] args) {
		
		C03_Book kullanici = new C03_Book();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("kitap ismi gir");
		String kitap = scan.nextLine();
		kullanici.setBookName(kitap); 
		
		System.out.println("yazar ismi gir");
		String yazar = scan.nextLine();
		kullanici.setAuthorName(yazar); 
		
		System.out.println(kullanici.getAuthorName()+" "+kullanici.getBookName()); 
		
	scan.close();	
		
	}

}
