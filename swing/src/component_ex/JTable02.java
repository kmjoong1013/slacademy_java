package component_ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTable02 extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JButton jBtnAddRow = null;
	private JButton jBtnDelRow = null;
	private JTable table;
	private JScrollPane scrollPane;
	
	public JTable02() {
		setLayout(null);
		
		String colNames[] = {"아이디","성명","핸드폰","선택","가입일자"};
		
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		
		model.addRow(new Object[] {"haha","홍길동","011-777-7777",new Boolean(true),"2007-05-03"});
		
		table = new JTable(model);
		
		table.addMouseListener(new JTableMouseListener());    
		
		scrollPane = new JScrollPane(table);
		scrollPane.setSize(500,200);
		add(scrollPane);
		
		initialize();
	}
	
	// JTable 추가할 MouseListener
	private class JTableMouseListener implements MouseListener{
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			JTable jtable = (JTable)e.getSource();
			int row = jtable.getSelectedRow();
			int col = jtable.getSelectedColumn();
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			System.out.println(model.getValueAt(row, col));
		}
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
			
		}
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
			
		}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
			
		}
	}
	
	public void initialize() {
		jBtnAddRow = new JButton();
		jBtnAddRow.setText("추가");
		jBtnAddRow.setBounds(30,222,120, 25);
		jBtnAddRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jBtnAddRow();
			}
		});
		add(jBtnAddRow);
		
		jBtnDelRow = new JButton();
		jBtnDelRow.setBounds(182, 222, 120, 25);
		jBtnDelRow.setText("삭제");
		jBtnDelRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jBtnDelRow();
			}
		});
		add(jBtnDelRow);
		
	}
	
	void jBtnAddRow() {
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(new String[] {"","","","",""});
	}
	
	void jBtnDelRow() {
		//System.out.println(table.getRowCount());
		//System.out.println(table.getSelectedRow());
		int selectedRow = table.getSelectedRow();
		if(selectedRow == -1 ){
			JOptionPane.showMessageDialog(null, "삭제할 줄을 선택하세요.");
			return;
		}
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(selectedRow);
	}
}
