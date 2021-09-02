package day53_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import day52_lambda.Lambda03;

public class Lamda06 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>(Arrays.asList("Ali","Ali","Aysima","Abdurrahman","Mehmet","Mustafa","Bedirhan","Yüksel","Süleyman"));
		yazdirBuyuk1(l);
		System.out.println();
		uzunlukSirala(l);
		System.out.println();
		farkliSonHarfSirala(l);
		System.out.println();
		uzunlukSiralaIlkEleman(l);
		System.out.println();
		AIleBaslayan(l);
		System.out.println();
		aIleBaslaVeyaiIleBit(l);
		System.out.println();
		siralaBuyut(l);
		System.out.println();
		isimUzunlukSirala(l);
		System.out.println();
		karesiniAlSiralaSil(l);
		System.out.println();
		ebikGabik(l);
		System.out.println();
		sondanIkinciSiralaIlk(l);
		

	}



	// 1) List in elemanlarini buyuk harfle yazdir
	private static void yazdirBuyuk1(List<String> l) {
		l.stream().map(t->t.toUpperCase()).forEach(Lambda03::bosluklaYazdir);  
		
	}
	
	//2) elemanları uzunluklarına göre sırala ve yazdır
	// java elemanlari varsayilan olarak artan siraya koyar
	private static void uzunlukSirala(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length)).forEach(Lambda03::bosluklaYazdir);
		System.out.println();
		l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Lambda03::bosluklaYazdir);
		
	}
	
	//3) farkli elemanlarini son harflerine göre siralayip yazdir
	
	private static void farkliSonHarfSirala(List<String> l) {
		l.stream().distinct().sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(Lambda03::bosluklaYazdir);
		
	}
	//4) Elemanları uzunluklarına ve ardından (aynı uzunlukta olanları) ilk karakterlerine göre sıralamak için bir yöntem oluşturun
	private static void uzunlukSiralaIlkEleman(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(Lambda03::bosluklaYazdir);
        	
	}
	
	//5)Büyük harflerle, "A" ile başlayan liste öğelerini yazdırmak için bir yöntem oluşturun
	private static void AIleBaslayan(List<String> l) {
		l.stream().filter(t-> t.startsWith("A")).map(String::toUpperCase).forEach(Lambda03::bosluklaYazdir);
		
	}
	
	//6)  Küçük harflerle, "A" ile başlayan veya "i" ile biten liste öğelerini yazdırmak için bir yöntem oluşturun   
	private static void aIleBaslaVeyaiIleBit(List<String> l) {
		l.stream().map(String::toLowerCase).filter(t->t.startsWith("a")||t.endsWith("i")).forEach(Lambda03::bosluklaYazdir);
		
	}
	
	//7) Öğeleri uzunluklarına göre sıraladıktan sonra büyük harflerle yazdırmak için bir yöntem oluşturun
	private static void siralaBuyut(List<String> l) {
		l.stream().map(t->t.toUpperCase()).sorted(Comparator.comparing(String::length)).forEach(Lambda03::bosluklaYazdir);
		
	}
	//8) Elemanları uzunluklarına göre sıralayın önce elemanı sonra uzunluğunu yazdırın
	private static void isimUzunlukSirala(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length)).map(t->t+":"+t.length()).forEach(Lambda03::bosluklaYazdir);
		
	}
	
	//9) Her elemanın uzunluğunun karesini alıp tekrarlıları sil, bunların 20'den büyük olanlarını ters sırada  yazdırın
	private static void karesiniAlSiralaSil(List<String> l) {
		l.stream().map(t->t.length()*t.length()).distinct().filter(t-> t>20).sorted(Comparator.reverseOrder()).forEach(Lambda03::bosluklaYazdir);
		
	}
	
	//10) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun
	//bütün elemanların "x" ile başlamadığını kontrol etmek için bir yöntem oluşturun
	//en az 1 tane "R" ile biten eleman olup olmadığını kontrol etmek için bir metod oluşturun.
	private static void ebikGabik(List<String> l) {
		boolean sonuc1= l.stream().allMatch(t->t.length()<12);
		System.out.println(sonuc1); 
		
		System.out.println(l.stream().noneMatch(t -> t.startsWith("x")));
		
        System.out.println(l.stream().anyMatch(t -> t.contains("R")));
		
	}
	
	//11) elemanlari sondan ikinci harflerine gore sirala
	private static void sondanIkinciSiralaIlk(List<String> l) {
		System.out.println(l.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-2))).findFirst());
		
	}
	
	//12)elemanlari uzunluklarina gore tersten siralayip ilk elemani yazdir


	

}
