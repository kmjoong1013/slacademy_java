package jtable_exam;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;

public class JTable03_insPanel extends JPanel {
	public JTextField txtId; 
	public JComboBox cboSite;
	private JPasswordField passwd;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JPanel thisPanel;
	
	public JTable03_insPanel(){
		thisPanel = this;
		setLayout(null);
		// 이름 영역
		JLabel label = new JLabel("아    이    디:");
		label.setBounds(25, 10, 100, 25);
		add(label);
		txtId = new JTextField("");
		txtId.setLocation(137, 13);
		txtId.setSize(243, 19);
		add(txtId);
		// 국가 영역
		JLabel label_1 = new JLabel("이    메    일:");
		label_1.setBounds(25, 130, 100, 19);
		add(label_1);
		cboSite = new JComboBox();
		cboSite.setModel(new DefaultComboBoxModel(new String[] {"--선택--", "naver.com", "daum.net", "google.com"}));
		cboSite.setLocation(257, 128);
		cboSite.setSize(109, 23);
		add(cboSite);

		JLabel label_2 = new JLabel("이          름:");
		label_2.setLocation(25, 74);
		label_2.setSize(100, 33);
		add(label_2);

		JLabel label_3 = new JLabel("암         호:");
		label_3.setLocation(25, 42);
		label_3.setSize(100, 33);
		add(label_3);

		JLabel label_4 = new JLabel("전 화 번 호 :");
		label_4.setLocation(25, 159);
		label_4.setSize(100, 23);
		add(label_4);
		JScrollPane contentPane = new JScrollPane();
		contentPane.setLocation(464, 0);
		contentPane.setSize(-3, 4);
		add(contentPane);


		passwd = new JPasswordField();
		passwd.setBounds(137, 42, 243, 21);
		add(passwd);
		
		txtName = new JTextField();
		txtName.setBounds(139, 80, 241, 21);
		add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(143, 129, 83, 21);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("@");
		lblNewLabel.setBounds(235, 132, 21, 15);
		add(lblNewLabel);
		
		txtTel = new JTextField();
		txtTel.setBounds(140, 160, 240, 21);
		add(txtTel);
		txtTel.setColumns(10);
		
		JButton buttonSelect = new JButton("조회");
		JButton button = new JButton("저장");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// MemberVO와 MemberDAO를 활용해서 db에 회원정보를 insert하는 부분을 완성하시오.
				
				if (button != null) {
					
				}
				
				if(txtId.getText().equals("")) {
					JOptionPane.showMessageDialog(thisPanel,"아이디를 입력해주세요.","오류",JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(button.getText().equals("수정")) {
					// 수정(update) 내용 추가
					button.setText("저장");
					txtId.setEditable(true);
					buttonSelect.setEnabled(true);
				}else {
					
				}
			}
		});
		button.setBounds(159, 233, 97, 23);
		add(button);
		
		buttonSelect.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// 아이디를 입력하면 아이디에 해당하는 데이터를 조회해서 출력하는 내용을 완성하시오.
				// (MemberVO와 MemberDAO를 사용)
				if(txtId.getText().equals("")) {
					JOptionPane.showMessageDialog(thisPanel,"아이디를 입력해주세요.","오류",JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				
				button.setText("수정");
				buttonSelect.setEnabled(false);
				txtId.setEditable(false);
			}
		});
		buttonSelect.setBounds(279, 233, 97, 23);
		add(buttonSelect);
		
		
		
	}	
}






