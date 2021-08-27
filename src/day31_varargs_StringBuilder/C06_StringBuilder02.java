package day31_varargs_StringBuilder;

import java.util.Arrays;

public class C06_StringBuilder02 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder();// bos bir sb1 creat ettik.
        // SB e eleman ekleme-->obj.appent(obj);
        sb1.append("faruk");
        System.out.println("sb1 ilk hali : "+sb1);// faruk 
        
        sb1.append(" efehan");
        System.out.println("sb1 efehan eklenmis hali : "+sb1);// faruk efehan
        
        System.out.println("sb1 uzunluk :"+sb1.length());// 12
        System.out.println("sb1 kapasitesi :"+sb1.capacity());// 16
        
        System.out.println("sb1 son hali :"+sb1.append(" guzel insan"));
        System.out.println("sb1 son hali kapasite : "+sb1.capacity());  // 34
        
        sb1.trimToSize();  //fazladan ayrilan kapasiteyi silme
        System.out.println(sb1.capacity());  // 24
        
        System.out.println(sb1.indexOf("e")); // 6  istenen karakterin indexsini alma
        
        System.out.println(sb1.charAt(7));  // f  istenen indexteki karakteri alma
        
        System.out.println(sb1.subSequence(7, 12)); // fehan
        
        System.out.println(sb1.subSequence(6, sb1.length())); //efehan guzel insan
        
        System.out.println(sb1.toString().concat("a")); // bu sekilde stringe cevirip yapinca kalici olmuyor
        System.out.println(sb1);
        
        sb1.delete(3, 7);
        System.out.println(sb1); // farfehan guzel insan
        
        System.out.println(sb1.deleteCharAt(2)); // fafehan guzel insan
        
        sb1.insert(2,"r"); //istenen index e istenen karakterleri ekleme
        System.out.println(sb1); // farfehan guzel insan
        
        int arr[]= {13,14,15};
        sb1.insert(9, Arrays.toString(arr));
        System.out.println(sb1);
        
        
        
        StringBuilder sb2=new StringBuilder("Bugun hava cok sicak");
        System.out.println(sb2);
        
        sb2.replace(3, 8, "aliosmanakca"); // Bugaliosmanakcava cok sicak
        System.out.println(sb2);
        
        sb2.insert(5, "basarili", 2, 7);  // Bugalsariliosmanakcava cok sicak
        System.out.println(sb2);
        
        
        
        StringBuilder sb3=new StringBuilder("Bugun hava cok sicak");
        System.out.println(sb3);
        
        sb3.reverse();
        System.out.println("sb3 ters cevrilmis hali "+ sb3);
        
        String s = "hayat";
        StringBuilder sb = new StringBuilder("hayat");
        // System.out.println(s==sb);  == isareti burada kullanilamaz
        System.out.println(s.equals(sb)); // false
        System.out.println(s.equals(sb.toString())); // true // SB toString metodu ile stringe cevirilerek
        //string manipulation methodlari kullanilabilir
        
        System.out.println((sb.toString().concat("guzel"))); // kalici olmaz
        System.out.println(sb);
        System.out.println(sb.append(s,2,5));  // sb ye s nin 2 ile 5 arasini ekledi
       
        

	}

}
