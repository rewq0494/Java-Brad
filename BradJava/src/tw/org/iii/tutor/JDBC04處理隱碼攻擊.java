package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class JDBC04處理隱碼攻擊 {

	public static void main(String[] args) {

		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/iii", prop);
			
			String sql = "INSERT INTO cust (cname,tel,birthday)VALUES(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Brad");
			pstmt.setString(2, "345");
			pstmt.setString(3, "1998-03-04");
			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
