package tw.org.iii.定義;

public class Void有回傳無回傳定義 {

	public static void main(String[] args) {

		/*
		 * 有回傳值的方法，可以在方法內部使用 return 關鍵字返回一個值，這個值的類型必須與該方法聲明時指定的回傳值類型一致。
		 
		 
		 * 沒有回傳值的方法，其方法類型要聲明為 void，而且不需要使用 return 來返回值，只需要在方法內部執行需要的操作即可。
		 
		  在調用方法時，可以根據方法是否有回傳值來決定是否需要將方法的執行結果存儲到一個變數中。
		 
		 
		 * 靜態方法和動態方法的區別在於，靜態方法不需要實例化對象就可以直接調用，而動態方法需要先創建一個對象才能調用。
		 
		 * QA. 如果沒有創建一個容器存放return是否無法使用void : 如果方法沒有回傳值（使用 void
		  關鍵字），則該方法不會有任何值可以返回。如果您需要返回值，您應該定義一個具有適當類型的回傳值的方法。 使用 void
		  關鍵字的方法通常被用於執行某些操作，例如顯示訊息、修改對象的狀態等，而不是返回任何值。
		 
		 * QA. 用回傳值需要再定義添加什麼嗎 如果你想要使用回傳值，你需要在方法的定義中加上回傳值的型別。例如，如果你想要回傳一個整數，你可以在方法的定義中加上
		  int 關鍵字。 如果你想要回傳一個字串，你可以在方法的定義中加上 String 關鍵字。
		 
		  public static int add(int a, int b) { 
		  	int result = a + b; 
		  	return result; 
		  }
		 
		  public static String concat(String str1, String str2) {
		   String result = str1+ str2; 
		   return result; }
		   
		   add 方法回傳一個整數，concat 方法回傳一個字串。你可以在方法中使用 return 陳述式來回傳值。
		   在呼叫方法時，你可以使用一個變數來存儲方法回傳的值。
		 */
	}

}
