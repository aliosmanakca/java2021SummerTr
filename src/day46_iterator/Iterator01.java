package day46_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>(Arrays.asList("z", "e", "h", "r", "a"));
		System.out.println("listin ilk hali " + l1);

		// l1 elemanlarini for loop kullanarak yazdiriniz
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + " ");
		}
		System.out.println("\n*******************");

		// for each ile yazdirin
		for (String s : l1) {
			System.out.print(s + " ");
		}

		System.out.println("\n*******************");

		// l1 elemanlarini for loop kullanarak her elemanin yanina :) ekleyin
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + ":)");
		}

		List<String> l2 = new ArrayList<>(Arrays.asList("s", "a", "i", "d"));
		Iterator it1 = l2.iterator(); // iterator it1 creat ettik. new olmadigi icin obje degildir
		while (it1.hasNext()) {
			it1.next();
			it1.remove();
		}
		System.out.println("\nl2 nin iterator sonrasi: " + l2);
		System.out.println("\n*******************");

		List<String> l3 = new ArrayList<>(Arrays.asList("t", "a", "r", "i", "k"));
		ListIterator lt3 = l3.listIterator(); // degeri l3 olarak assign edildi
		while (lt3.hasNext()) {
			String depo = (String) lt3.next();
			lt3.set(depo + ":)"); // list elemanlarini update etti
		}
		System.out.println("l3 update hali : " + l3);
		System.out.println("\n*******************");

		// son elemana gulucuk ekleyelim
		// daha sonra tersten yazdiralim
		List<String> l4 = new ArrayList<>(Arrays.asList("z", "e", "l", "i", "h", "a"));
		ListIterator lt4 = l4.listIterator(); //listiterator interface den lt4 variable olusturuldu ve l4 degeri assign edildi
		int count = 0;
		while (lt4.hasNext()) {
			
			String depo = (String) lt4.next();
			
			if (count == l4.size() - 1) {
				lt4.set(depo + ":)");
			}
			count++;
		}
		/*
		  2. yol
		  if (!lt4.hasNext()) { 
		  lt4.set(depo + ":)" ); 
		  }
		 */
		System.out.println(l4);
		
		
		
		while (lt4.hasPrevious()) {
			String depo= (String) lt4.previous();
			System.out.print(depo+" ");
		}
		
		// hasPrevious() ve previous() methodlarinin calismasi icin oncesinde mutlaka hasNext() ve next()
		// methodlari kullanilarak pointer en sona getirilmeli.
		/*
		 "ITERATOR" ve "LISTITERATOR" arasi farklar :
1) "ITERATOR" sadece hasNext(), next() ve remove() methodlarini icerir
    "LISTITERATOR"  ise hasNext(), next(),remove() hasPrevius(), Previus(), add(); set()  method'rini içerir.
2) "LISTITERATOR" sadece list'ler cin kullanilir.
    "ITERATOR" ise tum collection(list set map) elemanlari icin kullanilir
3) "ITERATOR" sadece ileri gidiyor, "LISTITERATOR" hem ileri hem geri cift yonlu gitmek icin kullanilir.
		 */
		

	}

}
