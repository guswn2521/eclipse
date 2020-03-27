package chap14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/world";
			url = url + "?useSSL=false&serverTimezone=UTC";
			conn = DriverManager.getConnection(url, "root", "rootpass");
			System.out.println("연결성공");
			
			String sql = "select id,name, countrycode,district, population from city order by population desc";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String countrycode = rs.getString("countrycode");
				String district = rs.getString("district");
				int population = rs.getInt("population");	
				
				System.out.printf("id : %s, name : %s, countrycode : %s, district : %s, population : %s\n", id, name, countrycode, district, population);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
