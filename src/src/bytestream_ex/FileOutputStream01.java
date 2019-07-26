package bytestream_ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

	public static void main(String[] args) {
		String filePath = "c:\\java_src\\fileout.txt";
		// File f1 = new File(filePath);
		
		FileOutputStream fos = null;
		try {
			// f1.createNewFile();
			fos = new FileOutputStream(filePath);
			String message = "æ»≥Á«œººø‰.";
			fos.write(message.getBytes());
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fos != null) fos.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

}
