package bytestream_ex;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream01 {

	public static void main(String[] args) throws IOException {
		File tempfile = new File("c:\\java_src\\tempfile.tmp"); // File 객체 생성
		// 만약 이 객체에 데이터를 write 하면 파일이 없을 경우 파일이 생성
		
		// 파일에 데이터를 출력하기 위한 객체
		FileOutputStream fos = new FileOutputStream(tempfile);
		// 자바 기본 데이터를 출력하기 편하게 구성된 객체
		// 문자 데이터가 아닌 int float 등의 데이터를 write 하기 편한 객체
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);
		dos.writeByte(7);
		dos.writeShort(100);
		dos.writeInt(100);
		dos.writeInt(200);
		dos.writeLong(1000);
		dos.writeFloat(6.7f);
		dos.writeDouble(10.162);
		dos.flush();
		
		System.out.println("tempfile.tmp에 " + dos.size() + "byte 저장");
		dos.close();
		fos.close();
	}

}
