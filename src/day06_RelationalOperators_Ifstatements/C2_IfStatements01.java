package day06_RelationalOperators_Ifstatements;

public class C2_IfStatements01 {

	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		
		// sartin sonucu true ise if body calisir false ise calismaz
		
		if(a>b) {
			
		System.out.println("a b'den buyuk");	// calismaz
			
		}
		
		if(a==b) {
			
		System.out.println("sayilar esit");	    //calismaz
		}
		
		if(a>b || a+b<10) {
			
		System.out.println("yasasin Java"); //sonuc true o yuzden calisir
			
		}
		
		if (a+b<0 || a*b>20)  {
			System.out.println("bitti bu is");
			
		}

	}

}
