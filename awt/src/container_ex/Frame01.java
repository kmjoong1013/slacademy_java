package container_ex;

import java.awt.Frame;

public class Frame01 {

	public static void main(String[] args) {
		Frame frame = new Frame("������ ����"); //��輱 Ÿ��Ʋ�� �ִ�,�ּ�, �����ư�� �ִ� �Ϲ����� ������
		
		frame.setSize(300, 200);
		frame.setVisible(false);
		System.out.println(frame.isResizable());
	}
}
