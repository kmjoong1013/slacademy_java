package jdbc_ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MysqlExam04 {

	public static void main(String[] args) throws SQLException {
		/*
		 jdbc select ������ �����ؼ� *�� �Է��ϸ� ��ǰ ��ü�� ��ǰ�ڵ带 �Է��ϸ�
		 �ش� ��ǰ�� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
		 
		 ��ǰ ��� ���� ( * or ��ǰ �ڵ�) 
		 *
		 A-100 ...
		 B-100 ...
		 C-100 ...
		 ��ǰ ��� ���� ( * or ��ǰ �ڵ�)
		 A-100
		 A-100...
		 */
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement pstmt = null; //query���� ��ü
		ResultSet rs = null;// select ��� ResultSet ��ü�� �غ�
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		
		String query = "";
		Scanner in = new Scanner(System.in);
		System.out.println("��ǰ ��� ���� ( * or ��ǰ �ڵ�)");
		String input = in.next();
		
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			
			if (input.equals("*")) {
				query = "select * from goods";
				pstmt = con.prepareStatement(query);
			}else  {
				query = "select * from goods where code = ?";
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, input);
			}
			
			//pstmt.setString(1, "B-100");
			
			rs = pstmt.executeQuery(); // select ���� ��� ResultSet�� ����
			
			while (rs.next()) {// rs.next() ���� �����Ͱ� �ִ��� üũ�ϰ� ���� �����ͷ� �̵��Ѵ�.
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
