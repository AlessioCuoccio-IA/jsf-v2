package it.simpleformwithjsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	
	private String email;
	private String password;
	
	public LoginBean() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
