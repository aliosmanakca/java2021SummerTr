package day44_abstractClasses;

/*
 * 1)  abstract  bir insan class creat ediniz. fields: 
     private String isim;
    private String soyisim;
     p'li constructor  creat ediniz
     abs calis method creat ediniz
     concrete bilgilendirme method creat ediniz-->fields print etsin
     concrete isimDegistir  method creat ediniz-->fields parametre 
     alsin atama yapsin
 2) insan classina sub class olacak Calisan class creat ediniz  
    fields:private int calisanId;
        calisanId==0 ise calisan degil aksi durumda calısan oldugunu
         kontrol edip id si ile  yazdirinz
        3 farkli obj ile ozelliklerini yazdiriniz
 */

public abstract class Insan {
    private String isim;
     private String soyisim;
   
     public Insan(String isim, String soyisim) {
       
       this.isim = isim;
       this.soyisim = soyisim;
   }
     
     public abstract void calis();
public  void bilgilendirme() {
   System.out.println("isim: "+this.isim+" soyisim: "+this.soyisim);
}
public  void isimDegistir(String isim,  String soyisim) {
   this.isim=isim;
   this.soyisim=soyisim;
}

}
