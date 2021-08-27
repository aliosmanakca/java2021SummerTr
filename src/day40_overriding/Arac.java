package day40_overriding;

public class Arac {
	/*
	 - arac isimli bir super class olusturunuz. fields : renk ve motor(private), model(protected) olsun.
	 - constructor ekleyiniz. get ve set methodlari ve toString methodunu ekleyiniz.
	 - bu classdan otobus classini uretin. otobusun ayrica yolcuSayisi fieldini ekleyin
	 - AracPark isimli icinde main olan class olusturup otobusten obje olusturarak, otobusun
	   ozelliklerinin tumunu ekrana yazdiriniz 
	 
	 */
	
	private String renk;
	private int motor;
	protected String model;
	
	public Arac(String renk, int motor, String model) {
		setMotor(motor);
		setRenk(renk);
		this.model=model;
	}
	
	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}
	

}
