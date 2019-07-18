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
	
	public void updateMember(MemberVO member) {
		System.out.println("id �Է� : ");
		String id = in.next();
		System.out.println("name ���� : ");
		String name = in.next();
		System.out.println("tel ���� : ");
		String tel = in.next();
		System.out.println("email ���� : ");
		String email = in.next();
		
		member.id = id;
		member.name = name;
		member.email = email;
		member.tel = tel;
	}
	
	public void eraseMember(MemberVO member) {
		System.out.print("���̵� : ");
		String id = in.next(); 
		
		member.id = id;
	}
	/*
	 ȸ������ (1.�Է� 2.���� 3.���� 4.��ü���� 0.���� ) 
	 ����� �����ϵ��� �ϼ��Ͻÿ�.
	 */
	public void loop() {
		int cmdNo = 0;

		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
//		MemberVO dbMember = memberDAO.getMemberById(memberVO);
		
		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("���ϴ� �޴��� �����Ͻʽÿ�.");
			System.out.println("1.�Է� 2.���� 3.���� 4.��ü���� 0.����");
			cmdNo = in.nextInt();

			if (cmdNo == 1) {
				inputMember(memberVO);
				memberDAO.insertMember(memberVO); // �޼ҵ� Ŭ������ �Է� �޼ҵ� ����
			}else if (cmdNo == 2) {
				updateMember(memberVO);
				memberDAO.uptMember(memberVO); // �޼ҵ� Ŭ������ ���� �޼ҵ� ����
			}else if (cmdNo == 3) {
				eraseMember(memberVO);
				memberDAO.delMember(memberVO); // �޼ҵ� Ŭ������ ���� �޼ҵ� ����
			}else if (cmdNo == 4) {
				memberDAO.getMemberAll();
				// �޼ҵ� Ŭ������ ��ȸ �޼ҵ� ����
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
