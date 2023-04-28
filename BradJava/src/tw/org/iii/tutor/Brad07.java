package tw.org.iii.tutor;

public class Brad07 {

	public static void main(String[] args) {
//		double temp = Math.random();
//		System.out.println(temp);
//		double temp2 = temp * 101;
//		System.out.println(temp2);
//		int score = (int)temp2;
//		System.out.println(score);
//
		
		//創建整數變數 並且使用亂數api 1~100碼亂數
		int score = (int) (Math.random() * 101);
		System.out.println(score);
		//如果數大於等於60 會顯示出pass
		if (score >= 60) {
			System.out.println("pass");
		} else {
			System.out.println("Down");
		}
	}
}