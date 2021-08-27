package day36_inheritance;

public class C02_Muhasebe extends C01_Personel {
	
	int saatUcreti;
	String statu;
	int maas;
	
	public int maasHesapla() {
		maas = saatUcreti*8*30;
		return maas;
	}
	 

}
