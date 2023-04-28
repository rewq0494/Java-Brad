package tw.org.iii.tutor;

import javax.swing.JOptionPane;

public class Brad03 {
//      公開 靜態 不用回傳
	public static void main(String[] args) {
		//JOptionPane.showInputDialog 顯示一個對話框
		String strX = JOptionPane.showInputDialog("X = ?"); //創建字串 strx 並使用API內的JOptionPane.show... 
		String strY = JOptionPane.showInputDialog("Y = ?");
		System.out.println(strX);
		
		int x = Integer.parseInt(strX);  //將strx 字串轉換成整數並存在x
		int y = Integer.parseInt(strY);
		
		int r = x + y;
		JOptionPane.showConfirmDialog(null, 
				String.format("%d + %d = %d", x, y, r));
			//.format 用於將數據格式化為指定格式的字符串
	}

}
