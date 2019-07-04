package basic_syntax_ex.exam;

import java.util.Scanner;

public class WhileExam01 {
	
		static void sub() {
			System.out.println("상품 1 : 시원해 냉장고 12000");
			System.out.println("상품 2 : 따듯해 냉장고 11000");
			System.out.println("상품 3 : 싱글 냉장고 90000");
		}
	
	public static void main(String[] args) {
		/*
		while문 이용해서 반복 하고 a 가 -99 이면 종료
		
		아래 내용이 출력 되고(method사용)
		상품 1 : 시원해 냉장고 12000
		상품 2 : 따듯해 냉장고 11000
		상품 3 : 싱글 냉장고 90000
		
		상품 번호와 수량을 입력 하면 금액이 출력되도록 완성하시오
		 */
		
		int num,pcs;
		sub();
		
		while (true) {
			Scanner bun = new Scanner(System.in);
			System.out.print("상품 번호 입력 : (종료-99) ");
			num = bun.nextInt();
					if (num==-99) {
						break;
					}else {
						if (num==1) {
							Scanner su = new Scanner(System.in);
							System.out.print("수량 입력 : ");
							pcs = su.nextInt();
							System.out.println(pcs*12000+"원");
						}else if(num==2) {
							Scanner su = new Scanner(System.in);
							System.out.print("수량 입력 : ");
							pcs = su.nextInt();
							System.out.println(pcs*11000+"원");
						}else if(num==3) {
							Scanner su = new Scanner(System.in);
							System.out.print("수량 입력 : ");
							pcs = su.nextInt();
							System.out.println(pcs*90000+"원");
						}
					}
					System.out.println();
				}
		}
	}

