package layout_ex;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayout01 {

	public static void main(String[] args) {
		Frame frame = new Frame("CardLayout 테스트");
		CardLayout card = new CardLayout(10,10);
		frame.setLayout(card);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.add(new Label("Card 1"));
		Panel panel2 = new Panel();
		panel2.add(new Label("Card 2"));
		panel2.setBackground(Color.orange);
		Panel panel3 = new Panel();
		panel3.add(new Label("Card 3"));
		panel3.setBackground(Color.cyan);
		
		frame.add(panel1,"1");
		frame.add(panel2,"2");
		frame.add(panel3,"3");
		
		panel1.addMouseListener(new Handler(frame, card));
		panel2.addMouseListener(new Handler(frame, card));
		panel3.addMouseListener(new Handler(frame, card));
		
		frame.setSize(200,200);
		frame.setLocation(200,200);
		frame.setVisible(true);
		// Frame에 추가된 Component중 이름이 "1"인 것을 보여준다.
		card.show(frame, "1");
		
	}
}
///////////////////////////////////////////////////
class Handler extends MouseAdapter{
	private Frame frame;
	private CardLayout card;
	
	public Handler (Frame frame, CardLayout card) {
		this.frame = frame;
		this.card = card;
	}
	public void mouseClicked(MouseEvent e) {
		// 마우스 오른쪽 버튼을 눌렀을 때
		if (e.getModifiers() == e.BUTTON3_MASK) {
			// CardLayout의 이전 Panel을 보여준다.
			card.previous(frame);
		}else {
			// CardLayout의 다음 Panel을 보여준다.
			card.next(frame);
		}
	}
}
