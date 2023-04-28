package tw.org.iii.tutor;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad62IP {

	public static void main(String[] args) {
		try {
			InetAddress [] ips = InetAddress.getAllByName("www.google.com");// ("主機名稱")
			for(InetAddress ip :ips) {
				System.out.println(ip.getHostAddress());
			}
			//System.out.println(ips.getHostAddress());//ip位置	
			//System.out.println(ips.getHostName()); //ip名稱
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
