package jtable_exam;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable03_listPanel extends JPanel {

		private static final long serialVersionUID = 1L;
		private JButton btnSearch = null;
		private JTable table;
		private JScrollPane scrollPane;

		public JTable03_listPanel() {
			//setSize(470,500);
			setLayout(null);
			
			
			String colNames[] = {"���̵�","��ȣ","�̸�","�̸���","��ȭ��ȣ"};
			DefaultTableModel model = new DefaultTableModel(colNames, 0);
			
			//model.addRow(new Object[]{"�̼���","M","������","����","����"});
			
			this.table = new JTable(model);
			//table.setEnabled(false);
			
			scrollPane = new JScrollPane(this.table);
			scrollPane.setSize(500, 200);
			//scrollPane.add(this.table);
			this.setPreferredSize(new Dimension(400,300));
			this.add(scrollPane);
			initialize();
		}

		private void initialize() {
			btnSearch = new JButton();
			btnSearch.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					search();
				}
			});
			btnSearch.setBounds(380,222,120, 25);
			
			btnSearch.setText("�˻�");
			add(btnSearch);
		}


		void search(){
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.getDataVector().removeAllElements();
			model.fireTableDataChanged();
			
			// MemberVO�� MemberDAO�� �̿��ؼ� member���̺� �����͸� ��ȸ�ؼ� 
			// JTable ����ϴ� ������ �ϼ��Ͻÿ�.
			
			MemberDAO memberDAO = new MemberDAO();
			List<MemberVO> memberList = memberDAO.getMemberAll();
			
			for (int i = 0; i < memberList.size(); i++) {
				MemberVO memberVO = memberList.get(i);
				model.addRow(new Object[] {memberVO.id,memberVO.passwd,memberVO.tel,memberVO.email});
			}
			
			
		}

	} 
