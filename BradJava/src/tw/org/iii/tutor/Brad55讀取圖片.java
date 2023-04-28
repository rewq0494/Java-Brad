package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad55讀取圖片 {
	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("dir1/00.jpeg");
			FileInputStream fin = new FileInputStream("dir1/00.jpeg");
			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("finish:" + (System.currentTimeMillis()-start));
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}