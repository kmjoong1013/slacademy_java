package charstream_ex;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {

	public static void main(String[] args) {
		String s = new String("select * from member\r\nwhere id = 'aman'");
		FileWriter file = null; // FileWriter 준비
		String filePath = "c:\\java_src\\charStream.txt";
		try {
			file = new FileWriter(filePath); // filePath 문자열에 지정된 file을 write 모드로 연다.
											// 파일이 없으면 만들어진다.
			// 문자열의 내용을 출력
			file.write(s,0,s.length());
			file.close();
		}catch(IOException e) {
			System.out.println("Error : " + e.toString());
		}finally {
			try {file.close();}catch(Exception e) {}
		}

	}

}
