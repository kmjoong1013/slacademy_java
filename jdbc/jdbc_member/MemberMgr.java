package jdbc_member;

import java.util.Scanner;

public class MemberMgr {
	
	Scanner in = new Scanner(System.in);
	
	public void inputMember(MemberVO member) { //회원가입 메소드
		System.out.print("아이디 : ");
		String id = in.next(); 
		System.out.print("패스워드 : ");
		String passwd = in.next(); 
		System.out.print("이름 : ");
		String name = in.next(); 
		System.out.print("이메일 : ");
		String email = in.next(); 
		System.out.print("전화번호 : ");
		String tel = in.next(); 
		System.out.print("우편번호 : ");
		String zipcode = in.next(); 
		
		member.id = id;
		member.passwd = passwd;
		member.name = name;
		member.email = email;
		member.tel = tel;
		member.zipcode = zipcode;
		member.addr1 = "";
		member.addr2 = "";
	}
	
	/*회원정보를 아이디로 1건 조회하는 메소드*/
	public void inputMemberId(MemberVO member) {
		
		System.out.print("id : ");
		String id = in.next();
		
		member.id = id;
	}
	//member정보 출력
	public void prnMember(MemberVO member) {
		System.out.println("id:"+member.id);
		System.out.println("passwd:"+member.passwd);
		System.out.println("name:"+member.name);
		System.out.println("email:"+member.email);
		System.out.println("tel:"+member.tel);
		System.out.println("zipcode:"+member.zipcode);
		System.out.println("addr1:"+member.addr1);
		System.out.println("addr2:"+member.addr2);
	}
	
	public static void main(String[] args) {
		
		MemberMgr obj = new MemberMgr();
		MemberVO memberVO = new MemberVO();
		//obj.inputMember(memberVO);
		obj.inputMemberId(memberVO);
		
		MemberDAO memberDAO = new MemberDAO();
		//memberDAO.insertMember(memberVO);
		MemberVO dbMember = memberDAO.getMemberById(memberVO);
		
		obj.prnMember(dbMember);
	}
}
