package day25_constructor;

public class C01 {

	public int ilanNo;
    public String marka;
    public String model;
    public int yil;
    public int fiyat;
    
    
    public C01(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}


	public C01(int i, String string, String string2, int j, int k) {
		// TODO Auto-generated constructor stub
	} 


	public C01() {
		// TODO Auto-generated constructor stub
	}


	public void maxHiz(int hiz) {
        
        System.out.println("Araba " + hiz +" km hiz yapabilir");
    }
    
    
    public void yakit(String yakitTuru) {
        System.out.println("Araba yakit olarak " + yakitTuru + "kullanir");

	}

}
