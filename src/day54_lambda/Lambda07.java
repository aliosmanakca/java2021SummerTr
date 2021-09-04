package day54_lambda;

import java.util.stream.IntStream;

import day52_lambda.Lambda03;

public class Lambda07 {

	public static void main(String[] args) {
		//1) birden yirmiye kadar olan sayilari yazdirin
		
		IntStream.rangeClosed(1, 20).forEach(System.out::print);
		System.out.println();
		
		//2) functional programlamayı kullanarak 3 den ile 98 e kadar olan çift tam sayıların toplamını bulun
		
		System.out.println(IntStream.rangeClosed(3, 98).filter(t -> t % 2 == 0).reduce(0,Math::addExact));
		
		//3) functional programming kullanarak 9! i bul (9!=1*2*3...*9)
		
		System.out.println(IntStream.rangeClosed(1, 9).reduce(1,Math::multiplyExact));
		
		//4) İlk 7 çift sayma sayısının çarpımını bulun (2,4,6,8,10,12,14)
		
		System.out.println(IntStream.rangeClosed(2, 14).filter(t -> t % 2 == 0).reduce(1, Math::multiplyExact));
		
		//5)  6'dan büyük ilk 150 tek sayma sayısının toplamını bulun ==> 7, 9, 11, 13, 15, 17, 19
		
        System.out.println(IntStream.iterate(7, t -> t + 2).limit(150).sum());
        
        //6) İlk 23 çift sayma sayısının toplamını bulun

        System.out.println(IntStream.iterate(2, t -> t + 2).limit(23).sum());
        
        //7)  11 den 33 e kadar  her tam sayının rakamlarının toplamını hesaplamak için bir metod oluşturun 
        
        System.out.println(IntStream.rangeClosed(10,12).map(Lambda03::rakamlarToplami).reduce(0,Math::addExact));

	}

}
