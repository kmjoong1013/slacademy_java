package network_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URL01 {

	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String strURL ="";
		System.out.println("URL�� �Է��ϼ��� "); // ��) http://daum.net
		try{
			strURL = in.readLine();
		}catch(Exception e){ System.out.println(e.getMessage());}
		new URL01(strURL);
	}
	
	URL01( String strURL ) 
	{
		URL myURL;
		InputStream is;
		BufferedReader br;
		String     data;
		
		try {
			// URL�� ǥ���ϴ� ��Ʈ������ URL Ŭ���� ��ü ����
			myURL = new URL(strURL);
			
			// ������ URL Ŭ������ URL�� �����ϴ� ������ ������ �� ��,
			// �ش� �Է� ��Ʈ���� �Ѱ��ش�.
			is = myURL.openStream();
			
			// �Է� ��Ʈ���� �̿��Ͽ� BufferedReader Ŭ���� ��ü�� ����
			br = new BufferedReader(new InputStreamReader(is));
			
			// �Է� ��Ʈ������ �����Ͱ� �Ϸ�ɶ����� �����͸� �о ȭ�鿡 ǥ��
			while((data = br.readLine() ) != null ) {
				System.out.println(data);
			}
		}catch( MalformedURLException e ) { System.out.println(e.getMessage());}
		catch( IOException e ) {}
		catch( Exception e ) {}
	}
}
