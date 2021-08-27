package day07_IfElseStatements;

import java.util.Scanner;

public class C4_IfElse03 {

	public static void main(String[] args) {
		// Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”, 
		//65’den buyukse “Emekli olabilirsin” yazdirin
		
		System.out.println("yasinizi giriniz");
		Scanner scan=new Scanner(System.in);
		byte yas=scan.nextByte();
		
		
		if (yas<=65) {
			System.out.println("emekli olamazsiniz");
		}
		else {
			System.out.println("emekli olabilirsiniz");
		}
		scan.close();		
	}
	
}
