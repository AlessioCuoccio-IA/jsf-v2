package db_conn;

public class User {
	
	Integer user_id;
	String username, email;
	
	public User(Integer user_id, String username, String email) {
		this.user_id = user_id;
		this.username = username;
		this.email = email;
	}
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", email=" + email + "]";
	}
	
}
