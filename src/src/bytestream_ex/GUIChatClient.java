package bytestream_ex;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class GUIChatClient extends Frame implements ActionListener, Runnable {
	Button btn_exit; // ���� ��ư
	Button btn_send; // ���ڿ� ����
	Button btn_connect; // ���� ����
	TextArea txt_list; // ���� ��� ���
	TextField txt_server_ip; // ���� ���� ������
	TextField txt_name; // ���� �̸�
	TextField txt_input; // ���� �޽���
	Socket client; // ���� Ŭ���̾�Ʈ ����
	BufferedReader br = null; // �о���� ��Ʈ��
	PrintWriter pw = null; // ������ ��Ʈ��
	String server_ip = null; // ���� ������
	final int port = 5005; // ��Ʈ ��ȣ

	CardLayout cl; // ī�� ���̾ƿ� ����

	// ������
	public GUIChatClient(String title) {
		super(title); // Ÿ��Ʋ�� ����
		cl = new CardLayout(); // ī�� ���̾ƿ� �ʱ�ȭ
		setLayout(cl); // ���̾ƿ� ����
		Panel connect = new Panel(); // ���� ȭ��
		connect.setLayout(new BorderLayout());
		Panel chat = new Panel(); // ä�� ȭ��
		chat.setLayout(new BorderLayout());

		btn_connect = new Button("���� ����"); // ��ư ����
		btn_connect.addActionListener(this); // �̺�Ʈ ���
		txt_server_ip = new TextField("127.0.0.1", 15);
		txt_name = new TextField("���� �̼�^^", 15);
		Panel connect_sub = new Panel(); // ����â ���� �г�
		connect_sub.add(new Label("���� ������ :  "));
		connect_sub.add(txt_server_ip);
		connect_sub.add(new Label("��ȭ��      :   "));
		connect_sub.add(txt_name);
		connect.add("North", new Label("���� ä�� ���� ȭ��", Label.CENTER));
		connect.add("Center", connect_sub);
		connect.add("South", btn_connect);

		// ä��â ȭ�� ����
		txt_list = new TextArea();
		txt_input = new TextField("", 25);
		btn_exit = new Button("����");
		btn_send = new Button("����");
		btn_exit.addActionListener(this); // �̺�Ʈ ���
		btn_send.addActionListener(this); // �̺�Ʈ ���
		txt_input.addActionListener(this); // �̺�Ʈ ���
		Panel chat_sub = new Panel(); // ä��â ���� �г�
		chat_sub.add(txt_input);
		chat_sub.add(btn_send);
		chat_sub.add(btn_exit);
		chat.add("North", new Label("ä�� ���α׷� ver 1.0", Label.CENTER));
		chat.add("Center", txt_list);
		chat.add("South", chat_sub);

		add(connect, "����â"); // ī�� ���̾ƿ��� ���
		add(chat, "ä��â"); // ī�� ���̾ƿ��� ���

		cl.show(this, "����â"); // �ʱ�ȭ���� ����â

		setSize(300, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				dispose();
			}
		});
	}

	// Runnable �������̽� run() �޼��� �������̵�
	public void run() {
		try {
			client = new Socket(server_ip, port); // ���� ����
			// ����� ��Ʈ�� ����
			InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(new OutputStreamWriter(os));
			String msg = txt_name.getText();
			pw.println(msg); // ��ȭ�� ����
			pw.flush();
			txt_input.requestFocus(); // ä��â �� �Է� ���ڿ� ��Ŀ��
			while (true) {
				msg = br.readLine(); // ���� ������ ����
				txt_list.append(msg + "\n"); // txt_list.append(msg + "\n");
			}
		} catch (IOException e) { // ���� ó��
			System.out.print(e.getMessage());
		}
	}

	// ActionEvent �̺�Ʈ ó��
	public void actionPerformed(ActionEvent e) {
		try {
			Object obj = e.getSource();
			// ���� ���� ��ư�� ������ ��
			if (obj == btn_connect) {
				server_ip = txt_server_ip.getText();
				Thread th = new Thread(this);
				th.start(); // ������ ����
				cl.show(this, "ä��â"); // ä��â���� ȭ�� ��ȯ
			}
			// ���� ��ư�� ������ ��
			else if (obj == btn_exit) {
				System.exit(0); // ���α׷� ���� ����
			}
			// ���۹�ư�� ������ ��
			// �� �Է� ���ڿ��� ����Ű�� ������
			else if (obj == btn_send || obj == txt_input) {
				String msg = txt_input.getText();
				pw.println(msg);
				pw.flush();
				txt_input.setText("");
				txt_input.requestFocus();
			}
		} catch (Exception ex) { // ���� ó��
			txt_list.append(ex.getMessage() + "\n"); //txt_list.appendText(ex.getMessage() + "\n");
		}
	}

	// main() �޼���
	public static void main(String[] args) {
		new GUIChatClient("ä�� Ŭ���̾�Ʈ ���α׷�");
	}
}