package generic_ex;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Generic02 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(10);
		list.add("ȫ�浿");
		
		List<String> list2 = new ArrayList<String>();
		
		//list2.add(10);
		list2.add("ȫ�浿");
		
		String name = list2.get(1);
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		
		map.put("A-100", 1000);
		
		int num = map.get("A-100");
	}
}
