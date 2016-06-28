package org.vert.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_method")
public class PaymentMethod {

	//Id del metodo de pago
	@Id
	@GeneratedValue
	@Column(name = "pmt_id")
	private Long id;
	
	@Column(name="pmt_description", nullable=false)
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
