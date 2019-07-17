package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mysql02 {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "insert into goods values(?,?,?,?,now())";
		Connection con = null; //커넥션 준비단계
		PreparedStatement psmt = null; //query실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			psmt = con.prepareStatement(query);
			psmt.setString(1, "C-100");//상품코드
			psmt.setString(2, "꽁꽁얼어냉장고");
			psmt.setInt(3, 190000);
			psmt.setString(4, "white");
			
			psmt.executeUpdate(); //insert update delete  query executeUpdate()로 실행
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
				if(con != null) con.close();
				if (psmt != null) psmt.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
