package day39_overriding;

public class Overriding {
	
	/*
	 Overriding, parent classdaki methodu child class a gore ozellestirip kullanmanin adidir.
	 
	 OVERRIDING KURALLARI
	 
	 - parent classdaki method signature degistirilemez
	 
	 - access modifier ve return type belirli kurallara gore degistirlilebilir
	 
	 - overriding yapilirken parent child iliskisi olmalidir. inheritance olmadan overriding olmaz
	 
	 - overriden method=> parent classdki methoddur
	   overiding method=> child classdaki methoddur
	   
	 - overriding methodun (child) access modifieri , overriden methodla (parent) ayni ya da daha genis olmalidir
	 
	 - overriding methodun return type i ile overriden methodunki ayni olmali. class ismi return type oldugu zaman  farkli olabilir
	   eger ikisi ayni degilse aralarinda is-a relation olmali. 
	 
	 - static, private ve final methodlar ovirriding edilemezler

	 --------------------------------------------------------------------------
	 
	 - polimorphism => overloading ve overriding den olusan yapiya denir
	 
	 - overloading => public void yemek() {...}
	                  public void yemek(String tatli) {...}
	                  public void yemek(String tatli, int ucret) {...}
	                  
	   overriding =>  public void icecek() {syso ayran}
	                  public void icecek() {syso kahve}
	                  public void icecek() {syso cay}       
	                  
	 - overlodingde method signature degistirilir
	 
	 - overloadingde inharitance gerekmez
	 
	 - overloadingde body genelde degistirilmeden kullanilir
	 
	 - static ve private methodlar overloading yapilabilir
	           
	 - overloading compile time polimorphism dir. => static
	   overriding run time polimorphism dir. => dinamik
	   
	 
	 */

}
