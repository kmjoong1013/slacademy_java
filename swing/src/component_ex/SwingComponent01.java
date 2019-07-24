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
		super("���� ������Ʈ ��Ʈ 1");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//�޴� �ۼ�
		createMenu();
		
		// ���� �κ� ��
		createFormPart();
		
		// �ϴ� ��ư
		createButtonPart();
		
		 pack();
	}

	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		//JMenu fileMenu = menuBar.add(new JMenu("����"));
		JMenu fileMenu = new JMenu("����");
		menuBar.add(fileMenu);
		
		JMenuItem saveMenuItem = fileMenu.add(new JMenuItem("����"));
		saveMenuItem.setActionCommand("save");
		saveMenuItem.addActionListener(actionListener);
		JMenuItem exitMenuItem = fileMenu.add(new JMenuItem("����"));
		exitMenuItem.setActionCommand("exit");
		exitMenuItem.addActionListener(actionListener);
		
		JMenu helpMenu = menuBar.add(new JMenu("����"));
		JMenuItem aboutMenuItem = helpMenu.add(
				new JMenuItem("����������Ʈ��1��"));
		aboutMenuItem.setActionCommand("about");
		aboutMenuItem.addActionListener(actionListener);
		
		setJMenuBar(menuBar);
	}
	
	private void createFormPart() {
		JPanel formPanel = new JPanel();
		formPanel.setLayout(// boxlayout �� ���̳� �� �������� �Ϸ·� ��ġ�ϸ� ���� ������ �� �ٲ��� ���� �ʽ��ϴ�.
				new BoxLayout(formPanel, BoxLayout.PAGE_AXIS));
		
		// �̸� ����
		formPanel.add(new JLabel("�̸�:"));// boxlayout�� ���߰� 
		nameField = new JTextField("�̸��� �Է��ϼ���.");// boxlayout�� �ؽ�Ʈ�ʵ� �߰�
		formPanel.add(nameField);
		nameField.setAlignmentX(Component.LEFT_ALIGNMENT);
		nameField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) { // ��Ŀ���� �Ҿ��� �� 
				JTextField txt = (JTextField)e.getSource();
				if(txt.getText().equals("")){
					txt.setText("�̸��� �Է��ϼ���.");
				}
			}
			@Override
			public void focusGained(FocusEvent e) { // ��Ŀ���� ����� ��
				JTextField txt = (JTextField)e.getSource();
				if(txt.getText().equals("�̸��� �Է��ϼ���.")){
					txt.setText("");
				}
			}
		});
		
		formPanel.add(Box.createRigidArea(new Dimension(0, 10))); // boxlayout�� ���� 10 ��ŭ�� ���� �߰�
		
		// ���� ����
		formPanel.add(new JLabel("����:"));
		//countryBox = new JComboBox<>();
		countryBox = new JComboBox();
		countryBox.addItem("�ѱ�");
		countryBox.addItem("�߱�");
		countryBox.addItem("�Ϻ�");
		countryBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(countryBox);
		
		formPanel.add(Box.createRigidArea(new Dimension(0, 10))); // boxlayout�� ���� 10 ��ŭ�� ���� �߰�
		
		// ��� ����
		formPanel.add(new JLabel("���:"));
		JPanel hobbyPanel = new JPanel();
		
		hobbyMovieCheckBox = new JCheckBox("��ȭ");
		hobbyReadingCheckBox = new JCheckBox("����");
		hobbyRidingCheckBox = new JCheckBox("������");
		
		hobbyPanel.add(hobbyMovieCheckBox);
		hobbyPanel.add(hobbyReadingCheckBox);
		hobbyPanel.add(hobbyRidingCheckBox);
		
		hobbyPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(hobbyPanel);
		
		formPanel.add(Box.createRigidArea(new Dimension(0, 50))); // boxlayout�� ���� 10 ��ŭ�� ���� �߰�
		
		// ���� ����
		formPanel.add(new JLabel("����:"));
		JPanel fmPanel = new JPanel();
		maleBtn = new JRadioButton("��");
		femaleBtn = new JRadioButton("��");
		ButtonGroup group = new ButtonGroup();
		group.add(maleBtn);
		group.add(femaleBtn);
		
		fmPanel.add(maleBtn);
		fmPanel.add(femaleBtn);
		fmPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(fmPanel);
		
		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		
		// �Ұ� ����
		formPanel.add(new JLabel("�Ұ�:"));
		content = new JTextArea(5, 20);
		JScrollPane contentPane = new JScrollPane(content);
		formPanel.add(contentPane);
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		formPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		add(formPanel, BorderLayout.CENTER);
	}
	
	private void createButtonPart() {
		JPanel btnPanel = new JPanel();
		JButton saveButton = new JButton("����");
		btnPanel.add(saveButton);
		
		saveButton.setActionCommand("save");
		saveButton.addActionListener(actionListener);
		add(btnPanel, BorderLayout.SOUTH);
	}
	private class DefaultActionListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// �޴� �������� Ŭ���ϸ� �����Ѵ�.     
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
			hobby = ";��ȭ";
		}
		if (hobbyReadingCheckBox.isSelected()) {
			hobby = hobby + ";����";
		}
		if (hobbyRidingCheckBox.isSelected()) {
			hobby = hobby + ";������";
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
