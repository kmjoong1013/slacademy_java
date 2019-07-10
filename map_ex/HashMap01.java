package map_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		Map hm = new HashMap();
		
		hm.put("ÀÌ¼ø½Å",100);
		hm.put("À»Áö¹®´ö",90);
		hm.put("À»Áö¹®´ö",97);
		hm.put("±è±¸",95);
		hm.put("Á¤¾à¿ë",90);
		hm.put("ÀÌ¼ø½Å",1000);
		
		//---------------------------
		int score = (int)hm.get("±è±¸");
		System.out.println("±è±¸"+score);
		
		if (hm.containsKey("À»Áö¹®´ö")) {
			int s = (int)hm.get("À»Áö¹®´ö");
			System.out.println("À»Áö¹®´ö"+s);
		}
		hm.remove("Á¤¾à¿ë");
		
		Set mapKeys = hm.keySet();
		System.out.println("-------------------------------");
		Iterator it = mapKeys.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+":"+hm.get(key));
		}
	}
}
