package day03_datacasting_increment;

public class C4_DataCasting02 {

	public static void main(String[] args) {
		
		double sayi1 = 200.89;
		
		int sayi2= (int) sayi1;
		// sag tarafin basina int eklemezsen calismaz
		
		System.out.println(sayi1);
		
		System.out.println(sayi2);
		
		byte sayi3 = (byte) sayi2;
		
		System.out.println(sayi3);
		
		int sayi4 = 95;
		int sayi5 = 10;
		
		System.out.println("bolme sonucu" + sayi4/sayi5);
		
		
		
				

	}

}
