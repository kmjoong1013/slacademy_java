package nested_ex;

class Student2{
	
	int korScore;
	char korGrade;
	
	class Info {
		String name; // 학생 이름
		int num;  // 학생 번호
		public Info(String name, int num) {
			this.name = name;
			this.num = num;
		}
		public void prn() {
			System.out.println("name:"+name);
			System.out.println("num:"+num);
		}
	}
}
//----------------------------------------------
public class Member02 {

	public static void main(String[] args) {
		Student2 obj = new Student2();
		
		Student2.Info infoObj = obj.new Info("홍길동", 10);
		infoObj.prn();
	}
}
