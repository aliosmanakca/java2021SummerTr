package day41_exceptions;

public class Exceptions07 {

	
	public static void main(String[] args) {
		
		
		String str = "1453";
		int okulNo = Integer.parseInt(str);
		
		System.out.println("okulno: "+okulNo);
		
		System.out.println(str+1); //14531
		System.out.println(okulNo+1); //1454
		
		String str1 = "1a53";
		int strNo = Integer.parseInt(str1);
		System.out.println(strNo); // NumberFormatException
		

	}

}
