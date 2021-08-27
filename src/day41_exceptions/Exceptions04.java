package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		try { 
			FileInputStream fis = new FileInputStream("C:\\Users\\Ali Osman\\eclipse-workspace\\java2021SummerTr\\src\\day41_exceptions\\file");
			
			    int i = 0;
				
				while ((i=fis.read())!=-1) {
					System.out.print((char)i); // data casting ile i nin ascii degeri yerine char degeri yazildi
				   }
				
		}		
		
         catch (FileNotFoundException e) { //(child) dosyaya ulasamama durumu
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		    }
				
	     catch (IOException e) { //(parent) I:input O:output dosyalarla ilgili genel okuma yazma sorunlarini halleder
				System.out.println(e.getMessage()); 
			}
			
		System.out.println("");
		
		System.out.println("calisti");

	}

}
