package bytestream_ex;

import java.io.File;
import java.io.IOException;

public class File01 {

	public static void main(String[] args) throws IOException {
		String filePath = "c:\\java_src\\";
		
		//File.separator   C:\java_src
		
		File f1 = new File(filePath);
		
		String list[] = f1.list();
		for(int i=0; i<list.length; i++) {
			File f2 = new File(filePath, list[i]);
			if(f2.isDirectory()) {
				System.out.printf("%s : 디렉토리 \n", list[i]);
			}else {
				System.out.printf("%s : 파일(%,dbyte)\n", list[i], f2.length());
				System.out.println(f2.getCanonicalPath());
			}
		}
	}

}
