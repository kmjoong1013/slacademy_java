package layout_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayout01 extends Frame{
	public static void main(String[] args) {
		BorderLayout01 frame = new BorderLayout01();
		// BoderLayout 매니저를 생성한 뒤 컨테이너에 설정한다.
		frame.setLayout(new BorderLayout());
		// 각 컴포넌트를 컨테이너에 추가한다
		frame.add("North", new Button("첫번째"));
		frame.add("East", new Button("두번째"));
		frame.add("West", new Button("세번째"));
		frame.add("South", new Button("네번째"));
		frame.add("Center", new Button("다섯번째"));
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
