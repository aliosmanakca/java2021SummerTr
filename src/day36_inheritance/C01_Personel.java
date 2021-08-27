package day36_inheritance;

/*  1) Personel class oluşturunuz id(int), isim(String), soyisim(String),adres(String), tel(String), instance veriable bululundursun.
    bu class 1000 den başlayarak id atayan bir method barındırsın
    2) Muhasebe class oluşturunuz saatUcreti (int), statü(String), maas(int) instance veriable bululundursun.
    bu classsaatucretini 8 ve 30 ile carparak maaas hesaplayan bir  method barındırsın
    3)Memur class oluşturunuz iki memurun saat ucreti 20 tl ve 25  den maasının  ve diğer bilgilerini yazdırınız
    4)isci class oluşturunuz iki iscinim   saat ucreti 10 tl ve 15  den maasının  ve diğer bilgilerini yazdırınız
    Ahanda TRICK  :)
    Class'ların   parent-->child   ilişkisi
                personel-->Muhasebe
                Muhasebe-->Memur
                Muhasebe-->Isci
*/

public class C01_Personel {
	
	int id ;
	String isim;
	String soyisim;
	String adres;
	String tel;
	
	public static int sayac = 1000; // eger static olmazsa her obje icin bastan baslar
    
	public int idAta() {
		this.id=++sayac;
		return id;
	}
	
}
