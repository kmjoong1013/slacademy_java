package map_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExam02 {

	public char korGrade;
	public char engGrade;
	public int korScore;
	public int engScore;
	public String name;
	
	public Map stdList = new HashMap();
	
	public void stdAdd() {
		Scanner in = new Scanner(System.in);
		System.out.print("�л���ȣ");
		String code = in.next();//�л���ȣ
		System.out.print("�л��̸�");
		String name = in.next();//�л��̸�
		System.out.print("��������");
		int korScore = in.nextInt();//��������
		System.out.print("��������");
		int engScore = in.nextInt();//��������
		
		
		Std std = new Std(code, name, korScore , engScore);
		
		stdList.put(code,std);
	}
	
	public void stdPrnAll() {
		Set mapKeys = stdList.keySet();
		System.out.println("--------------------------------");
		Iterator it = mapKeys.iterator();
		while(it.hasNext()) {
			String code = (String)it.next();
			Std std= (Std)stdList.get(code);
			System.out.println("�л���ȣ"+std.code);
			System.out.println("�л��̸�"+std.name);
			System.out.print("��������"+std.korScore);
			System.out.print("��������"+std.engScore);
		}
	}
	
	public void stdRemove() {
		Scanner in = new Scanner(System.in);
		System.out.print("�л���ȣ");
		String code = in.next();//�л���ȣ
		
		for (int i = 0; i < stdList.size(); i++) {
			Goods goods = (Goods)stdList.get(i);
			if (stdList.containsKey(code)) {
				stdList.remove(code);
			}else {
				System.out.println("�ش��ǰ ����");
			}
		}
	}
		public void loop() {
			Scanner in = new Scanner(System.in);
			int menuNum = 0;
			while(true) {
				System.out.println("1.�л��߰� 2.�л����� 3.�л�������� 0.����");
				menuNum = in.nextInt();
				switch(menuNum) {
				case 0 :
					System.exit(0);
					break;
				case 1 :
					System.out.println("ArrayList�� Ű����� Goods ������ �߰��ϴ� ������ �ϼ��Ͻÿ�.");
					//Goods������ �߰��ϴ� �޼ҵ带 ����� ȣ��
					stdAdd();
					break;
				case 2 :
					System.out.println("ArrayList�� Ű����� Goods ������ �����ϴ� ������ �ϼ��Ͻÿ�.");
					//Ű����� ��ǰ�ڵ带 �Է¹ް� for������ ArrayList���� Goods������ get�Ͽ� goods��
					//code�� Ű����� �Է¹��� ���� if���� equals�� �̿��ؼ� ���ؼ� ������� remove(i)
					//Goods ������ �����ϴ� �޼ҵ带 ����� ȣ��
					stdRemove();
					break;
				case 3 :
					System.out.println("ArrayList�� Ű����� Goods ���� ��ü�� ����ϴ� ������ �ϼ��Ͻÿ�.");
					//Goods ���� ��ü�� ����ϴ� �޼ҵ带 ����� ȣ��
					stdPrnAll();
					break;
				}
			}
		}

		public static void main(String[] args) {
			HashMapExam02 obj = new HashMapExam02();
			obj.loop();
		}
	}