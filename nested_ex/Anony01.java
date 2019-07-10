package nested_ex;

class Student4{
	public void studentInfo() {
		System.out.println("학생정보를 출력하는studentInfo() ");
	}
}

public class Anony01 {

	public static void main(String[] args) {
		Student4 obj = new Student4();
		obj.studentInfo();
		
		Student4 obj2 = new Student4() {
			public void studentInfo() {
				System.out.println("학생정보를 출력하는studentInfo() ");
			}
		};
		obj2.studentInfo();
	}
}
