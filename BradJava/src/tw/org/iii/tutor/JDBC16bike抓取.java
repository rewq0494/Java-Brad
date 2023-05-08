package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.org.iii.classes.Bike;

public class JDBC16bike抓取 {
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
			InputStream in = rs.getBinaryStream("bike");//傳回inputstream
			ObjectInputStream oin = new ObjectInputStream(in);
			Object obj = oin.readObject();
			
			if (obj instanceof Bike) {
				Bike b2 = (Bike)obj;
				System.out.println(b2);
			}else {
				System.out.println("我不是腳踏車");
			}
			
			System.out.println("ok");
			}else {
				System.out.println("data ERROR");
			}
		}catch(Exception e) {
		System.out.println(e);
		}
	}
}
