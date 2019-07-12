package string_ex;

import java.util.ArrayList;
import java.util.List;

public class StringExam03_2 {

	public static void main(String[] args) {
		String data = "이순신;100;강감찬;98";
		List<String>list = new ArrayList<String>();
		
		int startIndex = 0;
		int pos = 0;
		
		while(true) {
			pos = data.indexOf(";", startIndex);
			if(pos==-1) {
				list.add(data.substring(startIndex));
				break;
			}
			list.add(data.substring(startIndex, pos));
			startIndex = pos+1;
		}
		System.out.println(list);
		
		int sum = 0;
		for (int i = 0; i < list.size(); i=i+2) {
			sum = sum + Integer.parseInt(list.get(i+1));
			System.out.println(list.get(i) + ":" + list.get(i+1));
		}
		System.out.println(sum);
	}
}
