package day41_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count=1;
		while (count<=3) {
			System.out.println("1. sayiyi girin");
			int sayi1 = scan.nextInt();
			
			System.out.println("2. sayiyi girin");
			int sayi2 = scan.nextInt();
			
			try {
				System.out.println(sayi1/sayi2);
			} catch (Exception e) {  // sadece Exception olursa genel olarak tum hatalari kapsar
				System.out.println("bolen 0 olamaz");
				System.out.println(e.getMessage()); // / by zero
				e.printStackTrace();// java.lang.ArithmeticException: / by zero
				// at day41_exceptions.Exceptions02.main(Exceptions02.java:20)
			}
			
		}
scan.close();
	}

}
