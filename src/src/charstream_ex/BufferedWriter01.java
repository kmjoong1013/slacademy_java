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
			// 문자열의 내용을 출력
			out.write(s,0,s.length());
			// 줄을 바꾼다.
			out.newLine(); // "\r\n"
			// 다시 문자열의 내용을 출력
			out.write(s,0,s.length());
			out.flush();
		}catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
			
		}finally {
			try {out.close();}catch(Exception e) {}
		}

	}

}
