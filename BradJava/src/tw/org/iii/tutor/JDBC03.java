package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBC03 {

	public static void main(String[] args) {
		
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password","root");
			Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:8889/iii",prop);
		
		Statement stmt = conn.createStatement();
		//String sql = "UPDATE cust SET cname = 'Tony' WHERE id = 1";
		String sql ="DELETE FROM cust WHERE id = 1";//刪除
		
		int count = stmt.executeUpdate(sql);//執行
		System.out.println("count");
		
		System.out.println("ok2");
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
