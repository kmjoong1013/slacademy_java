package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MysqlExam03 {

	public static void main(String[] args) {
		/*
		 jdbc delete 예제를 참고해서 삭제할 상품 코드를 입력하면 해당 상품이 삭제되는
		 프로그램을 완성하시오. 
		 */
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		
		Scanner in = new Scanner(System.in);
		System.out.print("삭제할 상품 코드:");
		String code = in.next();
		
		String query = "delete from goods where code = ?";
		
		Connection con = null; //커넥션 준비단계
		PreparedStatement pstmt = null; //query실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, code);
			
			int cnt = pstmt.executeUpdate(); //insert update delete  query executeUpdate()로 실행
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
