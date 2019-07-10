package list_ex;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List arr = new ArrayList();
		arr.add(100);
		arr.add(200);
		arr.add(150);
		arr.add(120);
		arr.add(170);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		arr.remove(new Integer(100)); // int 의 클래스 객체  Integer
		//arr.remove(4);
		System.out.println("========================");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("========================");
		arr.add(300);
		for(int i = 0 ; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("========================");
		if (arr.contains(new Integer(170))) {
			System.out.println("true");
		}
	}
}
