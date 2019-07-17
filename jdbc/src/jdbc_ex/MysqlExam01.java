package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MysqlExam01 {

	public static void main(String[] args) {
		// mysql02를 참조해서 키보드로 상품코드 상품명 단가 색상을 입력 받고 
		// regDate now() 값으로 insert하는 프로그램을 완성하시오.
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "insert into goods values(?,?,?,?,now())";
		Connection con = null; //커넥션 준비단계
		PreparedStatement psmt = null; //query실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			psmt = con.prepareStatement(query);
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("상품코드 입력 : ");
			String code = in.next();
			psmt.setString(1, code);//상품코드
			
			System.out.print("상품이름 입력 : ");
			String name = in.next();
			psmt.setString(2, name);
			
			System.out.print("가격 입력 : ");
			int price = in.nextInt();
			psmt.setInt(3, price);
			
			System.out.print("색상 입력 : ");
			String color = in.next();
			psmt.setString(4, color);
			
			psmt.executeUpdate(); //insert update delete  query executeUpdate()로 실행
			System.out.println("connection ok!!!");
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
