package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad65 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9957);
			Socket socket = server.accept();
			//以下為新增 與66使用
			String urip = socket.getInetAddress().getHostAddress();
			System.out.println(urip);
			
			InputStream in = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(ir);
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
			server.close();
			System.out.println("ok");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
