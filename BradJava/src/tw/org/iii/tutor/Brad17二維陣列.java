package tw.org.iii.tutor;

public class Brad17二維陣列 {
 //公開 靜態 無回傳
	public static void main(String[] args) { //String[] args 是這個方法的參數，表示進入點方法可以接受一個字串陣列作為輸入參數（args)
		int[][] a = new int[3][]; //定義a 二維陣列
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4]; //a>2>4樹狀圖 3X4陣列 層層架構
		System.out.println(a);//記憶體位置
		System.out.println("-----");
		for (int[] a1: a) {
			for(int a2 : a1) {
				System.out.print(a2 +" ");
			}
			System.out.println();
		} 
		System.out.println("-----");
		
		//傳統用法
		for(int i=0;i<a.length;i++) {  // 迴圈 i 會從 0 開始到 a 的第一維的長度 - 1
		    for(int j=0;j<a[i].length;j++) {  // 迴圈 j 會從 0 開始到 a[i] 的長度 - 1
		        System.out.print(a[i][j] +" ");  // 輸出 a[i][j] 的值			
		        }
			System.out.println();
		}
	}

}
