package tw.org.iii.tutor;

import java.io.File;
import java.io.IOException;

public class Brad48創建資料 {

	public static void main(String[] args) {
		File dir11 = new File("dir1/dir11");
		if(!dir11.exists()) {
			dir11.mkdir();
		}
		System.out.println("---");
		File dir2345 = new File("dir2/dir3/dir4/dir5");
		dir2345.mkdirs();
		
		File f1 = new File("dir1/file1.txt");
		try {
			f1.createNewFile();
			System.out.println("ok");
		} catch (IOException e) {
			System.out.println(e);
		}
		
		}

}
