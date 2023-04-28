package tw.org.iii.tutor;

public class Brad18 {

	public static void main(String[] args) {
		int a = 10;
		do { //// 使用do-while迴圈，先執行一次迴圈內的程式碼再判斷是否要繼續執行迴圈
			System.out.println(a--);
		}while (a > 0);  //當a大於0時，繼續執行迴圈
		
		System.out.println("-----");
		
		while (a < 10) { // 使用while迴圈，只有在條件成立時才會執行迴圈內的程式碼
			System.out.println(a++);
		}
		
		System.out.println("-----");
		
		
		a = 0;
		
		for (;a < 10;) { //使用for迴圈，其中省略了for迴圈中的初始值設定，只有在條件成立時才會執行迴圈內的程式碼
			System.out.println(a++);
		}
	}

}
