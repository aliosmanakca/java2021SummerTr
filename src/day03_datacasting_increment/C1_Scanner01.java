package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi ve soyisminizi yaziniz, \nisminizi yazdiktan sonra ENTER'a basiniz");
		// syso icinde alt satira gecmek istedigimizde \n yazariz
		// \n den sonra bosluk birakirsak ikinci satirin basinda bosluk olur
		
		String name=scan.nextLine();
		String surname=scan.nextLine();
		// next() sadece ilk kelimeyi alir, girilen deger daha uzunsa ilk kelimeden sonrasi kalir
		// next() ise o satirin sonuna kadar tum degerleri alir
		
		System.out.println("Isminiz : " + name + "\nSoyisminiz : "+ surname+ "\nKursumuza katiliminiz alinmistir, tesekkurler");
		
		scan.close();	
	}

}
