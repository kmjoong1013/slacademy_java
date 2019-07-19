package layout_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayout01 extends Frame{
	public static void main(String[] args) {
		BorderLayout01 frame = new BorderLayout01();
		// BoderLayout �Ŵ����� ������ �� �����̳ʿ� �����Ѵ�.
		frame.setLayout(new BorderLayout());
		// �� ������Ʈ�� �����̳ʿ� �߰��Ѵ�
		frame.add("North", new Button("ù��°"));
		frame.add("East", new Button("�ι�°"));
		frame.add("West", new Button("����°"));
		frame.add("South", new Button("�׹�°"));
		frame.add("Center", new Button("�ټ���°"));
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
