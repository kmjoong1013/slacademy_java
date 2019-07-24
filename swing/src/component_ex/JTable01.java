package component_ex;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("명단");
		frame.setSize(300, 150);
		frame.setLocation(500,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = frame.getContentPane();
		
		String colNames[] = {"이름", "나이","성별"};
		Object data[][] = {{"김철수", 24, '남'},
							{"이순희", 21, '여'},
							{"박지영", 24, '여'}}; 
		JTable table = new JTable(data, colNames);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JButton button = new JButton("출력");
		contentPane.add(button, BorderLayout.SOUTH);          
		
		frame.pack();
		frame.setVisible(true);
	}
}
