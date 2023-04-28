package tw.org.iii.tutor;

public class Brad28建構式觀念 {

	public static void main(String[] args) {
		Brad281 obj1 = new Brad281(2);// 宣告Brad281
		Brad282 obj2 = new Brad282();
		Brad283 obj3 = new Brad283();
		}

}
// (只要有 類別 就一定有 建構式）
class Brad281 extends Object { // 定義類別
	Brad281(int a) { // 開始定義281 ， 如果定義內有變數 宣告也要給值
		
		//默認初始化 super();
		System.out.println("Brad281(int)");
	}
}

class Brad282 extends Brad281 {
	Brad282() { 
		super(3);//呼叫  所有建構式的第一句話都要先叫爸（初始化）
		System.out.println("Brad282()");
	}
}

class Brad283 extends Brad282 {
	Brad283(){
		System.out.println("Brad283()");
	}
}