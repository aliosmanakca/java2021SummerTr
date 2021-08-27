package day11_StringManipulations;

import java.util.Scanner;

public class C3_StringManipulations03 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan email adresini girmesini isteyin,
		//mail @gmail.com iceriyorsa   “Email adresiniz kaydedildi”,
		//sonu @gmail.com ile bitsin
		//icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen email giriniz");
		String mail=scan.next().toLowerCase();
		
		if (mail.contains("@gmail.com") && mail.indexOf("@gmail.com")==mail.length()-10)  {
			System.out.println("email adresiniz kaydedildi");
			}
		else {
			System.out.println("Lutfen gmail adresi girin");
		}
scan.close();
	}

}
