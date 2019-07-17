package jdbc_ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Mysql05 {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "select * from goods ";
		Connection con = null; //커넥션 준비단계
		PreparedStatement pstmt = null; //query실행 객체
		ResultSet rs = null;// select 결과 ResultSet 객체를 준비
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);
			//pstmt.setString(1, "B-100");
			
			rs = pstmt.executeQuery(); // select 문의 경우 ResultSet이 리턴
			
			while (rs.next()) {// rs.next() 다음 데이터가 있는지 체크하고 다음 데이터로 이동한다.
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String color = rs.getString("color");
				Date regDate = rs.getDate("regDate");
				
				System.out.println("-----------------------------");
				System.out.println(code + ":" + name + ":" + price);
				System.out.println(color + ":" + regDate);
			}
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
