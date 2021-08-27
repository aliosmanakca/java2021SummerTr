package day36_inheritance;

public class C03_Memur extends C02_Muhasebe {
	
	public static void main(String[] args) {
		
		C03_Memur m1 = new C03_Memur();
		C03_Memur m2 = new C03_Memur();
		
		m1.isim= "Cumali";
		m1.soyisim="Korkmaz";
		m1.adres="falan fesmekan";
		m1.saatUcreti=20;
		m1.statu="chef";
		m1.tel="12345";
		m1.id=m1.idAta();
		m1.maas=m1.maasHesapla();
		
		m2.id=m2.idAta();
		
		System.out.println(m1.isim+"\n"+m1.soyisim+"\n"+m1.adres+"\n"+m1.saatUcreti+"\n"+m1.statu+"\n"+m1.tel+"\n"+m1.id+"\n"+m1.maas);
	    System.out.println(m2.id);
	
	}
	

}
