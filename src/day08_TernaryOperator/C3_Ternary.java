package day08_TernaryOperator;

import java.util.Scanner;

public class C3_Ternary {

	public static void main(String[] args) {
		//kullanicidan iki sayi alip kucuk olani yazdir
		
		Scanner scan= new Scanner(System.in);
		System.out.println("iki sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		System.out.println( sayi1>sayi2 ? sayi2 : sayi1 );
		
		
		
		
scan.close();
	}

}
