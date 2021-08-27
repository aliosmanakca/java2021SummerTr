package day44_abstractClasses;

public abstract class Banka {
    
    double bakiye;
    public Banka(double bakiye) {
        
    this.bakiye = bakiye;
    }
    public Banka() {
        System.out.println("hesap hareketleri");
    }
    abstract double paraYatir(double miktar);
    abstract double paracek(double miktar);

}
