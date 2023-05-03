package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		//1. Losd server
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//載入驅動程式
			System.out.println("ok");
		}catch (Exception e) {
			System.out.println(e);
		}
		
		try {
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:8889/iii?user=root&password=root");//層層呼叫 取的mysql並指定資料夾後用(?)隔開 輸入帳號密碼
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO cust (cname,tel,birthday)VALUES('aa','123','1990-01-02')";
		if(stmt.execute(sql)) {
			System.out.println("Query");
		}else {
			System.out.println("Update");
		}
		
		int count = stmt.executeUpdate(sql);
		System.out.println("count");
		
		System.out.println("ok2");
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
