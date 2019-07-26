package bytestream_ex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStream01 {
	
	public static void main(String[] args) throws IOException {
		File tempfile = new File("c:\\java_src\\tempfile.tmp"); // File 객체 생성
		// 데이터를 파일에서 읽기 위한 객체
		FileInputStream fis = new FileInputStream(tempfile);
		DataInputStream dis = new DataInputStream(fis);
		
		// boolean b = dis.readBoolean();
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readByte());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt()); // int i = dis.readInt();
		System.out.println(dis.readInt()); // int i = dis.readInt();
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		dis.close();
		fis.close();
	}
	
}
