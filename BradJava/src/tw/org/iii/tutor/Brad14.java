package tw.org.iii.tutor;

public class Brad14 {
	  //公開 靜態 無回傳
	public static void main(String[] args) {
		int a;
		int [] b;//宣告為b的整數陣列
		a = 1;
		b = new int[3]; //新增記憶體位置 []可整數可變數
		
		System.out.println(b.length);//印出b的內容數量
		System.out.println("---");
		
		for (int i = 0; i < b.length; i++) { //i小於b的字串數
			System.out.println(b[i]);
		}
		
		
		
		b[0] = 222;
		b[2] = -12;
		System.out.println("----");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		System.out.println("----");
		System.out.println(a);//a內容
		System.out.println(b);//
		System.out.println(b[0]);
	}

}
