package org.vert.bean;

import java.util.List;

import org.vert.db.UserProfile;
import org.vert.db.UserStatus;
import org.vert.model.Catalogs;

public class Register extends Form{

	/**
	 * Register bean
	 */
	private static final long serialVersionUID = 1L;
	
	private List<UserStatus> statusList;
	
	private List<UserProfile> profileList;

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

}
