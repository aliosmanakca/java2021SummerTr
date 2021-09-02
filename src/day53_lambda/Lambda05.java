package day53_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day52_lambda.Lambda03; // diger pakette hazirladigimiz methodlari kullanabilmek icin import ettim

public class Lambda05 {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));
        ilkDortEleman(l);
        System.out.println();
        ilkDortElemanGec(l);
        System.out.println();
        ucElemaniYazdir(l);
    }
    

	//1) küçükten büyüğe sırala sonra ilk 4 elemanı yazdır
    public static void ilkDortEleman(List<Integer> l) {
        l.stream().sorted().limit(4).forEach(Lambda03::bosluklaYazdir);
    }
    //2) küçükten büyüğe sırala ilk 4 elemanı atladiktan sonra yazdir
    public static void ilkDortElemanGec(List<Integer> l) {
        l.stream().sorted().skip(4).forEach(Lambda03::bosluklaYazdir); 

	}
    
    //3) kucukten buyuge sirali 4,5 ve 6. elemani yazdirin
	private static void ucElemaniYazdir(List<Integer> l) {
		l.stream().sorted().skip(3).limit(3).forEach(Lambda03::bosluklaYazdir);
		
	}

}
