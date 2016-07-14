package org.vert.model;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.vert.bean.Form;
import org.vert.db.RideStatus;
import org.vert.db.UserProfile;
import org.vert.db.UserStatus;

@ManagedBean
@SessionScoped
public class Catalogs extends Form{

	/**
	 * Catalogs
	 */
	private static final long serialVersionUID = 1L;

	private static List<UserStatus> userStatus;
	
	private static List<RideStatus> rideStatus;
	
	private static List<UserProfile> userProfile;
	

	public static List<UserStatus> getUserStatus() {
		userStatus = UserStatus.getValuesAsList();
		return userStatus;
	}

	public static List<RideStatus> getRideStatus() {
		rideStatus = RideStatus.getValuesAsList();
		return rideStatus;
	}

	public static List<UserProfile> getUserProfile() {
		userProfile = UserProfile.getValuesAsList();
		return userProfile;
	}

}
