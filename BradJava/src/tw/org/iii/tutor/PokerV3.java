package tw.org.iii.tutor;

public class PokerV3 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		//利用 for 迴圈，將 0 到 51 的整數依序填入陣列 poker 中
		for (int i = 0 ;i<poker.length;i++) poker[i]=i;
		
		/*
		 * 利用 for 迴圈進行多次互換，讓陣列 poker 中的元素隨機排序。
		 * 假設迴圈次數為 i，則每次迴圈隨機產生一個介於 0 到 i 的整數 rand，將 poker[rand] 與 poker[i] 的值互換。
		 */
		for(int i = 51; i>0 ;i--) {
			int rand = (int)(Math.random()*(i+1));
			//poker[rand} <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i]= temp; 
		}
		for (int v : poker) {
			System.out.println(v);
		}
	}
}
