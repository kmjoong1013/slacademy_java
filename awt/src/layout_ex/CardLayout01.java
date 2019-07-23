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
		Frame frame = new Frame("CardLayout �׽�Ʈ");
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
		// Frame�� �߰��� Component�� �̸��� "1"�� ���� �����ش�.
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
		// ���콺 ������ ��ư�� ������ ��
		if (e.getModifiers() == e.BUTTON3_MASK) {
			// CardLayout�� ���� Panel�� �����ش�.
			card.previous(frame);
		}else {
			// CardLayout�� ���� Panel�� �����ش�.
			card.next(frame);
		}
	}
}
