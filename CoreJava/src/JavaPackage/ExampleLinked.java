package JavaPackage;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleLinked {
	public static void main(String a[]){
       Map<String, String> hm = new LinkedHashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("eighth", "FIRST INSERTED");
        hm.put("ninth", "SECOND INSERTED");
        hm.put("seventh","THIRD INSERTED");
        System.out.println(hm);
        
		System.out.println(hm.get("ninth"));
        
}
}






















