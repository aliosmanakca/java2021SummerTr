package day17_nestedForLoopWhileLoops;

import java.util.Scanner;

public class C06_WhileLoop04 {

	public static void main(String[] args) {
		/*
        Soru 7 ) Kullanicidan pozitif bir tamsayi alin 
        ve bu sayinin rakamlari toplamini yazdirin
        */
       
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Lutfen pozitif bir tamsayi girin");
       
       int sayi=scan.nextInt();
       
       
       int i=sayi;  // eger bu esitligi yapmazsak sayi variableini en son kullandigimizda sifir degerini verir
                    //sayi kelimesini yazdirmayacaksak bunu yapmaya gerek yok
       int rakamlarToplami=0;
       int rakam=0;
       
       while (i>0) {
           
           rakam=i%10;
           rakamlarToplami+=rakam;
           i/=10;
           
       }
       System.out.println("girdiginiz " + sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
       scan.close();

	}

}
