package day02VariablesScanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// kullanicidan deger almak icin 3 adim atmaliyiz
		//1-scanner objesi alusturalim
		
		Scanner scan = new Scanner(System.in); 
		
		//2- kullanicidan ne istedigimizi yazdiralim
		System.out.println("Lutfen iki tamsayi giriniz");
		
		//3- next methodunu kullnarak girilen degerleri alip olusturacagimiz variable'lara atayalim
		
		int sayi1 = scan.nextInt();
		int sayi2 =scan.nextInt();
		
		System.out.println("Girdigimiz sayilarin toplami : " + (sayi1+sayi2));
		scan.close();	
		
	}
	
}
