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
		System.out.println("URL을 입력하세요 "); // 예) http://daum.net
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
			// URL을 표시하는 스트링으로 URL 클래스 객체 생성
			myURL = new URL(strURL);
			
			// 생성된 URL 클래스로 URL이 지시하는 서버와 접속을 한 후,
			// 해당 입력 스트림을 넘겨준다.
			is = myURL.openStream();
			
			// 입력 스트림을 이용하여 BufferedReader 클래스 객체를 생성
			br = new BufferedReader(new InputStreamReader(is));
			
			// 입력 스트림에서 데이터가 완료될때까지 데이터를 읽어서 화면에 표시
			while((data = br.readLine() ) != null ) {
				System.out.println(data);
			}
		}catch( MalformedURLException e ) { System.out.println(e.getMessage());}
		catch( IOException e ) {}
		catch( Exception e ) {}
	}
}
