package jtable_exam;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	/**
	 * MemberVO 객체를 매개변수로 받아 Member 테이블에 insert하는 매소드
	 */
	public void insertMember(MemberVO memberVO) {
		
		String driver = "com.mysql.jdbc.Driver"; 
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "insert into member values(?,?,?,?,?,?,?,?,now())";
		Connection con = null; // db connection 
		PreparedStatement pstmt = null;// query 실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, memberVO.id); // 상품코드
			pstmt.setString(2, memberVO.passwd);
			pstmt.setString(3, memberVO.name);
			pstmt.setString(4, memberVO.email);
			pstmt.setString(5, memberVO.tel);
			pstmt.setString(6, memberVO.zipcode);			
			pstmt.setString(7, memberVO.addr1);
			pstmt.setString(8, memberVO.addr2);			
			
			pstmt.executeUpdate(); // insert update delete query executeUpdate()로 실행한다. 
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();

			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	/**
	 * MemberVO 객체를 매개변수로 받아 Member 테이블에서 id를 조건으로 1건 select 매소드
	 */
	public MemberVO getMemberById(MemberVO member) {
		MemberVO dbMember = new MemberVO();
		
		String driver = "com.mysql.jdbc.Driver"; 
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = " select * from member where id = ? ";
		Connection con = null; // db connection 
		PreparedStatement pstmt = null;// query 실행 객체
		ResultSet rs = null;
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, member.id);
			
			rs = pstmt.executeQuery(); // iinsert update delete query executeUpdate()로 실행한다
			
			while(rs.next()) {
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
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}		
		
		
		return dbMember;
		
	}

	/**
	 * MemberVO  객체를 매개변수로 받아 Member 테이블에서  where 조건은 id = ?
	 * name
	 * tel 
	 * email 을 수정하는 메소드 
	 */
	public void uptMember(MemberVO member) {
		String driver = "com.mysql.jdbc.Driver"; 
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "update member set name = ?, tel = ?, email = ? where id = ? ";
		Connection con = null; // db connection 
		PreparedStatement pstmt = null;// query 실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.name); // 상품코드
			pstmt.setString(2, member.tel);
			pstmt.setString(3, member.email);
			pstmt.setString(4, member.id);			
			
			pstmt.executeUpdate(); // insert update delete query executeUpdate()로 실행한다. 
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

	/**
	 *  Member 전체를 select해서 ArrayList에 저장하고 리턴 하는 매소드
	 */
	public List<MemberVO> getMemberAll(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		// db 에서 데이터를 select하고 ArrayList<Member>에 저장하고
		// 리턴하는 내용 완성 
		String driver = "com.mysql.jdbc.Driver"; 
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = " select * from member ";
		Connection con = null; // db connection 
		PreparedStatement pstmt = null;// query 실행 객체
		ResultSet rs = null;
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);
			
			rs = pstmt.executeQuery(); // insert update delete query executeUpdate()로 실행한다.
			
			while(rs.next()) {
				String id = rs.getString("id");
				String passwd = rs.getString("passwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				String zipcode = rs.getString("zipcode");
				String addr1 = rs.getString("addr1");
				String addr2 = rs.getString("addr2");
				
				MemberVO dbMember = new MemberVO();  
				
				dbMember.id = id;
				dbMember.passwd = passwd;
				dbMember.name = name;
				dbMember.email = email;
				dbMember.tel = tel;
				dbMember.zipcode = zipcode;
				dbMember.addr1 = addr1;
				dbMember.addr2 = addr2;
				
				list.add(dbMember);
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}		
		
		
		return list;
	}
	
	/**
	 * MemberVO 객체를 매개변수로 받아 Member 테이블에서 where 조건은 id = ?
	 * 을 이용하여 데이터 삭제하는 매소드
	 */
	public void delMember(MemberVO member) {
		String driver = "com.mysql.jdbc.Driver"; 
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8";
		String query = "delete from member where id = ? ";
		Connection con = null; // db connection 
		PreparedStatement pstmt = null;// query 실행 객체
		try{
			Class.forName(driver); // 드라이버 로딩 
			con = DriverManager.getConnection(url, "root", "st00"); // 컨넥션
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, member.id);			
			
			pstmt.executeUpdate(); // insert update delete query executeUpdate()로 실행한다. 
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

}
