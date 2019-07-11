package list_ex;

import java.util.Vector;

public class Vector01 {

	public static void main(String[] args) {
		Vector v = new Vector(10,5);
		
		System.out.println("v.capacity"+v.capacity());
		System.out.println("v.size"+v.size());
		
		for (int i = 0; i < 11; i++) {
			v.add(i);
		}
		System.out.println("v.capacity"+v.capacity());
		System.out.println("v.size"+v.size());
	}
}
