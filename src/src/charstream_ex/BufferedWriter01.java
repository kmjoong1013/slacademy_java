package charstream_ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {

	public static void main(String[] args) {
		String s = new String("select * from member\r\nwhere id = 'sman'");
		File file = new File("c:\\java_src\\charBufferedStream.txt");
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(file));
			// ���ڿ��� ������ ���
			out.write(s,0,s.length());
			// ���� �ٲ۴�.
			out.newLine(); // "\r\n"
			// �ٽ� ���ڿ��� ������ ���
			out.write(s,0,s.length());
			out.flush();
		}catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
			
		}finally {
			try {out.close();}catch(Exception e) {}
		}

	}

}
