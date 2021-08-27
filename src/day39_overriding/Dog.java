package day39_overriding;

public class Dog extends Animal {

	@Override //Annotation => mutlaka childa yazilir. parent ve child arasinda iliski kurar
	public void beslenme() {
		System.out.println("et ile beslenir");
	}

	@Override
	public void tatli() {
		System.out.println("baklava");
	}

	@Override
	public Integer topla() {
		return 41+9;
	}

	@Override
	public Dog fatih() { 
		
		return new Dog();
	}
}
