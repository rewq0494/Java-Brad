package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import tw.org.iii.classes.BCrypt;

public class JDBC09創帳號 {
	private static Connection conn;
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:8889/iii";
	private static final String SQL_CHECK = 
		"SELECT count(*) count FROM member WHERE account = ?";
	private static final String SQL_INSERT = 
		"INSERT INTO member (account,passwd,email) VALUES (?,?,?)";
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Account : ");
		String account = scanner.next();
		
		System.out.print("Password : ");
		String passwd = scanner.next();
		
		System.out.print("Email : ");
		String email = scanner.next();
		
		Properties prop = new Properties();
		prop.put("user", USER); prop.put("password", PASSWORD);
				
		try {
			conn = DriverManager.getConnection(URL, prop);
			if (checkAccount(account)) {
				if (addMember(account, passwd, email)) {
					// OK
					System.out.println("Register success");
				}else {
					// XX2
					System.out.println("Register failure");
				}
			}else {
				// xx1
				System.out.println("Account exist");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	static boolean checkAccount(String account) throws Exception {//檢查帳號是否重複
		boolean ret;
		
		PreparedStatement pstmt = conn.prepareStatement(SQL_CHECK);
		pstmt.setString(1, account);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		ret = rs.getInt("count") == 0;
		rs.close();
		//rs = null;
		
		return ret;
	}
	
	static boolean addMember(String account, String passwd, String email) 
			throws Exception {
		boolean isOK;
		PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT);
		pstmt.setString(1, account);
		pstmt.setString(2, BCrypt.hashpw(passwd, BCrypt.gensalt()));
		pstmt.setString(3, email);
		isOK = pstmt.executeUpdate() != 0;
		
		return isOK;
	}

}