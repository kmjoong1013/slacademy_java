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
		System.out.print("학생번호");
		String code = in.next();//학생번호
		System.out.print("학생이름");
		String name = in.next();//학생이름
		System.out.print("국어점수");
		int korScore = in.nextInt();//국어점수
		System.out.print("영어점수");
		int engScore = in.nextInt();//영어점수
		
		
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
			System.out.println("학생번호"+std.code);
			System.out.println("학생이름"+std.name);
			System.out.print("국어점수"+std.korScore);
			System.out.print("영어점수"+std.engScore);
		}
	}
	
	public void stdRemove() {
		Scanner in = new Scanner(System.in);
		System.out.print("학생번호");
		String code = in.next();//학생번호
		
		for (int i = 0; i < stdList.size(); i++) {
			Goods goods = (Goods)stdList.get(i);
			if (stdList.containsKey(code)) {
				stdList.remove(code);
			}else {
				System.out.println("해당상품 없음");
			}
		}
	}
		public void loop() {
			Scanner in = new Scanner(System.in);
			int menuNum = 0;
			while(true) {
				System.out.println("1.학생추가 2.학생삭제 3.학생정보출력 0.종료");
				menuNum = in.nextInt();
				switch(menuNum) {
				case 0 :
					System.exit(0);
					break;
				case 1 :
					System.out.println("ArrayList에 키보드로 Goods 정보를 추가하는 내용을 완성하시오.");
					//Goods정보를 추가하는 메소드를 만들고 호출
					stdAdd();
					break;
				case 2 :
					System.out.println("ArrayList에 키보드로 Goods 정보를 삭제하는 내용을 완성하시오.");
					//키보드로 상품코드를 입력받고 for문으로 ArrayList에서 Goods정보를 get하여 goods의
					//code와 키보드로 입력받은 값을 if문과 equals를 이용해서 비교해서 같을경우 remove(i)
					//Goods 정보를 삭제하는 메소드를 만들고 호출
					stdRemove();
					break;
				case 3 :
					System.out.println("ArrayList에 키보드로 Goods 정보 전체를 출력하는 내용을 완성하시오.");
					//Goods 정보 전체를 출력하는 메소드를 만들고 호출
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