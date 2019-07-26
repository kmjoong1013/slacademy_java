package network_ex;

import java.net.*; // TCP ���� 
import java.io.*;  // �����
import java.awt.*; // GUI ȭ��
import java.awt.event.*; // �̺�Ʈ ó��
import java.util.*;  // Vector Ŭ����

public class GUIChatServer extends Frame implements ActionListener {
	Button btn_ext ;       // ���� ��ư
	TextArea txt_list ;    // ���� ��� ���
	protected Vector list ;          // ������ client ��� ����
	
	// ������
	public GUIChatServer(String title){ 
		super(title); // Ÿ��Ʋ�ٿ� ��µ� ���ڿ�
		list = new Vector(); // ���� ����
		btn_ext = new Button("���� ����"); // ���� ���� ��ư ����
		btn_ext.addActionListener(this); // �̺�Ʈ ���
		txt_list = new TextArea();  // txt_list ����
		add("Center", txt_list); // ȭ�� ��� txt_list ��� 
		add("South", btn_ext);   // ȭ�� �ϴܿ� ���� ���� ��ư ��� 
		setSize(200,200);           // ȭ�� ũ�� ����
		setVisible(true);     // ȭ�� ���
		ServerStart();        // ä�� ���� ����
	}
	
	// ä�� ���� 
	public  void ServerStart(){
		final int port = 5005 ; //ä�� ���� ��Ʈ ��� ����
		ServerSocket ss = null;
		try{
			ss = new ServerSocket(port); // ServerSocket ����
			while( true ){
				Socket client = ss.accept();  // Ŭ���̾�Ʈ ���� ��ٸ�
				txt_list.append( client.getInetAddress().getHostAddress()+"\n");
				ChatHandle ch = new ChatHandle( this, client); // ChatHandle �ʱ�ȭ                    
				list.add(ch); // Ŭ���̾�Ʈ ���� list ���Ϳ� �߰�
				ch.start();  // ChatHandle ������ ����
			}
		}catch(Exception e){ // ���� ó��
			System.out.println(e.getMessage());
		}
	}
	// ���� ���� ��ư�� ������ �� 
	public void actionPerformed(ActionEvent e){
		dispose();
	}
	
	// �޽��� ��� �޼���
	public void setMsg(String msg){
		txt_list.append( msg + "\n"     );// ȭ�鿡 msg �޽��� ���
	}
	
	// main �޼���
	public static void main(String [] args){
		new GUIChatServer(" ä�� ���� ");
		
	}
}
//ChatHandle Ŭ����
//ä�� ������ �������� ���� ó��

class ChatHandle extends Thread { // ������ ���
	GUIChatServer server = null;  // GUIChatServer ��� ����
	Socket client = null;         // ������ Ŭ���̾�Ʈ 
	BufferedReader br = null;     // �о����
	PrintWriter pw = null ;       // ������
	
	// ������ 
	public ChatHandle(GUIChatServer server, Socket client)throws IOException{
		this.server = server ;
		this.client = client ;
		// ����� ��Ʈ�� ����
		InputStream is = client.getInputStream();
		br = new BufferedReader( new InputStreamReader( is ));      
		OutputStream os = client.getOutputStream();
		pw = new PrintWriter( new OutputStreamWriter( os ));        
	}
	
	// ���� ������ ������ ��� Ŭ���̾�Ʈ�� msg����
	public void Send_All(String msg){
		try{
			synchronized( server.list ){ // GUIChatServer ��� ���� list ����ȭ ó��
				int size = server.list.size(); // ���� ������ Ŭ���̾�Ʈ �� 
				for(int i = 0 ; i < size ; i++){   
					ChatHandle chs = (ChatHandle)server.list.get(i);
					synchronized( chs.pw ){  // ChatHandle pw �ν��Ͻ��� �̿��� ���� ����
						chs.pw.println( msg );
					}
					chs.pw.flush();
				}
			}
		}catch(Exception e){ // ���� ó��
			System.out.println( e.getMessage());
		}
	}
	
	// Thread Ŭ������ run �޼��� �������̵�.
	public void run(){
		String name = "";
		try{
			name = br.readLine();      // ��ȭ�� �о����  
			Send_All( name + " ���� ���� �����ϼ̽��ϴ�.");
			while( true ){
				String msg = br.readLine(); // Ŭ���̾�Ʈ �޽��� ���
				String str = name; 
				synchronized( server ){
					server.setMsg( str +" : " + msg ); // ���� Ŭ���̾�Ʈ �޽��� ���
				}
				if( msg.equals("@@Exit"))// @@Exit �޽����� Ŭ���̾�Ʈ ���� ����
					break;
				else  // ���� ������ ��� Ŭ���̾�Ʈ�� �޽��� ����
					Send_All( name + " >> " + msg );
			}
		}catch(Exception e){ // ���� ó��
			server.setMsg(e.getMessage());
		}
		finally{
			synchronized(server.list){
				server.list.removeElement(this); // ���� ��Ͽ��� ����
			}
			try{ // ��Ʈ�� ����
				br.close();
				pw.close();
				client.close();  // Ŭ���̾�Ʈ ���� ����
			}catch(IOException e){ // ���� ó��
				server.setMsg(e.getMessage());
			}
		}
	}
}
