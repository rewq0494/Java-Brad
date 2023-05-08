package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC14抓取圖片 {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:8889/iii";
	private static final String SQL_QUERT =
			"SELECT * FROM member WHERE id= ?";
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER); prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_QUERT);
			
			pstmt.setInt(1, 1);
			ResultSet rs =  pstmt.executeQuery();
			
			if(rs.next()) {//判斷是否有下一行數據可供讀取
		
			InputStream in = rs.getBinaryStream("icon");//傳回inputstream
			FileOutputStream fout = new FileOutputStream("dir1/ball1.png");//證明東西有還原
			byte[]buf = new byte[128*1024];
			int len =  in.read(buf);
			fout.write(buf, 0, len);//從 buf 陣列中第 0 個位置開始，寫入長度為 len 的資料到 fout 中
			fout.flush();//將資料寫入磁碟文件，確保資料寫入完畢
			fout.close();//用於關閉 FileOutputStream 對象，釋放相關的資源
			System.out.println("ok");
			}else {
				System.out.println("data ERROR");
			}
		}catch(Exception e) {
		System.out.println(e);
		}
	}
}
