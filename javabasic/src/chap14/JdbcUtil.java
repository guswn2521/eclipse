package chap14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {

	public static Connection getConnection() {
		Connection conn = null;

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb";
		url = url + "?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "rootpass";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch(Exception e){
			e.printStackTrace();
		}

		return conn;

	}

	public static void close(ResultSet rs,PreparedStatement pstmt, Connection conn) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();

		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			rs = null;
			pstmt = null;
			conn = null;
		}
	}


	public static void close(PreparedStatement pstmt, Connection conn) {
		try {

			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pstmt = null;
			conn = null;
		}
	}


}

