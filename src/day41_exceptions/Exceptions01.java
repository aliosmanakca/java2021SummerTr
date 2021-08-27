package day41_exceptions;

import java.util.Scanner;

public class Exceptions01 {
	
	/*
	 1-iki tur exception vardir:
	 
	 i-Compile Time(checked) Exception: kod yazilirken javanin ongordugu olasi sorunlara karsi
	 
	 hatanin alti cizilir. ama her alti cizilen kod exception degildir.
	 
	 ii-Run Time(unchecked) Exception: kod run edildiginde olusan exceptiondur.
	 
	 2- kod yazilirken exception kullanilmasi gerekirse:
	 
	 i- add throw declarations: hata olustugunda konsola hata ile ilgili mesaj verir
	 ii- try-catch block: hata olustugunda hatanin yazdirilmasi ve duzeltilmesini saglar
	 
	 3- try block tan sonra en az bir tane catch block olmali yoksa CTE verir.
	 
	 4- try-catch blokta try body calisirsa catch block calismaz.
	 
	 5- try body den sonra birden fazla catch blok olabilir. olusan exception 
	    hangi catch ile ilgiliyse o blok calisir. tek try ama birden cok catch body olan
	    durumlarda yukaridan asagiya dogru genel exceptiondan ozele dogru gitmeli yoksa CTE verir.
	    
	 6-    
	    
	 
	 */
	
	// kullanicidan alacaginiz iki tamsayinin bolumunu yazdiriniz
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. sayiyi girin");
		int sayi1 = scan.nextInt();
		
		System.out.println("2. sayiyi girin");
		int sayi2 = scan.nextInt();
		
		try {
			System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) { 
			System.out.println("bolen 0 olamaz");
		}
		
scan.close();		
	}
	

}
