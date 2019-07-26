package bytestream_ex;
import java.io.*;
public class Employee implements Serializable {
	static int progNum = 11;
	String name;
	String tel;
	String corp;
	int userLevel;
	
	
	public Employee(){}
	public Employee(String name, String tel, String corp, int userlevel){
		this.name = name;
		this.tel = tel;
		this.corp = corp;
		this.userLevel = userlevel;
	}
	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append("---------------------------\n");
		buf.append("이름 : " + name + "\n");
		buf.append("전화 : " + tel  + "\n");
		buf.append("회사 : " + corp  + "\n");
		buf.append("등급 : " + userLevel  + "\n");
		return buf.toString();
	}
	 
}
