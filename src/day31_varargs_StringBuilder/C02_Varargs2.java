package day31_varargs_StringBuilder;

public class C02_Varargs2 {

	public static void main(String[] args) {
		// verilen stringleri birlestiren concat isimli method olusturun
        
		concat("a","b12", "c3", "d");
	}

	private static void concat(String...strings) {
		String s="";
		for (String w : strings) {
			s = s.concat(w); // s+=w da yazabilirdin
		}
		System.out.println(s);
		
	}

}
