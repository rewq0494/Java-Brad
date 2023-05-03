package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC02 {

	public static void main(String[] args) {
		
		try {
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:8889/iii","root","root");//連線
		
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO cust (cname,tel,birthday)VALUES('aa','123','1990-01-02')";//新增內容
		
		
		int count = stmt.executeUpdate(sql);//執行
		System.out.println("count");
		
		System.out.println("ok2");
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
