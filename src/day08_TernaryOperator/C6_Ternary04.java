package day08_TernaryOperator;

import java.util.Scanner;

public class C6_Ternary04 {

	public static void main(String[] args) {
		// Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
        // girilen degerlere    gore dikdorgenin kare olup olmadigini yazdirin.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        
        System.out.println(sayi1<=0 || sayi2<=0 ? "Lutfen gecerli uzunluk giriniz" : 
            sayi1==sayi2 ? "Kare" : "Kare degil") ;
        
        scan.close();

	}

}
