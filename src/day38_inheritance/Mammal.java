package day38_inheritance;

public class Mammal extends Animal { 
	
	public void mA() { // parenti ile ayni
		System.out.println("mammal");
	}
	
	public void mC() {
		System.out.println("cat"+"mammal");
	}
	
	public int c=6;
	public int m=4; // parenti ile ayni isim
	
	public Mammal() {
		this('a');// bu class daki parametreli cons. call etmek icin this() kullandik
		System.out.println("p'siz mammal cons.");
	}
	
	public Mammal(char c) {
		super(34); // parentten p'li cons call 
		System.out.println("char parametreli mammal cons.");
	}


}
