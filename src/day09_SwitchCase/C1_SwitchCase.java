package day09_SwitchCase;

import java.util.Scanner;

public class C1_SwitchCase {

	public static void main(String[] args) {
		// haftanin kacinci gunu oldugunu sorup
		// gun ismini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("haftanin kacinci gunu oldugunu yazin");
		int gunNo=scan.nextInt();
		
		switch(gunNo) {
		
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
		default:
			System.out.println("gecerli sayi giriniz");
		}
scan.close();
	}

}
