package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mysql03 {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "update goods set name = ?, price = ?"+" where code = ?";
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement pstmt = null; //query���� ��ü
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "��������"); // ��ǰ�ڵ�
			pstmt.setInt(2, 100000);
			pstmt.setString(3, "C-100");
			;
			
			pstmt.executeUpdate(); //insert update delete  query executeUpdate()�� ����
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
