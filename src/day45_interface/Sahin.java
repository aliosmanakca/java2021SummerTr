package day45_interface;

public class Sahin extends Tofas implements IcDonanim , Lastik { 
 
	@Override
	public void koltuk() {
		System.out.println("deri koltuk yazin pisirir");
		
	}

	@Override
	public void motor() {
		System.out.println("1.6 aile motoru");
		
	}

	@Override
	public void yakit() {
		System.out.println("tup yakmazsan cok yakar");
		
	}

	@Override
	public void ayna() {
		System.out.println("elektrikli aynalar");
		
	}

	@Override
	public void kapi() {
		System.out.println("dort kapili");
		
	}

	@Override
	public void kaporta() {
		System.out.println("kordon gibi kaporta");
		
	}

	@Override
	public void ebat() {
		System.out.println("16 inch lastik ebati");
		
	}

	@Override
	public void jant() {
		System.out.println("celik jant");
		
	}

}
