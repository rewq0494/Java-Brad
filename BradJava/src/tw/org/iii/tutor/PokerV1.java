package tw.org.iii.tutor;

public class PokerV1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// 1. 洗牌 定義一個包含 52 個元素的 int 類型的陣列 poker，用於存儲洗牌後的牌組。
		int count = 52;
		//使用 for 迴圈遍歷 poker 陣列，對於每個位置 i，隨機生成一個介於 0~51 之間的整數 temp
		int[] poker = new int[count];
		for (int i=0; i<poker.length; i++) {
			int temp = (int)(Math.random()*count);
			
		// 檢查機制 避免洗牌後產生重複的牌。如果 temp 與之前已經生成的牌重複了，則 isRepeat 設為 true，並且跳出 for 迴圈
			boolean isRepeat = false;
			for (int j=0; j<i; j++) {
				if (temp == poker[j]) {
		// 如果出現過了，則 isRepeat 設為 true，跳出 for 迴圈
					isRepeat = true;
					break;
				}
			}
		//如果沒有出現過，就將 temp 存入 poker[i] 中，表示第 i 張牌的點數是 temp
			if (!isRepeat) {
				poker[i] = temp;
		//如果發現 temp 已經出現過了，就進入 else 分支，通過 i-- 的方式回到上一個位置重新進行洗牌
			}else {
				i--;
			}
		}
		
		for (int v: poker) {
			System.out.println(v);
		}
		
		System.out.println("---");
		System.out.println(System.currentTimeMillis()-startTime);
		
	}

}