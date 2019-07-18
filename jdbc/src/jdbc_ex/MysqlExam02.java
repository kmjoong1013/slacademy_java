package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MysqlExam02 {

	public static void main(String[] args) {
		/* update 예제를 참고해서 수정할 상품코드와 수정할 필드(name or price or color)
		 와 변경할 값을 입력 받아서 변경하는 프로그램을 완성하시오.
		 예)
		 수정할 상품 코드 : A-100
		 수정할 필드(name or price or color) : name
		 수정할 값 : 핫뜨거냉장고
		 */
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		
		Scanner in = new Scanner(System.in);
		System.out.print("수정할 상품코드 입력 : ");
		String code = in.next();
		
		System.out.print("수정할 필드(name or price or color) 입력 : ");
		String fieldName = in.next();
		/*
		 * if (fieldName.equals("name")) { fieldName = "name"; }else if
		 * (fieldName.equals("price")) { fieldName = "price"; }else if
		 * (fieldName.equals("color")) { fieldName = "color"; }
		 */
		
		System.out.print("수정할 값 입력 : ");
		String value = in.next();
		
		String query =" update goods set " + fieldName  + " = ?  where code = ? ";
		
		Connection con = null; //커넥션 준비단계
		PreparedStatement psmt = null; //query실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			psmt = con.prepareStatement(query);
		
			psmt.setString(1, value);//수정할 값
			psmt.setString(2, code);//상품코드
			//psmt.setString(2, fieldName);//필드네임
			
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
