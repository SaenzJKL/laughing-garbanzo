package org.vert.bean;

import java.util.List;

import org.vert.db.User;
import org.vert.db.UserProfile;
import org.vert.db.UserStatus;
import org.vert.hibernate.HibernateSession;
import org.vert.model.Catalogs;
import org.vert.resources.SHAHash;

public class Register extends Form{

	/**
	 * Register bean
	 */
	private static final long serialVersionUID = 1L;

	//nombre del usuario
	private String name;

	//correo del usuario
	private String email;

	private String phone;

	private String password;

	private String confirmPassword;

	private UserStatus status;
	
	private UserProfile profile;

	private List<UserStatus> statusList;

	private List<UserProfile> profileList;

	public void register(){
		if(password.equals(confirmPassword)){
			User user = new User();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(SHAHash.hash(password));
			user.setPhone(phone);
			user.setStatus(status);
			user.setActive(true);
			user.setProfile(profile);
			user.setBalance(0);
			HibernateSession.saveObject(user);
			
		}else{
			errorMessage("Las contrasenas no coinciden");
		}
		clearValues();
	}

	public void clearValues(){
		name = null;
		email = null;
		phone = null;
		password = null;
		confirmPassword = null;

	}
	/* Getters and Setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public List<UserStatus> getStatusList() {
		statusList = Catalogs.getUserStatus();
		return statusList;
	}

	public void setStatusList(List<UserStatus> statusList) {
		this.statusList = statusList;
	}

	public List<UserProfile> getProfileList() {
		profileList = Catalogs.getUserProfile();
		return profileList;
	}

	public void setProfileList(List<UserProfile> profileList) {
		this.profileList = profileList;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public UserProfile getProfile() {
		return profile;
	}

	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}

}
