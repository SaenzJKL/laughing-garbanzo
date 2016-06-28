package org.vert.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ride_status")
public class RideStatus {
	
	@Id
	@GeneratedValue
	@Column(name = "rst_id")
	private Long id;
	
	@Column(name="rst_description", nullable=false)
	private String description;
	
	/** Getters and Setters **/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}