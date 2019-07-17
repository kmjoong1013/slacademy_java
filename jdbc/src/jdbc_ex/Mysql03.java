package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mysql03 {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "update goods set name = ?, price = ?"+" where code = ?";
		Connection con = null; //커넥션 준비단계
		PreparedStatement pstmt = null; //query실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "알쥐냉장고"); // 상품코드
			pstmt.setInt(2, 100000);
			pstmt.setString(3, "C-100");
			;
			
			pstmt.executeUpdate(); //insert update delete  query executeUpdate()로 실행
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
				if(con != null) con.close();
				if (pstmt != null) pstmt.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
