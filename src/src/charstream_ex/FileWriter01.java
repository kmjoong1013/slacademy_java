package charstream_ex;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {

	public static void main(String[] args) {
		String s = new String("select * from member\r\nwhere id = 'aman'");
		FileWriter file = null; // FileWriter �غ�
		String filePath = "c:\\java_src\\charStream.txt";
		try {
			file = new FileWriter(filePath); // filePath ���ڿ��� ������ file�� write ���� ����.
											// ������ ������ ���������.
			// ���ڿ��� ������ ���
			file.write(s,0,s.length());
			file.close();
		}catch(IOException e) {
			System.out.println("Error : " + e.toString());
		}finally {
			try {file.close();}catch(Exception e) {}
		}

	}

}
