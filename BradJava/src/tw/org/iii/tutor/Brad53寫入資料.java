package tw.org.iii.tutor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad53寫入資料 {

	public static void main(String[] args) {
		String data = "Hello, 早安\n";
		try {
			FileOutputStream fout = 
					new FileOutputStream("dir1/file2.txt", true);
			fout.write(data.getBytes());
			fout.close();
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
