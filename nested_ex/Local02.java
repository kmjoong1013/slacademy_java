package nested_ex;

public class Local02 {

	void showStudentInfo(String name, int num){
		
		class StudentInfo {
			String name; // 
			int num;  // 
			public StudentInfo(String name, int num) {
				this.name = name;
				this.num = num;
			}
			public void prn() {
				System.out.println("name:"+name);
				System.out.println("num:"+num);
			}
		}
		StudentInfo obj = new StudentInfo(name, num);
		obj.prn();
	}
	public static void main(String[] args) {
		Local02 objA = new Local02();
		objA.showStudentInfo("ȫ�浿", 1);
	}
}
