package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad51陣列讀取 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/file1.txt"); //如果沒有檔案會跳出例外 錯誤訊息

			byte[] buf = new byte[10];
			int len;
			while ((len = fin.read(buf)) != -1) {
				System.out.print(new String(buf,0,len));
			}
			fin.close();
			//System.out.println("ok");
		} catch (Exception e) { //父元素
			System.out.println(e);
		}
	}

}
