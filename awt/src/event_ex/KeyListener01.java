package event_ex;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListener01 implements KeyListener{

	public static void main(String[] args) {
		// 프레임 생성
		Frame f = new Frame("텍스트필드 영역  예제");
		
		// 텍스트 필드 생성 
		TextField txt1 = new TextField("초기 메세지", 10 );// 입력크기는 layout에 따라 자동 조절 
		
		txt1.addKeyListener(new KeyListener01());
		
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
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
		//getModifiers() shift ctrl alt 키가 눌렸음을 확인
		if(e.getModifiers() == KeyEvent.SHIFT_MASK) {
			System.out.println("shift mask");
		}
		char ch = e.getKeyChar();//
		
		TextField txt = (TextField)e.getSource();
		if(ch == KeyEvent.VK_ENTER) {
			txt.setText("");
			System.out.println("Enter key 가 눌릴때의 처리");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased");
	}
}
