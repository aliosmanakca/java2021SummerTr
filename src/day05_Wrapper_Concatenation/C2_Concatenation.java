package day05_Wrapper_Concatenation;

public class C2_Concatenation {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="World";
		int sayi1=3;
		int sayi2=4;
		
		System.out.println(str1 + (sayi2-sayi1));
		
		System.out.println(str1+ " "+ (sayi2*2-3) + " " +str2);
		
		System.out.println(str1+" " + sayi1+sayi2);
		
		System.out.println(sayi1+sayi2+str2);
		
		System.out.println(sayi1+sayi2); //data turu int
		
		System.out.println(sayi1+""+sayi2);//data turu String

	}

}
