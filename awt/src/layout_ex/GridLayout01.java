package layout_ex;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayout01 {

	public static void main(String[] args) {
		Frame frame = new Frame();
		// GridLayout �Ŵ����� ������ �� �����̳ʿ� �����Ѵ� 
		frame.setLayout(new GridLayout(2,3));
		// �� ������Ʈ�� �����̳ʿ� �߰��Ѵ�
		frame.add(new Button("ù��°"));
		frame.add(new Button("�ι�°"));
		frame.add(new Button("����°"));
		frame.add(new Button("�׹�°"));
		frame.add(new Button("�ټ���°"));
		frame.add(new Button("������°"));
		// ������Ʈ ���� ��ġ�� ���� ���� �þ�� �߰��ȴ�.
		frame.add(new Button("�ϰ���°"));
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
