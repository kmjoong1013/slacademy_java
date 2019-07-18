package jdbc_member;

import java.util.Scanner;

public class MemberMgr {
	
	Scanner in = new Scanner(System.in);
	
	public void inputMember(MemberVO member) { //ȸ������ �޼ҵ�
		System.out.print("���̵� : ");
		String id = in.next(); 
		System.out.print("�н����� : ");
		String passwd = in.next(); 
		System.out.print("�̸� : ");
		String name = in.next(); 
		System.out.print("�̸��� : ");
		String email = in.next(); 
		System.out.print("��ȭ��ȣ : ");
		String tel = in.next(); 
		System.out.print("�����ȣ : ");
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
	
	/*ȸ�������� ���̵�� 1�� ��ȸ�ϴ� �޼ҵ�*/
	public void inputMemberId(MemberVO member) {
		
		System.out.print("id : ");
		String id = in.next();
		
		member.id = id;
	}
	//member���� ���
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
