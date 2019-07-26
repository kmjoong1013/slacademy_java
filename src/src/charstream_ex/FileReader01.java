package charstream_ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	public static void main(String[] args) {
		FileReader fr = null; // FileReader ¡ÿ∫Ò
		String filePath = "c:\\java_src\\charStream.txt";
		try {
			fr = new FileReader(filePath);
			int readChar;
			while((readChar = fr.read()) != -1) {
				System.out.println((char)readChar);
			}
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fr != null) fr.close();
			}catch(Exception e){
				
			}
		}

	}

}
