package list_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayList04 {

	public static void main(String[] args) {
		List arr = new ArrayList();
		
		System.out.println(arr.size());
		for (int i = 0; i < 11; i++) {
			arr.add(i);
		}
		System.out.println("v.capacity"+arr.size());
	}
}
