package list_ex;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		List arr = new ArrayList();
		arr.add(100);
		arr.add(200);
		arr.add(150);
		arr.add(120);
		arr.add(170);
		//arr�� �ִ� �������� ����
		int tot = 0;
		for (int i = 0; i < arr.size(); i++) {
			tot = tot+(int)arr.get(i);
		}
		System.out.println("tot : "+tot);
		//arr�� �ִ� ������ �� ���� ū��
		int max = (int)arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			if (max < (int)arr.get(i)) {
				max = (int)arr.get(i);
			}
		}
		System.out.println("max : "+max);
		//150�ʰ��� ���� �հ� ���
		tot = 0;
		for (int i = 0; i < arr.size(); i++) {
			int num = (int)arr.get(i);
			if (num>150) {
				tot = tot + num;
			}
		}
		System.out.println("total : "+tot);
	}	
}