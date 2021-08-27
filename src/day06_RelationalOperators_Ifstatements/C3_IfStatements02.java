package day06_RelationalOperators_Ifstatements;

import java.util.Scanner;

public class C3_IfStatements02 {

	public static void main(String[] args) {
		// kullanicidan bir sayi alip tek veya cift oldugunu yazdir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		int girilenSayi=scan.nextInt();
		
		if (girilenSayi%2==0)  {
		
		System.out.println("cift");
			
		}
		
		if (girilenSayi%2==1)  {
			
		System.out.println("tek");
			
		}
		
		if (girilenSayi<0)  {
			
		System.out.println("pozitif sayi girin");	
		}
        scan.close();
	}

}
