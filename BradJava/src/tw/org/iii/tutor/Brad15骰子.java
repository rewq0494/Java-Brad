package tw.org.iii.tutor;

public class Brad15骰子 {

	public static void main(String[] args) {
		int[] p = new int[7];
		System.out.println(p.length);
		System.out.println("----");
		
		for (int i=0; i<10000000; i++) {
			int point = (int)(Math.random()*9+1);	// 1 ~ 10
			if (point >= 1 && point <= 9) { //程式會檢查這個亂數值point是否在1到9之間，如果是，就將對應的計數器加1。
				p[point>=7?point-3:point]++; 
//三元運算子 (point>=7?point-3:point)，這個運算子的意思是：如果 point 大於等於 7，則傳回 point-3，否則傳回 point
			}else {
				p[0]++;//亂數值 point 不在 1 到 9 之間，就將計數器 p[0] 加1
			}
		}
		
		if (p[0] == 0) {
			for (int i=1; i<=6; i++) {
				System.out.printf("%d點出現%d次\n", i, p[i]);
			}
		}else {
			System.out.println("debug = " + p[0]);
		}
		System.out.println("----");
		
		// for-each
		for (int v : p) {
			System.out.println(v);
		}
		
		
		
	}

}