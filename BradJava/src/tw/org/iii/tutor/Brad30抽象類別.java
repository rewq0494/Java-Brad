package tw.org.iii.tutor;

public class Brad30抽象類別 {

	public static void main(String[] args) {
		// Brad301 obj = new Brad301();
		Brad301 obj2 = new Brad302();
		Brad301 obj3 = new Brad303();
		obj2.m2();
		obj3.m2();
	}

}

abstract class Brad301 {
	Brad301(int a) {
		System.out.println("Brad301()");
	}

	
	void m1() {
		System.out.println("Brad301:m1()");
	}
	// 由父類別來生成m2 再由子類別來去定義方法
	abstract void m2();// abstract 如果方法內有抽象方法 上面宣告也要加入abstract類別
}

class Brad302 extends Brad301 {
	Brad302() {
		super(2);
		System.out.println("302()");
	}

	void m2() {
		System.out.println("Brad302:m2()");
	}
}

class Brad303 extends Brad301 {
	Brad303() {
		super(3);
		System.out.println("303()");
	}

	void m2() {
		System.out.println("Brad303:m2()");
	}
}