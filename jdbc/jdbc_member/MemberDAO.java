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
	 MemberVO 객체를 매개변수로 받아 Member 테이블에 insert하는 매소드
	 */
	public void insertMember(MemberVO memberVO) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "insert into member values(?,?,?,?,?,?,?,?,now())";
		Connection con = null; //커넥션 준비단계
		PreparedStatement psmt = null; //query실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			psmt = con.prepareStatement(query);
			psmt.setString(1, memberVO.id);//상품코드
			psmt.setString(2, memberVO.passwd);
			psmt.setString(3, memberVO.name);
			psmt.setString(4, memberVO.email);
			psmt.setString(5, memberVO.tel);
			psmt.setString(6, memberVO.zipcode);
			psmt.setString(7, memberVO.addr1);
			psmt.setString(8, memberVO.addr2);
			
			psmt.executeUpdate(); //insert update delete  query executeUpdate()로 실행
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
	 MemberVO 객체를 매개변수로 받아 Member 테이블에 id를 조건으로 1건 select하는 매소드
	 */
	public MemberVO getMemberById(MemberVO member) {
		MemberVO dbMember = new MemberVO();
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "select * from member where id = ? ";
		Connection con = null; //커넥션 준비단계
		PreparedStatement pstmt = null; //query실행 객체
		ResultSet rs = null;// select 결과 ResultSet 객체를 준비
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.id);
			rs = pstmt.executeQuery(); // insert update delete query executeUpdate()로 실행한다.
			
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
	 MemberVO  객체를 매개변수로 받아 Member 테이블에서  where 조건은 id = ?
	 name
	 tel
	 email을 수정하는 메소드
	 */
	public void uptMember(MemberVO memberVO) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "update member set name = ?, tel = ?, email = ? where id = ?";
		Connection con = null; //커넥션 준비단계
		PreparedStatement psmt = null; //query실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			
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
	  Member 전체를 select해서 ArrayList에 저장하고 리턴 하는 매소드
	 */
	public List<MemberVO> getMemberAll(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		// db 에서 데이터를 select하고 ArrayList<Member>에 저장하고
		// 리턴하는 내용 완성 
		
		MemberVO dbMember = new MemberVO();
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "select * from member";
		Connection con = null; //커넥션 준비단계
		PreparedStatement pstmt = null; //query실행 객체
		ResultSet rs = null;// select 결과 ResultSet 객체를 준비
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);
			
			rs = pstmt.executeQuery(); // insert update delete query executeUpdate()로 실행한다.
			
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
	 MemberVO 객체를 매개변수로 받아 Member 테이블에서 where 조건은 id = ?
	 을 이용하여 데이터 삭제하는 매소드
	 */
	public void delMember(MemberVO memberVO) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "delete from member where id = ?";
		Connection con = null; //커넥션 준비단계
		PreparedStatement psmt = null; //query실행 객체
		try {
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			psmt = con.prepareStatement(query);
			psmt.setString(1, memberVO.id);
			psmt.executeUpdate(); //insert update delete  query executeUpdate()로 실행
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
