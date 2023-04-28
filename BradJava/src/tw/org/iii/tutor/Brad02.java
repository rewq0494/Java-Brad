package tw.org.iii.tutor;

import java.util.Scanner;

public class Brad02 {

	public static void main(String[] args) {
		// INPUT => 10 + 3 = 13;
		Scanner scanner = new Scanner(System.in);
		//根據scanner類別 創建 變數名：scanner的物件  目的使用類別的用法以及輸入資料
		System.out.print("x = "); 
		int x = scanner.nextInt();
		System.out.print("y = ");
		int y = scanner.nextInt();
		int r = x + y;
		int c = x - y;
		int a = x * y;
		int b = x / y;
		int mod = x % y;
		// %d 十進位整數值
		// \n換列  println 換列02
		System.out.printf("%d + %d = %d\n", x, y, r);
		System.out.printf("%d - %d = %d\n", x, y, c);
		System.out.printf("%d * %d = %d\n", x, y, a);
		System.out.printf("%d / %d = %d ...%d", x, y, b, mod);
	}

}
