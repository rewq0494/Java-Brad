package tw.org.iii.tutor;

public class Brad09 {

	public static void main(String[] args) {
		int year = 2023;
		boolean isLeap; //使用布林值創建變isLeap
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 潤
					isLeap = true;
				} else {
					// 平
					isLeap = false;
				}
			} else {
				// 潤
				isLeap = true;
			}
		} else {
			// 平
			isLeap = false;
		}

		System.out.printf("%d年為%s年", year, (isLeap ? "閏" : "平")); 
		//printf用於格式化輸出的方法，主要用於將指定的格式和數據輸出到標準輸出流或其他輸出流中
	}

}