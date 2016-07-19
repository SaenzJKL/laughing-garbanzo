package org.vert.bean;

import org.vert.db.User;
import org.vert.db.UserProfile;
import org.vert.model.UserModel;
import org.vert.resources.SHAHash;
import org.vert.resources.SessionUtils;

public class Auth extends Form{

	/**
	 * Auhtentication bean
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private String password;
	
	private User user;
	
	public String login(){
		User user = UserModel.findByUserName(username);
		if(SHAHash.hash(password).equals(user.getPassword())){
			System.out.println("log!! :D");
			SessionUtils.setUserLogged(user);
			return user.getProfile().toString();
		}else{
			return null;
		}
		
	}
	
	public void close(){
		SessionUtils.getSession().invalidate();
		redirect("/index.xhtml");
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

	public User getUser() {
		user = SessionUtils.getUser();
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
