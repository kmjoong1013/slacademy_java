package nested_ex;

class Student4{
	public void studentInfo() {
		System.out.println("�л������� ����ϴ�studentInfo() ");
	}
}

public class Anony01 {

	public static void main(String[] args) {
		Student4 obj = new Student4();
		obj.studentInfo();
		
		Student4 obj2 = new Student4() {
			public void studentInfo() {
				System.out.println("�л������� ����ϴ�studentInfo() ");
			}
		};
		obj2.studentInfo();
	}
}
