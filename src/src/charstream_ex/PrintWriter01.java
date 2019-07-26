package charstream_ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter01 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		String filePath = "c:\\java_src\\printWriterFirst.txt";
		try {
			fw = new FileWriter(filePath);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			pw.println("æ»≥Á«œººø©");
			pw.println("π›∞©Ω¿¥œ¥Ÿ.");
			pw.println(100);
			pw.println(new Integer("1000"));
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

}
