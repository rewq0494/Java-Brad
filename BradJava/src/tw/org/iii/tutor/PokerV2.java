package tw.org.iii.tutor;

public class PokerV2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// 1. 洗牌
		int count = 10; 							// 宣告一個變數 count 為 10
		int[] poker = new int[count]; 				// 宣告一個長度為 count 的整數型態陣列 poker
		boolean isRepeat; 							// 宣告一個布林型態變數 isRepeat
		int temp; 									// 宣告一個整數型態變數 temp
		for (int i = 0; i < poker.length; i++) { 	// 使用 for 迴圈執行洗牌動作
			do { 									// 使用 do-while 迴圈判斷是否重複
				temp = (int) (Math.random() * count); // 產生一個 0 到 count-1 之間的整數
				isRepeat = false; 					// 預設 isRepeat 為 false
				for (int j = 0; j < i; j++) { 		// 利用 for 迴圈檢查是否重複
					if (temp == poker[j]) { 		// 如果重複了
						isRepeat = true; 			// 設定 isRepeat 為 true
						break;
					}
				}
			} while (isRepeat); // 如果重複，則繼續洗牌
			poker[i] = temp; 	// 如果不重複，則把 temp 存到 poker[i] 的位置
		}
		for (int v : poker) { 	// 利用 for-each 迴圈，把 poker 陣列中的值印出來
			System.out.println(v);
		}

		System.out.println("---");
		System.out.println(System.currentTimeMillis() - startTime);

	}

}
