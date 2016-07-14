package org.vert.db;

import java.util.Arrays;
import java.util.List;

public enum UserStatus {
	SUSCRIBED(1),
	UNSUSCRIBED(2);

	private int value;

	private UserStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public static List<UserStatus> getValuesAsList(){
		return Arrays.asList(values());
	}
}
