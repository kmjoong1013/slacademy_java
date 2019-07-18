package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MysqlExam02 {

	public static void main(String[] args) {
		/* update ������ �����ؼ� ������ ��ǰ�ڵ�� ������ �ʵ�(name or price or color)
		 �� ������ ���� �Է� �޾Ƽ� �����ϴ� ���α׷��� �ϼ��Ͻÿ�.
		 ��)
		 ������ ��ǰ �ڵ� : A-100
		 ������ �ʵ�(name or price or color) : name
		 ������ �� : �ֶ߰ų����
		 */
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		
		Scanner in = new Scanner(System.in);
		System.out.print("������ ��ǰ�ڵ� �Է� : ");
		String code = in.next();
		
		System.out.print("������ �ʵ�(name or price or color) �Է� : ");
		String fieldName = in.next();
		/*
		 * if (fieldName.equals("name")) { fieldName = "name"; }else if
		 * (fieldName.equals("price")) { fieldName = "price"; }else if
		 * (fieldName.equals("color")) { fieldName = "color"; }
		 */
		
		System.out.print("������ �� �Է� : ");
		String value = in.next();
		
		String query =" update goods set " + fieldName  + " = ?  where code = ? ";
		
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement psmt = null; //query���� ��ü
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			psmt = con.prepareStatement(query);
		
			psmt.setString(1, value);//������ ��
			psmt.setString(2, code);//��ǰ�ڵ�
			//psmt.setString(2, fieldName);//�ʵ����
			
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
