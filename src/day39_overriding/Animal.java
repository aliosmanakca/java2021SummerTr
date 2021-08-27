package day39_overriding;

public class Animal {

	public void beslenme() {
		System.out.println("her hayvan beslenir");
	}
	
	protected void tatli()  {
		System.out.println("trilece");
	}
	
	public Integer topla()  {
       return 34+6;		
	}
	
	public Animal fatih()  {
		return new Animal(); 
	}
}
