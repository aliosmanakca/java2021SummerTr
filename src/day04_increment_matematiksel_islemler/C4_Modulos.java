package day04_increment_matematiksel_islemler;

import java.util.Scanner;

public class C4_Modulos {

	public static void main(String[] args) {
		// 5496 sayisinin rakamlar toplamini bulalim
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("sayi giriniz");
		
		int alinansayi= scan.nextInt();
		
		System.out.println("girilen sayi " + alinansayi);
				
		
		int sayi=5496;
		int rakamlarToplami=0;
		// sayi%10 ile son basamagi elde ederiz
		
		int rakam= sayi%10;
		//bu rakami rakamlarToplami na ekleriz
		
		rakamlarToplami+=rakam;
		
		sayi/=10;// sondaki basamaktan kurtuluruz
		
		rakam= sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;		

		rakam= sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam= sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		System.out.println("toplam " + rakamlarToplami);
		
		scan.close();	
	}

}
