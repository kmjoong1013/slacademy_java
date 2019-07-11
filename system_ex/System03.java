package system_ex;

public class System03 {

	public static void main(String[] args) {
		//java.version : Java버전
		//os.name : os이름
		//os.version : os 버전
		//file.separator : 파일 구분 문자
		//user.name : 사용자 계정
		
		String javaVersion = System.getProperty("java.version");
		System.out.println(javaVersion);
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		String fileSeparator = System.getProperty("file.separator");
		System.out.println(fileSeparator);
	}
}
