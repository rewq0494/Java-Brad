package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad52陣列讀取2 {

	public static void main(String[] args) {
		try {
			File source = new File ("dir1/file1.txt");
			FileInputStream fin = new FileInputStream(source); //如果沒有檔案會跳出例外 錯誤訊息

			byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			System.out.println(new String (buf));
			fin.close();
			//System.out.println("ok");
		} catch (Exception e) { //父元素
			System.out.println(e);
		}
	}

}
