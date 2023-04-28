package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad50串流 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/file1.txt"); //如果沒有檔案會跳出例外 錯誤訊息
//			int c = fin.read();
//			System.out.println((char)c);
//			c = fin.read();
//			System.out.println((char)c);
			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
			//System.out.println("ok");
		} catch (Exception e) { //父元素
			System.out.println(e);
		}
	}

}
