package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MysqlExam03 {

	public static void main(String[] args) {
		/*
		 jdbc delete ������ �����ؼ� ������ ��ǰ �ڵ带 �Է��ϸ� �ش� ��ǰ�� �����Ǵ�
		 ���α׷��� �ϼ��Ͻÿ�. 
		 */
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		
		Scanner in = new Scanner(System.in);
		System.out.print("������ ��ǰ �ڵ�:");
		String code = in.next();
		
		String query = "delete from goods where code = ?";
		
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement pstmt = null; //query���� ��ü
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, code);
			
			int cnt = pstmt.executeUpdate(); //insert update delete  query executeUpdate()�� ����
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
