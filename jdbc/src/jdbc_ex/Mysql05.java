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
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement pstmt = null; //query���� ��ü
		ResultSet rs = null;// select ��� ResultSet ��ü�� �غ�
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			pstmt = con.prepareStatement(query);
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
