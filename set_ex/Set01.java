package set_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("windows10");
		set.add("linux");
		set.add("MacOS");
		set.add("linux");
		
		System.out.println(set);
		Iterator it = set.iterator();
		while(it.hasNext()) {	//다음 데이터가 있는지 체크
			String item = (String)it.next();	//데이터를 하나 get하고 하나 아래로 이동
			System.out.println(item);
		}
	}
}
