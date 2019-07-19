package component_ex;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class CheckboxRadio01 {

	public static void main(String[] args) {
		Frame frame = new Frame("checkbox test1");
		
		Panel p1 = new Panel();
		Checkbox chk1 = new Checkbox("옵션 1",false);
		Checkbox chk2 = new Checkbox("옵션 2", false);
		Checkbox chk3 = new Checkbox("옵션 3", false);
		
		p1.add(chk1);
		p1.add(chk2);
		p1.add(chk3);
		
		Panel p2 = new Panel(); 
		CheckboxGroup group = new CheckboxGroup();
		
		// checkbox가 group이 되면 radio 버튼 그룹이 된다.
		Checkbox chk11 = new Checkbox("라디오 옵션1",true,group);
		Checkbox chk22 = new Checkbox("라디오 옵션2",false,group);
		Checkbox chk33 = new Checkbox("라디오 옵션3",false,group);
		
		p2.add(chk11);
		p2.add(chk22);
		p2.add(chk33);
		
		frame.add(p1);
		frame.add(p2);
		
		frame.setLayout(new FlowLayout());
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
