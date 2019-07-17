package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mysql02 {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "insert into goods values(?,?,?,?,now())";
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement psmt = null; //query���� ��ü
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			psmt = con.prepareStatement(query);
			psmt.setString(1, "C-100");//��ǰ�ڵ�
			psmt.setString(2, "�ǲǾ������");
			psmt.setInt(3, 190000);
			psmt.setString(4, "white");
			
			psmt.executeUpdate(); //insert update delete  query executeUpdate()�� ����
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
