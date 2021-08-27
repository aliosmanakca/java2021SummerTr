package day45_interface;

public abstract class Tofas {
	
	public abstract void motor();
	public abstract void yakit(); 
	public void sunroof() { // concrete method override etmek zorunlu degil
		System.out.println("bol gunesli gunlerde kullanmayin");
	}

}
