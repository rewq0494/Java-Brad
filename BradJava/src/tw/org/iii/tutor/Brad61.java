package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad61 {
	public static void main(String[] args) {
		Brad613 obj = new Brad613();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/brad"));
			oout.writeObject(obj);
			oout.flush(); oout.close();
			System.out.println("----");
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/brad"));
			oin.readObject();
			oin.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Brad611 implements Serializable {
	Brad611(){System.out.println("Brad611()");}
}
class Brad612 extends Brad611 {
	Brad612(){System.out.println("Brad612()");}
}
class Brad613 extends Brad612 {
	Brad613(){System.out.println("Brad613()");}
}