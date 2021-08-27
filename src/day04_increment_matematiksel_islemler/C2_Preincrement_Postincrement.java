package day04_increment_matematiksel_islemler;

public class C2_Preincrement_Postincrement {

	public static void main(String[] args) {
		
	int sayi1=20;
	int sayi2=++sayi1;
	// once bir arttirir sonra esitler
	System.out.println(sayi1);
	
	System.out.println(sayi2);
	
	sayi2=sayi1++;
	// once esitler sonra kendisi bir artar
	
	System.out.println(sayi1);
	
	System.out.println(sayi2);
	
	
	
	System.out.println(--sayi2);//once azaltir sonra yazdirir
	
	System.out.println(sayi2--);//once yazdirir sonra azltir
	
	System.out.println(sayi2);
		
		
		
		

	}

}
