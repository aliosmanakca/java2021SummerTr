package day54_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda08 {

	public static void main(String[] args) {
		
		Lambda08_Universite edebiyatBolum = new Lambda08_Universite("FenEdebiyat", "Edebiyat", 97, 128);
		Lambda08_Universite iktisatBolum = new Lambda08_Universite("IIBF", "Iktisat", 98, 134);
		Lambda08_Universite matematikBolum = new Lambda08_Universite("FenEdebiyat", "Matematik", 95, 142);
		Lambda08_Universite ingilizceBolum = new Lambda08_Universite("IngilizDili", "Ingilizce", 93, 154);
 
        List<Lambda08_Universite> uniList=new ArrayList<>(Arrays.asList(edebiyatBolum,iktisatBolum,matematikBolum,
                ingilizceBolum)); 


        //1)Tüm ortalama puanların (91)'den büyük olup olmadığını kontrol etmek için bir yöntem oluşturun
        System.out.println(uniList.stream().allMatch(t -> t.getNotOrtalama()>91));
        //2)Ders adlarından en az birinin "Matem" kelimesini içerip içermediğini kontrol etmek için bir yöntem oluşturun
        System.out.println(uniList.stream().anyMatch(t -> t.getBolum().contains("Matem")));

        //3)Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun 
        System.out.println(uniList.stream().sorted(Comparator.comparing(Lambda08_Universite::getNotOrtalama).reversed()).findFirst());

        //4)Not ortalamasına göre artan sıralama yapıp ilk elemanı atla ve list olarak yazdır
        System.out.println(uniList.stream().sorted(Comparator.comparing(Lambda08_Universite::getNotOrtalama)).skip(1).collect(Collectors.toList()));
		
		

	}

}
