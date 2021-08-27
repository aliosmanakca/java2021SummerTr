package day32_stringBuilder;

public class C02_StringBuilder {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("ali");
		
		StringBuilder sb2 = new StringBuilder("ali");
		
		String str1 = sb1.toString();
		
		String str2 = sb2.toString();
		
		
		System.out.println(sb1==sb2); // false
		
		System.out.println(sb1.equals(sb2)); // false
		
		System.out.println(sb1.equals(sb2.toString())); // false
		
		System.out.println(str1==str2); // false  referanslari farkli oldugu icin false verir
		
		System.out.println(str1.equals(str2)); // true
		
		

	}

}
