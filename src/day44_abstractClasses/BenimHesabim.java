package day44_abstractClasses;

public class BenimHesabim extends Banka{
    @Override
    double paraYatir(double miktar) {
        super.bakiye+=miktar;
        return bakiye;
    }
    @Override
    double paracek(double miktar) {
        
        super.bakiye-=miktar;
        return bakiye;
    }
public BenimHesabim(double bakiye) {
    super.bakiye=bakiye;
    System.out.println(bakiye);
    
}

}
