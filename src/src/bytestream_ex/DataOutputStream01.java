package bytestream_ex;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream01 {

	public static void main(String[] args) throws IOException {
		File tempfile = new File("c:\\java_src\\tempfile.tmp"); // File ��ü ����
		// ���� �� ��ü�� �����͸� write �ϸ� ������ ���� ��� ������ ����
		
		// ���Ͽ� �����͸� ����ϱ� ���� ��ü
		FileOutputStream fos = new FileOutputStream(tempfile);
		// �ڹ� �⺻ �����͸� ����ϱ� ���ϰ� ������ ��ü
		// ���� �����Ͱ� �ƴ� int float ���� �����͸� write �ϱ� ���� ��ü
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
		
		System.out.println("tempfile.tmp�� " + dos.size() + "byte ����");
		dos.close();
		fos.close();
	}

}
