package org.vert.db;

import java.util.Arrays;
import java.util.List;

public enum RideStatus {
	READY(1),
	STARTED(2),
	FINISHED(3),
	CANCELED(4);

	private int value;

	private RideStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public static List<RideStatus> getValuesAsList(){
		return Arrays.asList(values());
	}

}
