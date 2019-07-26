package bytestream_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		byte readArr[] = new byte[100];
		try {
			String filePath = "c:\\java_src\\fileout.txt";
			fis = new FileInputStream(filePath);
			int readSize = fis.read(readArr,0,readArr.length);
			System.out.println("readSize : " + readSize);
			System.out.println(new String(readArr).trim());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

}
