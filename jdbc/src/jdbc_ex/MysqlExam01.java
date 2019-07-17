package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MysqlExam01 {

	public static void main(String[] args) {
		// mysql02�� �����ؼ� Ű����� ��ǰ�ڵ� ��ǰ�� �ܰ� ������ �Է� �ް� 
		// regDate now() ������ insert�ϴ� ���α׷��� �ϼ��Ͻÿ�.
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "insert into goods values(?,?,?,?,now())";
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement psmt = null; //query���� ��ü
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			psmt = con.prepareStatement(query);
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("��ǰ�ڵ� �Է� : ");
			String code = in.next();
			psmt.setString(1, code);//��ǰ�ڵ�
			
			System.out.print("��ǰ�̸� �Է� : ");
			String name = in.next();
			psmt.setString(2, name);
			
			System.out.print("���� �Է� : ");
			int price = in.nextInt();
			psmt.setInt(3, price);
			
			System.out.print("���� �Է� : ");
			String color = in.next();
			psmt.setString(4, color);
			
			psmt.executeUpdate(); //insert update delete  query executeUpdate()�� ����
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
