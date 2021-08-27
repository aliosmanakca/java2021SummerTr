package day08_TernaryOperator;

import java.util.Scanner;

public class C4_Ternary02 {

	public static void main(String[] args) {
		// kullanicidan bir deger alip mutlak degerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("sayi giriniz");
		
		int sayi=scan.nextInt();
		
		System.out.println(sayi>=0 ? sayi : -1*sayi);

		scan.close();
	}

}
