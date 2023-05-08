package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import tw.org.iii.classes.Bike;

public class JDBC15上傳bike速度 {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:8889/iii";
	private static final String SQL_UPDATE_BIKE =
			"UPDATE member SET BIKE = ? WHERE id = ?";
	
	public static void main(String[] args) {
		
		
		Bike b1 = new Bike();
		b1.upspeed();b1.upspeed();b1.upspeed();b1.upspeed();
		System.out.println(b1);
		
		Properties prop = new Properties();
		prop.put("user", USER); prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE_BIKE);
			
			
			pstmt.setObject(1, b1);
			pstmt.setInt(2, 1);
			
			
			if(pstmt.executeUpdate() > 0) {
				System.out.println("02上傳成功");
			}else {
				System.out.println("02上傳失敗");
			}
			
		
			
			
		}catch(Exception e) {
		System.out.println(e);
		}
	}
}
