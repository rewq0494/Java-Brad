package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.TreeSet;

public class Brad37樂透 {

	public static void main(String[] args) {
		TreeSet<Integer> lottery = new TreeSet<>();
		//宣告了一個泛型為 Integer 的 TreeSet 物件，命名為 lottery。
		//TreeSet 是一種實現 SortedSet 介面的集合，它會將元素進行排序
		
		while (lottery.size()<6) {  //當lottery元素數量小於6
			lottery.add((int)(Math.random()*49+1)); //隨機產生1~49的數字加入lottery中
		}
		System.out.println(lottery);
	}

}
