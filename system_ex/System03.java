package system_ex;

public class System03 {

	public static void main(String[] args) {
		//java.version : Java����
		//os.name : os�̸�
		//os.version : os ����
		//file.separator : ���� ���� ����
		//user.name : ����� ����
		
		String javaVersion = System.getProperty("java.version");
		System.out.println(javaVersion);
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		String fileSeparator = System.getProperty("file.separator");
		System.out.println(fileSeparator);
	}
}
