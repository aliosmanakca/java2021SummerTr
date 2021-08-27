package day33_accessModifier;

public class C02 {
    public static void main(String[] args) {
        C01 obj1 =new C01(); //C01 classindan obj1 creat ettik
        
        System.out.println(obj1.defaultAge);//15
        System.out.println(obj1.protectedAge);//32
        System.out.println(obj1.publicAge);//61
        
        
        C03 obj2=new C03();
       System.out.println(obj2.publicName);
       System.out.println(obj2.defaultName);
    }
}

