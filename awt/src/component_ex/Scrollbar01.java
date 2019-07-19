package component_ex;

import java.awt.Frame;
import java.awt.Scrollbar;

public class Scrollbar01 {

	public static void main(String[] args) {
		Frame f = new Frame("scroll bar");
		Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL
				,10 //초기값
				,100 // 픽셀 단위의 크기
				,0 // minimum
				,300 // maximum 
				);
		
		System.out.println(sb.getValue());
		f.setLayout(null);
		f.add(sb);
		sb.setSize(200,20);
		sb.setLocation(10,50);
		f.setSize(300,200);
		f.setVisible(true);
	}
}
