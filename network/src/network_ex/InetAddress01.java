package network_ex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress01 {

	public static void main(String[] args) throws UnknownHostException {
		
		String strDomain = "www.cyber.co.kr";
		String strIp = "220.79.181.253";
		
		InetAddress addr1 = InetAddress.getByName(strDomain);
		InetAddress addr2 = InetAddress.getByName(strIp);
		InetAddress addr3 = InetAddress.getLocalHost();
		
		System.out.println("----------------------------");
		System.out.println("addr1(" + strDomain + ") = " + addr1.getHostAddress());
		System.out.println("addr2(" + strIp + ") = " + addr2.getHostName());
		System.out.println("로컬주소 : " + addr3.getHostAddress());
		System.out.println("로컬이름" + addr3.getHostName());
		
		////////////////////////////////////////////////////
		InetAddress[] addr4 = InetAddress.getAllByName("youlchon.com");
		System.out.println("daum의 주소들");
		for (int i = 0; i < addr4.length; i++) {
			System.out.println(addr4[i].getHostAddress());
		}
		
	}
}
