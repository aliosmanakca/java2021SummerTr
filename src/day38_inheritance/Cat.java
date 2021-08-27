package day38_inheritance;

public class Cat extends Mammal{
	
	public void mC() {
		System.out.println("cat");
	}
	
	public int c=9; //parenti ile ayni isim
	public int d=5;
	
	public Cat() {
		System.out.println("p'siz cons Cat");
	}
	
    public Cat(String s) {
    	this();
    	System.out.println(super.c);
		System.out.println("String p'li cons Cat");
	}

}
