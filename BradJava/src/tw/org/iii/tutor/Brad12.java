package tw.org.iii.tutor;

public class Brad12 {
	public static void main(String[] args) {
//		int a = 10;
//		switch (a) {
//		case 1:
//			System.out.println("A");
//			break;
//		case 10:
//			System.out.println("B");
//			break;
//		case 100:
//			System.out.println("C");
//			break;
//		default:
//			System.out.println("XX");
//			break;
//		}
//		System.out.println("OK");
//
		int month = (int)(Math.random()*12+1); //創建變數並使用亂數 1-12
		int days = 0;
		switch(month) { //switch 是 Java 中的一個流程控制結構，用來比較一個變數或運算式與多個可能的值
			case 1, 3, 5, 7, 8, 10, 12: //case 後面加上要判斷的值
				days = 31;
				break;
			case 4, 6, 9, 11:
				days = 30;
				break;
			case 2:
				days = 28;
				break;
			default:
				System.out.println("XX");
		}
		System.out.printf("%d月有%d天", month, days);
	}
}