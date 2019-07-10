package nested_ex;

class Student{
	static class Info{
		String name;
		int num;
		void prn(){
			System.out.println("name : "+name);
			System.out.println("num : "+num);
		}
	}
	int score;
	int grade;
	
	static Info obj = new Info();
	void prnInfo(String name, int num){
		obj.name = name;
		obj.num = num;
		obj.prn();
	}
}
public class Nested02 {

	public static void main(String[] args) {
		Student.Info obj = new Student.Info();
		obj.prn();
		
		Student obj2 = new Student();
		obj2.prnInfo("ȫ�浿", 3);
	}
}
