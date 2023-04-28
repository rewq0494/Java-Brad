package tw.org.iii.tutor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad66 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("10.0.104.139"), 9957);

			OutputStream oout = socket.getOutputStream();// 我們可以使用 oout 這個變數將資料從程式寫入到網路上
			OutputStreamWriter ow = new OutputStreamWriter(oout);
			BufferedWriter bw = new BufferedWriter(ow);
			bw.write("hhhh");// 選擇write-String
			bw.flush();
			bw.close();

			socket.close();
			System.out.println("send ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
