package day42_exceptions;

import java.util.Scanner;

public class Exceptions10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("yasinizi girin");
		int age = scan.nextInt();
		
		// 1. yol try-catch kullanmadan
		
		/*
		if (age>0) {
			System.out.println(age);
		} else {
			throw new IllegalArgumentException();
		}
		
		System.out.println("buraya kadar calisti"); // bu satir calismaz
		*/
		
		// 2. yol try-catch kullanarak
		
		try {
			if (age>0) {
				System.out.println(age);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println("pozitif sayi girin");
		}
		
		System.out.println("buraya kadar calisti");
		
		
scan.close();
	}

}
