package org.vert.db;

import java.util.Arrays;
import java.util.List;

public enum UserProfile {
	ADMIN(1),
	DRIVER(2),
	CLIENT(3);

	private int value;

	private UserProfile(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public static List<UserProfile> getValuesAsList(){
		return Arrays.asList(values());
	}
}
