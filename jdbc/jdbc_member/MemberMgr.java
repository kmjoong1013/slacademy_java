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
	
	public void updateMember(MemberVO member) {
		System.out.println("id 입력 : ");
		String id = in.next();
		System.out.println("name 수정 : ");
		String name = in.next();
		System.out.println("tel 수정 : ");
		String tel = in.next();
		System.out.println("email 수정 : ");
		String email = in.next();
		
		member.id = id;
		member.name = name;
		member.email = email;
		member.tel = tel;
	}
	
	public void eraseMember(MemberVO member) {
		System.out.print("아이디 : ");
		String id = in.next(); 
		
		member.id = id;
	}
	/*
	 회원정보 (1.입력 2.수정 3.삭제 4.전체보기 0.종료 ) 
	 기능을 수행하도록 완성하시오.
	 */
	public void loop() {
		int cmdNo = 0;

		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
//		MemberVO dbMember = memberDAO.getMemberById(memberVO);
		
		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("원하는 메뉴를 선택하십시오.");
			System.out.println("1.입력 2.수정 3.삭제 4.전체보기 0.종료");
			cmdNo = in.nextInt();

			if (cmdNo == 1) {
				inputMember(memberVO);
				memberDAO.insertMember(memberVO); // 메소드 클래스의 입력 메소드 실행
			}else if (cmdNo == 2) {
				updateMember(memberVO);
				memberDAO.uptMember(memberVO); // 메소드 클래스의 수정 메소드 실행
			}else if (cmdNo == 3) {
				eraseMember(memberVO);
				memberDAO.delMember(memberVO); // 메소드 클래스의 삭제 메소드 실행
			}else if (cmdNo == 4) {
				memberDAO.getMemberAll();
				// 메소드 클래스의 조회 메소드 실행
			}else {
				System.exit(0);
				break;
			}			
		}
	}
	public static void main(String[] args) {
		//obj.inputMember(memberVO);
		//memberDAO.insertMember(memberVO);
		
		MemberMgr obj = new MemberMgr();
		obj.loop();
	}
}
