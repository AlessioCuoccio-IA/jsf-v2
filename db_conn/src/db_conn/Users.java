package db_conn;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Users {
	
	List<User> usersList = new ArrayList<>();
	
	public Users() {
		usersList = new DBHelper().listUsers();
	}

	public List<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

	
}
