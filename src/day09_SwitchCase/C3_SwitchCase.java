package day09_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase {

	public static void main(String[] args) {
		//  Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("gun ismi giriniz");
		String gun=scan.next().toLowerCase();
		
		switch(gun) {
		
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe" :
		case "cuma":
			System.out.println("hafta ici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("hafta sonu");
			break;
		default :
			System.out.println("gecerli gun girin");
		
		}
scan.close();
	}

}
