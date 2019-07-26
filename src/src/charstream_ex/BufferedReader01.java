package charstream_ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {

	public static void main(String[] args) {
		BufferedReader bf = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader("c:\\java_src\\charBufferedStream.txt");
			bf = new BufferedReader(fr);
			while(true) {
				String line = bf.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(bf != null) bf.close();
				if(fr != null) fr.close();
			}catch(Exception e) {
				
			}
		}

	}

}
