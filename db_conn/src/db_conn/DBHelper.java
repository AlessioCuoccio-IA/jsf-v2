package db_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {
	Statement stm = null;
	ResultSet rs = null;
	Connection cn = null;
	
	public Connection getConnection() {
		Connection connect = null;
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studyeasy_db", "root", "root");
			connect.setAutoCommit(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connect;
	}
	
	public List<User> listUsers() {
		List<User> list = new ArrayList<>();
		cn = getConnection();
		try {
			String query = "select * from users";
			stm = cn.createStatement();
			rs = stm.executeQuery(query);
			while(rs.next()) {
				Integer user_id = rs.getInt("users_id");
				String username = rs.getString("username");
				String email = rs.getString("email");
				list.add(new User(user_id, username, email));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				cn.close();
				rs.close();
				stm.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		return list;
	}

}
