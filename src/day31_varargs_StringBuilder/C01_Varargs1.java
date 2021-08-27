package day31_varargs_StringBuilder;

public class C01_Varargs1 {

	public static void main(String[] args) {
		// verilen iki sayinin toplamini bulan bir method yazin
		// verilen uc sayinin toplamini bulan bir method yazin
		
		int sayi1=17;
		int sayi2=20;
		int sayi3=35;
		
		topla(sayi1,sayi2,sayi3);
		ikisayiTopla(sayi1,sayi2);
		ucSayiTopla(sayi1,sayi2,sayi3);

	}

	private static void ucSayiTopla(int sayi1, int sayi2, int sayi3) {
		System.out.println(sayi1+sayi2+sayi3);
		
	}

	private static void ikisayiTopla(int sayi1, int sayi2) {
		System.out.println(sayi1+sayi2);
		
	}
	public static void topla(int... sayi) {
		int toplam=0;
		for (int i : sayi) {
			toplam+=i;
		}
		System.out.println("toplam "+toplam);
	}

}
