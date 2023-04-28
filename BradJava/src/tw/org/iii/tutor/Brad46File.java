package tw.org.iii.tutor;

import java.io.File;

public class Brad46File {

	public static void main(String[] args) {
		File file1 = new File("/Users/rewq0494/test1");
		if(file1.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
	}

}
