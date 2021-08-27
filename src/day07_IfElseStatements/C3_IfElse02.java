package day07_IfElseStatements;

import java.util.Scanner;

public class C3_IfElse02 {

	public static void main(String[] args) {
		// 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		
		if (karakter>='A' && karakter<='Z' || karakter>='a' && karakter<='z') {
			
			System.out.println("girilen karakter harf");
			}
		else {
			System.out.println("harf degil");
		}
			
     scan.close();
	}

}
