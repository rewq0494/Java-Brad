package tw.org.iii.tutor;

public class Brad13 {

	public static void main(String[] args) {
		int i = 0;
		for (printBrad(); i < 10; printLine()) { //利用迴圈呼叫定義 範圍為0~10
			System.out.println(i++);
			//如果為真則執行 System.out.println(i++) 和 printLine() 方法，然後再回到迴圈的開頭再次判斷。	
		}
	}
	
	//printBrad定義
	static void printBrad() { 
		//是一個方法（method）的修飾符（modifier），代表該方法是一個靜態方法（static method），
		//而 void 則代表該方法沒有回傳值。
		int lottery = (int)(Math.random()*49+1); //創建的變數  數乘以 49，再加上 1   1（含）到 50（含）
		System.out.println("Brad" + lottery);
	}
	//printLine定義
	static void printLine() {
		System.out.println("----");
	}
}
