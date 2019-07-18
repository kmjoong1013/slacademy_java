package jdbc_member;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDAO {
	Scanner in = new Scanner(System.in);
	/*
	 MemberVO ��ü�� �Ű������� �޾� Member ���̺� insert�ϴ� �żҵ�
	 */
	public void insertMember(MemberVO memberVO) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "insert into member values(?,?,?,?,?,?,?,?,now())";
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement psmt = null; //query���� ��ü
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			psmt = con.prepareStatement(query);
			psmt.setString(1, memberVO.id);//��ǰ�ڵ�
			psmt.setString(2, memberVO.passwd);
			psmt.setString(3, memberVO.name);
			psmt.setString(4, memberVO.email);
			psmt.setString(5, memberVO.tel);
			psmt.setString(6, memberVO.zipcode);
			psmt.setString(7, memberVO.addr1);
			psmt.setString(8, memberVO.addr2);
			
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
	
	/*
	 MemberVO ��ü�� �Ű������� �޾� Member ���̺� id�� �������� 1�� select�ϴ� �żҵ�
	 */
	public MemberVO getMemberById(MemberVO member) {
		MemberVO dbMember = new MemberVO();
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "select * from member where id = ? ";
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement pstmt = null; //query���� ��ü
		ResultSet rs = null;// select ��� ResultSet ��ü�� �غ�
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.id);
			rs = pstmt.executeQuery(); // insert update delete query executeUpdate()�� �����Ѵ�.
			
			while (rs.next()) {
				String id = rs.getString("id");
				String passwd = rs.getString("passwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				String zipcode = rs.getString("zipcode");
				String addr1 = rs.getString("addr1");
				String addr2 = rs.getString("addr2");
				
				dbMember.id = id;
				dbMember.passwd = passwd;
				dbMember.name = name;
				dbMember.email = email;
				dbMember.tel = tel;
				dbMember.zipcode = zipcode;
				dbMember.addr1 = addr1;
				dbMember.addr2 = addr2;
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
		return dbMember;
	}
	/**
	 MemberVO  ��ü�� �Ű������� �޾� Member ���̺���  where ������ id = ?
	 name
	 tel
	 email�� �����ϴ� �޼ҵ�
	 */
	public void uptMember(MemberVO memberVO) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "update member set name = ?, tel = ?, email = ? where id = ?";
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement psmt = null; //query���� ��ü
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			
			psmt = con.prepareStatement(query);
			
			psmt.setString(1, memberVO.name);
			psmt.setString(2, memberVO.tel);
			psmt.setString(3, memberVO.email);
			psmt.setString(4, memberVO.id);
			
			psmt.executeUpdate();
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
	
	/*
	  Member ��ü�� select�ؼ� ArrayList�� �����ϰ� ���� �ϴ� �żҵ�
	 */
	public List<MemberVO> getMemberAll(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		// db ���� �����͸� select�ϰ� ArrayList<Member>�� �����ϰ�
		// �����ϴ� ���� �ϼ� 
		
		MemberVO dbMember = new MemberVO();
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "select * from member";
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement pstmt = null; //query���� ��ü
		ResultSet rs = null;// select ��� ResultSet ��ü�� �غ�
		try{
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			pstmt = con.prepareStatement(query);
			
			rs = pstmt.executeQuery(); // insert update delete query executeUpdate()�� �����Ѵ�.
			
			int i = 0;
			
			while (rs.next()) {
				String id = rs.getString("id");
				String passwd = rs.getString("passwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				String zipcode = rs.getString("zipcode");
				String addr1 = rs.getString("addr1");
				String addr2 = rs.getString("addr2");
				
				dbMember.id = id;
				dbMember.passwd = passwd;
				dbMember.name = name;
				dbMember.email = email;
				dbMember.tel = tel;
				dbMember.zipcode = zipcode;
				dbMember.addr1 = addr1;
				dbMember.addr2 = addr2;
				
				list.add(dbMember);
				
				MemberVO member = (MemberVO)list.get(i);
				
				System.out.println("----------------------------");
				System.out.println("id:"+member.id);
				System.out.println("passwd:"+member.passwd);
				System.out.println("name:"+member.name);
				System.out.println("email:"+member.email);
				System.out.println("tel:"+member.tel);
				System.out.println("zipcode:"+member.zipcode);
				System.out.println("addr1:"+member.addr1);
				System.out.println("addr2:"+member.addr2);
				
				i++;
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
		
		return list;
	}
	/*
	 MemberVO ��ü�� �Ű������� �޾� Member ���̺��� where ������ id = ?
	 �� �̿��Ͽ� ������ �����ϴ� �żҵ�
	 */
	public void delMember(MemberVO memberVO) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "delete from member where id = ?";
		Connection con = null; //Ŀ�ؼ� �غ�ܰ�
		PreparedStatement psmt = null; //query���� ��ü
		try {
			Class.forName(driver); // ����̹� �ε� 
			con = DriverManager.getConnection(url, "root", "st00"); // ���ؼ�
			psmt = con.prepareStatement(query);
			psmt.setString(1, memberVO.id);
			psmt.executeUpdate(); //insert update delete  query executeUpdate()�� ����
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(con != null) con.close();
				if (psmt != null) psmt.close();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
