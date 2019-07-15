package exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GoodsOrderManage {
	List<Goods> goodsList;
	
	public GoodsOrderManage(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	
	public void goodsOrder() {
		Scanner in = new Scanner(System.in);
		System.out.print("�ֹ��� ��ǰ�ڵ� : ");
		String code = in.next(); // ��ǰ�ڵ�
		
		Date d1 = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd");
		String d1Str = sf.format(d1);
		
		boolean a = false;
		
		for (int i = 0; i < goodsList.size(); i++) {
			Goods goods = (Goods)goodsList.get(i);
			
			
			if(code.equals(goods.code)) {
				a=true;
				System.out.println("��ġ�ϴ� ��ǰ�ڵ带 ã�ҽ��ϴ�. ������ �Է����ּ��� : ");
				int qnt = in.nextInt();
				
				
				if (goods.qnt>=qnt && goods.qnt !=0) {
					goods.qnt = goods.qnt - qnt;
					System.out.println("�ֹ��� �����Ͽ����ϴ�.");
					System.out.println("------------------------------------");
					System.out.println(d1Str+" �ֹ� Ȯ�μ�");
					System.out.println("��ǰ�ڵ� : "+goods.code);
					System.out.println("��ǰ�� : "+goods.name);
					System.out.println("����Ŀ : "+goods.maker);
					System.out.println("���� : "+goods.price);
					System.out.println("�ֹ� ���� : "+qnt);
					System.out.println("�� �ݾ� : "+(goods.price * qnt)+"��");
					System.out.println("------------------------------------");
					System.out.println("���� ���� : "+goods.qnt);
					break;
				}else {
					System.out.println("��� �ʰ��Ͽ����ϴ�. ������ �ٿ��ּ���");
					break;
				}
				
			}else {
				continue;
			}
		}
		if(a==false) {
			System.out.println("��ġ�ϴ� ��ǰ�ڵ尡 �����ϴ�. �ٽ� �Է����ּ���.");
		}
	}
	

}
