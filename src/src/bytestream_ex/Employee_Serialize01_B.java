package bytestream_ex;
import java.io.*;
public class Employee_Serialize01_B {
	public static void main(String[] args) {
		ObjectInputStream objIn = null;
		Employee inObjData = null;
		try{
			objIn = new ObjectInputStream(
						new BufferedInputStream(
						new FileInputStream("c:\\java_src\\stest.dat")
						));
			while(true){
				inObjData = (Employee)objIn.readObject();
				System.out.println(inObjData);
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace(System.err); System.exit(1);
		}catch(EOFException e){
			System.out.println("파일의 끝");
		}catch(IOException e){
			e.printStackTrace(System.err); System.exit(1);
		}
		try{objIn.close();}
		catch(IOException e){e.printStackTrace(System.err);}
	}

}
