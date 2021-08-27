package day41_exceptions;

public class Exceptions08 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// bir datayi casting yapilamayacak bir dataya cevirmek istedigimizde ClassCastException verir.
		
		int sayi=10;
		// String str=sayi; // CTE verir
		
		// String str=(String) sayi; // CTE verir
		
		Object sayi1=40;
		String str=(String) sayi1;
		System.out.println(str); // ClassCastException

	}

}
