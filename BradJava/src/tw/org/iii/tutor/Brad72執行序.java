package tw.org.iii.tutor;

public class Brad72執行序 {
	public static void main(String[] args) {
		Brad721 obj1 = new Brad721("a");
		Brad721 obj2 = new Brad721("b");
		obj1.start();obj2.start(); // 執行物件方法 start將動作排在CPU後等候執行
		obj1.run();obj2.run();
		//run物件執行多次 start只能執行一次（生命只有一次）
		System.out.println("main");
	}

}

class Brad721 extends Thread {// 執行序物件
	String name;
	Brad721(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "." + i);
		}
	}
}