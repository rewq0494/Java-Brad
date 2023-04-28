package tw.org.iii.tutor;

import java.io.File;

public class Brad47路徑 {

	public static void main(String[] args) {
		File root = new File(".");
		System.out.println(root.getAbsolutePath());
		File dir1 = new File("dir2");
		if(dir1.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("NO");
		}
	}

}
