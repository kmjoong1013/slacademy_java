package layout_ex;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class FlowLayout01 extends Frame{

	public Label label1;
	public Label label2;
	public Label label3;
	public Label label4;
	
	public FlowLayout01() {
	label1 = new Label("ù��° ��");	
	label2 = new Label("�ι�° ��");
	label3 = new Label("3��° ��");
	label4 = new Label("4��° ��");
	
	setLayout(new FlowLayout(FlowLayout.LEFT));
	
	add(label1);
	add(label2);
	add(label3);
	add(label4);
	
	setBounds(100,100,300,200);
	}
	
	public static void main(String[] args) {
		
		FlowLayout01 frame = new FlowLayout01();
		frame.setVisible(true);
	}
}
