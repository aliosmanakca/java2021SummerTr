package day33_accessModifier;

import java.util.Scanner;

public class C001_StringBuilder {

	public static void main(String[] args) {
		/*
        Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
            olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
         (without case sensitivity)
         Eg : input : I love Java
         Output: "Reversed sentence : avaJ evol I 
            It is not a palindrome"
         */
		Scanner scan = new Scanner (System.in);
		
		System.out.println("yazi yazin");
		String str=scan.nextLine();
		
		StringBuilder sb= new StringBuilder();
		sb.append(str);  
		
		String ters = sb.reverse().toString();
		
		if (str.equalsIgnoreCase(ters)) { //  == yontemiyle olmuyor //bunu da kullanabilirdin ==>sb.toString().equals(ters)
			System.out.println("polindromedir");
		}else {
			System.out.println("degildir"); 
		}
scan.close();
	}

}
