package component_ex;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingComponent01 extends JFrame{
	
	private JTextField nameField;
	private JComboBox countryBox;
	private JCheckBox hobbyMovieCheckBox;
	private JCheckBox hobbyReadingCheckBox;
	private JCheckBox hobbyRidingCheckBox;
	private JRadioButton maleBtn;
	private JRadioButton femaleBtn;
	private DefaultActionListener actionListener = new DefaultActionListener();
	private JTextArea content;
	
	public SwingComponent01() {
		super("스윙 컴포넌트 세트 1");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//메뉴 작성
		createMenu();
		
		// 내용 부분 폼
		createFormPart();
		
		// 하단 버튼
		createButtonPart();
		
		 pack();
	}

	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		//JMenu fileMenu = menuBar.add(new JMenu("파일"));
		JMenu fileMenu = new JMenu("파일");
		menuBar.add(fileMenu);
		
		JMenuItem saveMenuItem = fileMenu.add(new JMenuItem("저장"));
		saveMenuItem.setActionCommand("save");
		saveMenuItem.addActionListener(actionListener);
		JMenuItem exitMenuItem = fileMenu.add(new JMenuItem("종료"));
		exitMenuItem.setActionCommand("exit");
		exitMenuItem.addActionListener(actionListener);
		
		JMenu helpMenu = menuBar.add(new JMenu("도움말"));
		JMenuItem aboutMenuItem = helpMenu.add(
				new JMenuItem("스윙컴포넌트셋1은"));
		aboutMenuItem.setActionCommand("about");
		aboutMenuItem.addActionListener(actionListener);
		
		setJMenuBar(menuBar);
	}
	
	private void createFormPart() {
		JPanel formPanel = new JPanel();
		formPanel.setLayout(// boxlayout 은 행이나 열 방향으로 일력로 배치하며 끝을 만나도 줄 바꿈을 하지 않습니다.
				new BoxLayout(formPanel, BoxLayout.PAGE_AXIS));
		
		// 이름 영역
		formPanel.add(new JLabel("이름:"));// boxlayout에 라벨추가 
		nameField = new JTextField("이름을 입력하세요.");// boxlayout에 텍스트필드 추가
		formPanel.add(nameField);
		nameField.setAlignmentX(Component.LEFT_ALIGNMENT);
		nameField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) { // 포커스를 잃었을 때 
				JTextField txt = (JTextField)e.getSource();
				if(txt.getText().equals("")){
					txt.setText("이름을 입력하세요.");
				}
			}
			@Override
			public void focusGained(FocusEvent e) { // 포커스를 얻었을 때
				JTextField txt = (JTextField)e.getSource();
				if(txt.getText().equals("이름을 입력하세요.")){
					txt.setText("");
				}
			}
		});
		
		formPanel.add(Box.createRigidArea(new Dimension(0, 10))); // boxlayout의 세로 10 만큼위 공간 추가
		
		// 국가 영역
		formPanel.add(new JLabel("국가:"));
		//countryBox = new JComboBox<>();
		countryBox = new JComboBox();
		countryBox.addItem("한국");
		countryBox.addItem("중국");
		countryBox.addItem("일본");
		countryBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(countryBox);
		
		formPanel.add(Box.createRigidArea(new Dimension(0, 10))); // boxlayout의 세로 10 만큼위 공간 추가
		
		// 취미 영역
		formPanel.add(new JLabel("취미:"));
		JPanel hobbyPanel = new JPanel();
		
		hobbyMovieCheckBox = new JCheckBox("영화");
		hobbyReadingCheckBox = new JCheckBox("독서");
		hobbyRidingCheckBox = new JCheckBox("자전거");
		
		hobbyPanel.add(hobbyMovieCheckBox);
		hobbyPanel.add(hobbyReadingCheckBox);
		hobbyPanel.add(hobbyRidingCheckBox);
		
		hobbyPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(hobbyPanel);
		
		formPanel.add(Box.createRigidArea(new Dimension(0, 50))); // boxlayout의 세로 10 만큼위 공간 추가
		
		// 성별 영역
		formPanel.add(new JLabel("성별:"));
		JPanel fmPanel = new JPanel();
		maleBtn = new JRadioButton("남");
		femaleBtn = new JRadioButton("여");
		ButtonGroup group = new ButtonGroup();
		group.add(maleBtn);
		group.add(femaleBtn);
		
		fmPanel.add(maleBtn);
		fmPanel.add(femaleBtn);
		fmPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(fmPanel);
		
		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		
		// 소개 영역
		formPanel.add(new JLabel("소개:"));
		content = new JTextArea(5, 20);
		JScrollPane contentPane = new JScrollPane(content);
		formPanel.add(contentPane);
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		formPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		add(formPanel, BorderLayout.CENTER);
	}
	
	private void createButtonPart() {
		JPanel btnPanel = new JPanel();
		JButton saveButton = new JButton("저장");
		btnPanel.add(saveButton);
		
		saveButton.setActionCommand("save");
		saveButton.addActionListener(actionListener);
		add(btnPanel, BorderLayout.SOUTH);
	}
	private class DefaultActionListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// 메뉴 아이템을 클릭하면 동작한다.     
			if(e.getActionCommand().equals("save")){
				showInfo();
			 }else if(e.getActionCommand().equals("about")){
				 JOptionPane.showMessageDialog(null, "SwingSet 1!!!");
			 }else if(e.getActionCommand().equals("exit")){
				exit();
			 }
			 
		}
	}
	private void exit() {
		SwingComponent01.this.dispose();
	}
	
	private void showInfo() {
		String userid = nameField.getText();
		String country = (String)countryBox.getSelectedItem();
		String hobby = ""; 
		
		if (hobbyMovieCheckBox.isSelected()) {
			hobby = ";영화";
		}
		if (hobbyReadingCheckBox.isSelected()) {
			hobby = hobby + ";독서";
		}
		if (hobbyRidingCheckBox.isSelected()) {
			hobby = hobby + ";자전거";
		}
		
		String sex = "";
		
		if(maleBtn.isSelected()){
			sex = "m";
		}else if(femaleBtn.isSelected()){
			sex = "f";
		}else {
			sex = "x";
		}
		
		String info = (String)content.getText();
		
		System.out.println("userid:"+userid);
		System.out.println("country:"+country);
		System.out.println("hobby:"+hobby);
		System.out.println("sex:"+sex);
		System.out.println("info:"+info);
	}


	public static void main(String[] args) {
		SwingComponent01 compset = new SwingComponent01();
		compset.setVisible(true);
	}
}
