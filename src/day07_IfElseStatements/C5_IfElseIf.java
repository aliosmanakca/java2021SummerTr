package day07_IfElseStatements;

import java.util.Scanner;

public class C5_IfElseIf {

	public static void main(String[] args) {
		
		System.out.println("notunuzu giriniz");
		
		Scanner scan=new Scanner(System.in);
		double not=scan.nextDouble();
		
		if (not<0 || 100<not) {
			System.out.println("gecerli not girin");
		}
		else if (not<50) {       
			
			System.out.println("F");
		}
		else if (not<=80) {             // 17. satirla birlikte dusunulurse 50 ile 80 arasi demektir
			System.out.println("B");
		}
		else  {
			System.out.println("A");
		}
scan.close();
	}

}
