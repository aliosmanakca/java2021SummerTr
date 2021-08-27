package day45_interface;

public interface DisDonanim {
	public void ayna();
	public void kapi();
	public void kaporta(); 
	
	
	String RENK = "ahsap";
	
	public default String sisLamp() {  //bu bir concrete method
		return "sisli hava dikkat";
	}
	
	public static String boya() {
		return "guzel boya";
	}
  
}
