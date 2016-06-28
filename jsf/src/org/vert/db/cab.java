package org.vert.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cab")
public class cab {
	
	@Id
	@GeneratedValue
	@Column(name = "cab_id")
	private Integer id;
	
	@Column(name="cab_usr_id", nullable=false)
	private Long userId;
	
	@Column(name="cab_plate", nullable=false)
	private String plate;
	
	@Column(name="cab_usr_id", nullable=false)
	private String model;
	
	@Column(name="cab_ctp_id", nullable=false)
	private Long cabType;
	
	/** Getters and Setters **/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Long getCabType() {
		return cabType;
	}

	public void setCabType(Long cabType) {
		this.cabType = cabType;
	}
	
}
