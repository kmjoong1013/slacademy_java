package container_ex;

import java.awt.Frame;

public class Frame01 {

	public static void main(String[] args) {
		Frame frame = new Frame("프레임 예제"); //경계선 타이틀바 최대,최소, 종료버튼이 있는 일반적인 윈도우
		
		frame.setSize(300, 200);
		frame.setVisible(false);
		System.out.println(frame.isResizable());
	}
}
