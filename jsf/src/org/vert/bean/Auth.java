package org.vert.bean;

import org.vert.db.User;
import org.vert.model.UserModel;
import org.vert.resources.SHAHash;

public class Auth extends Form{

	/**
	 * Auhtentication bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private String password;
	
	public void login(){
		User user = UserModel.findByUserName(username);
		if(SHAHash.hash(password).equals(user.getPassword())){
			System.out.println("log!! :D");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
