package day50_maps;

import java.util.HashMap;

public class Ornek01 {

	public static void main(String[] args) {
		String arr[] = { "ahmet", "ahmet can", "haluk" };
        String arr2[] = { "seref", "erdem", "bilgin" };
        HashMap<String, String> hm = new HashMap<>();
       
        for (int i = 0; i < arr2.length; i++) {
            hm.put(arr[i], arr2[i]);
        }
        System.out.println(hm);

	}

}
