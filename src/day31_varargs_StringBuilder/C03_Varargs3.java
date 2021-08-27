package day31_varargs_StringBuilder;

public class C03_Varargs3 {

	public static void main(String[] args) {
		// verilen int lerden ilki haric tum sayilari toplayan ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin
		
		islem(2,5,55,21,33);

	}

	private static void islem(int ilksayi,  int ... sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		int sonuc= toplam*ilksayi;
		System.out.println(sonuc);  
	}

}
