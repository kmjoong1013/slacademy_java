package layout_ex;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayout01 {

	public static void main(String[] args) {
		Frame frame = new Frame();
		// GridLayout 매니저를 생성한 뒤 컨테이너에 설정한다 
		frame.setLayout(new GridLayout(2,3));
		// 각 컴포넌트를 컨테이너에 추가한다
		frame.add(new Button("첫번째"));
		frame.add(new Button("두번째"));
		frame.add(new Button("세번째"));
		frame.add(new Button("네번째"));
		frame.add(new Button("다섯번째"));
		frame.add(new Button("여섯번째"));
		// 컴포넌트 수가 넘치면 셀의 수가 늘어나고 추가된다.
		frame.add(new Button("일곱번째"));
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
