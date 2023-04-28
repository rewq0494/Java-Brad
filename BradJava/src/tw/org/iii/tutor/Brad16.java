package tw.org.iii.tutor;

public class Brad16 {

	public static void main(String[] args) {
		int p0, p1, p2, p3, p4, p5, p6;
		p0 = p1 = p2 = p3 = p4 = p5 = p6 = 0; //預設為0
		for (int i = 0; i < 100000; i++) {
			int point = (int) (Math.random() * 6 + 1);// 1~6
			switch (point) { //判斷point
			case 1: //當 point 的值為 1 時，執行 case 1: 下的程式碼，也就是讓 p1 變數加一
				p1++; 
				break;
			case 2:
				p2++;
				break;
			case 3:
				p3++;
				break;
			case 4:
				p4++;
				break;
			case 5:
				p5++;
				break;
			case 6:
				p6++;
				break;
			default: //檢查是否有0的數 
				//如果 point 的值與前面所有 case 關鍵字定義的值都不匹配，
				//則執行 default 下的程式碼，也就是讓 p0 變數加一。
				p0++;
			}
		}
		if (p0 == 0) { //如果檢查出沒有p0那就會印出1~6骰子被執行的數量
			System.out.printf("1點出現%d次\n", p1);
			System.out.printf("2點出現%d次\n", p2);
			System.out.printf("3點出現%d次\n", p3);
			System.out.printf("4點出現%d次\n", p4);
			System.out.printf("5點出現%d次\n", p5);
			System.out.printf("6點出現%d次\n", p6);
		} else { //反之 如果被檢查出有0 代表出現bug
			System.out.println("debug = " + p0);
		}
	}
}
