package day38_inheritance;

public class Runner {  // bu classda zaten obje olusturacagimiz icin extends yapmamiza gerek yok

	public static void main(String[] args) {
		
		Cat c1 = new Cat(); // gizli super() oldugu icin parentindaki classda p'siz cons. arar 
		
		System.out.println(c1.a); // (7) animal dan
		System.out.println(c1.c); // (9) objenin data type i Cat classi oldugu icin Cat classindaki c variable ini getirir, Mammal dan degil.
		System.out.println(c1.d); // (5) kendi classindan
		System.out.println(c1.m); // (4) mammal dan. parent dan yukari dogru gittigi icin.  
		
		c1.mA(); // (mammal) parent dan yukari dogru gittigi icin mammal classindan getirir
		c1.mC(); // (cat)
		c1.mM(); // (animalmammal) 
		
		 System.out.println("");
		System.out.println("ikinci obje baslangic");
		System.out.println("");
		
		Mammal c2 = new Cat("A"); // data type ve cons. farkli classlar.
		// variable call yaparken data type ina bakilir, method call yaparken constructor a bakilir.
		
		System.out.println(c2.a);// (7)
		System.out.println(c2.c);// (6) data type mammal oldugu icin ordan aldi, catten degil. Bu durumda parent classdan baslanir.
		System.out.println(c2.m);// (4) 
		
		c2.mA();
		c2.mC();
		c2.mM();

	}

}
