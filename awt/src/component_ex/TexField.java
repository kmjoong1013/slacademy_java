package component_ex;

import java.awt.*;

public class TexField {

	public static void main(String[] args) {
		// 프레임 생성
		Frame f = new Frame("텍스트필드 영역 예제");
		
		// 텍스트 필드 생성 
		TextField txt1 = new TextField("초기 메세지", 10 );// 입력크기는 layout에 따라 자동 조절 
		
		txt1.select(2,4); //2~4까지 표시된 문자열 select
		txt1.setEditable(false);
		
		System.out.println(txt1.getText()); //전체 다 가져옴
		System.out.println(txt1.getSelectedText()); //selelct된 부분만 가져옴
		
		TextField txt2 = new TextField();
		
		txt2.setEchoChar('*');
		
		// 텍스트 영역 생성 
		TextArea text = new TextArea();
		
		f.add("North",txt1);
		f.add("Center",text);
		f.add("South",txt2);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
