package JavaPackage;

import java.util.HashMap;
import java.util.Map;

public class ExampleTreemap {
	public static void main(String a[]){
       Map< Integer, Integer> hm = new HashMap< Integer,  Integer>();
        //add key-value pair to hashmap
        hm.put(1, 100);
        hm.put(6, 200);
        hm.put(9,300);
        hm.put(2, 400);
        hm.put(4, 500);
        hm.put(0,600);
        System.out.println(hm);
        
		System.out.println(hm.get("2"));
        
		
}
}