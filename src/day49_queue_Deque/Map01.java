package day49_queue_Deque;

import java.util.HashMap;

public class Map01 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashMap<Integer,String> m1 = new HashMap(); 
		m1.put(101, "levent");
		m1.put(102, "said");
		m1.put(103, "hasan");
		m1.put(104, "ahmet");
		System.out.println(m1);
		
		m1.put(101, "ali"); // 101 numara update edildi
		System.out.println(m1);
		
		m1.put(null, "veli");
		m1.put(null, "osman");
		m1.put(105, null);
		System.out.println(m1);
		
		System.out.println(m1.get(103));
		System.out.println(m1.values());
		System.out.println(m1.keySet());
		
		System.out.println(m1.getOrDefault(102, "boyle bir eleman yok"));
		System.out.println(m1.getOrDefault(110, "boyle bir eleman yok"));//eger bu numara yoksa default olarak atadigimiz yazi cikar
		
		System.out.println(m1.putIfAbsent(120, "canan")); // null
		
		m1.putIfAbsent(111, "omer");
		System.out.println(m1.get(111)); //omer
		
		m1.putIfAbsent(102, "zeki");
		System.out.println(m1.get(102)); // 102 i dolu oldugu icin yeni degeri atamadi
		
		m1.putIfAbsent(105, "kerem");
		System.out.println(m1.get(105));// 105 in eski value su null oldugu icin guncellendi
		
		System.out.println(m1);
		

		

	}

}
