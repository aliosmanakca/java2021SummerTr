package day07_IfElseStatements;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
       
		Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen kenar \nuzunluklarini giriniz");
		 
		 double kenar1=scan.nextDouble();
		 double kenar2=scan.nextDouble();
		 
		 if (kenar1==kenar2) {
			 System.out.println("kare");
			 } 
		 else {
				 System.out.println("kare degil");
			 }
		scan.close();
	}

}
