package day34_encapsulation;

public class C03_ArabaMain {
	
	
	public static void main(String[] args) {
		
		C03_Araba volvo = new C03_Araba("xc90", "beyaz", -3000, -2020);
		C03_Araba audi = new C03_Araba("Q7", "bej", -3000, -2021);
		C03_Araba honda = new C03_Araba();  
		
		honda.model="accord";
		honda.renk="gri";
		honda.setYil(1999);   // private oldugu icin method kullandik
		honda.setMotor(1400); // private oldugu icin method kullandik
		
		System.out.println("honda yil : "+honda.getYil());
		System.out.println("honda motor : "+honda.getMotor());
		System.out.println("volvo motor : "+volvo.getMotor());
		System.out.println("audi yil : "+audi.getYil());

	}

}
