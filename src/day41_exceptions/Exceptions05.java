package day41_exceptions;

public class Exceptions05 {

	
	public static void main(String[] args) {
		String str1 = " ";
		String str2 = "";
		String str3 = null;
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
		// System.out.println(str3.length()); //NullPointerException  unchecked: kodu calistirinca hatayi goruruz
		
		System.out.println(str3+" ali");
		// System.out.println(str3.concat(" ali")); //NullPointerException
 
	}
	
}
