package bytestream_ex;
import java.io.*;
public class Employee_Serialize01_A {
	public static void main(String[] args) {
		Employee obj[] ={ new Employee("kim","333-4531","bit",1)
							,new Employee("lee","123-7777","hit",2)
							,new Employee("choi","555-5151","com",3)};
		ObjectOutputStream objOut = null;
		try{
			objOut = new ObjectOutputStream(
						new BufferedOutputStream(
						new FileOutputStream("c:\\java_src\\stest.dat")
						));
			objOut.writeObject(obj[0]);
			objOut.writeObject(obj[1]);
			objOut.writeObject(obj[2]);
			System.out.println("객체 직렬화 성공!!!");
		}catch(IOException e){
			e.printStackTrace(System.err);
			//System.out.println(e.getMessage());
		}finally{
			try{ if(objOut != null ) objOut.close();}
			catch(IOException e){e.printStackTrace(System.err);}
		}
	} 
}
