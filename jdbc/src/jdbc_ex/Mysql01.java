package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mysql01 {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		Connection con = null; //커넥션 준비단계
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			System.out.println("connection ok!!!");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
				if(con != null) con.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
