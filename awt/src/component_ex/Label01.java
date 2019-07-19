package component_ex;

import java.awt.*;

public class Label01 extends Frame{
	Label label1;
	Label label2;
	static final long serialVersionUID =1; 
	public Label01(){
		super("라벨 테스트1");
		
		setLayout(new FlowLayout());
		
		label1 = new Label("첫번째 라벨");
		label2 = new Label("두번째 라벨");
		label1.setBackground(Color.LIGHT_GRAY);
		
		add(label1);
		add(label2);
		
		setBounds(100,100,300,200);
	}
	
	public static void main(String[] args) {
		Label01 win = new Label01();
		win.setVisible(true);
	}
}
