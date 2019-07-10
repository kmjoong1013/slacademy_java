package map_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		Map hm = new HashMap();
		
		hm.put("�̼���",100);
		hm.put("��������",90);
		hm.put("��������",97);
		hm.put("�豸",95);
		hm.put("�����",90);
		hm.put("�̼���",1000);
		
		//---------------------------
		int score = (int)hm.get("�豸");
		System.out.println("�豸"+score);
		
		if (hm.containsKey("��������")) {
			int s = (int)hm.get("��������");
			System.out.println("��������"+s);
		}
		hm.remove("�����");
		
		Set mapKeys = hm.keySet();
		System.out.println("-------------------------------");
		Iterator it = mapKeys.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+":"+hm.get(key));
		}
	}
}
