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
		while(it.hasNext()) {	//���� �����Ͱ� �ִ��� üũ
			String item = (String)it.next();	//�����͸� �ϳ� get�ϰ� �ϳ� �Ʒ��� �̵�
			System.out.println(item);
		}
	}
}
