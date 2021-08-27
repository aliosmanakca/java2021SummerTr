package day42_exceptions;

import java.util.Scanner;

public class Exceptions09 {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("bir sayi girin");
		String str=scan.next();
		
		try {
			System.out.println(2*Integer.parseInt(str));
		} catch (NumberFormatException e) { 
			System.out.println("sayi girmelisiniz");
		}
		
		scan.close();
	}
	
}
