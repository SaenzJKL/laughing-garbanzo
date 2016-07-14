package org.vert.db;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "user")
public class User {


	// Id de usuario
	@Id
	@GeneratedValue
	@Column(name = "usr_id")
	private Long id;

	//Nombre completo
	@Column(name = "usr_name", nullable = false)
	private String name;

	//Contrasenia
	@Column(name = "usr_pwd", nullable=false)
	private String password;

	//Correo electronico
	@Column(name = "usr_email", nullable=false)
	private String email;

	//Numeo telefonico con lada
	@Column(name = "usr_phone",nullable=false)
	private String phone;

	//Id del jefe del usuario (si es que tiene)
	@ManyToOne
	@JoinColumn(name = "usr_boss_id")
	private User boss;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "usr_status", nullable = false)
	private UserStatus status;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "usr_profile", nullable = false)
	private UserProfile profile;

	//Si el usuario se encuentra activo ('Y') o inactivo ('N')
	@Column(name = "usr_active", nullable=false)
	@Type(type="yes_no")
	private Boolean active;

	//Balance
	@Column(name = "usr_balance", nullable=false)
	private Integer balance;

	@OneToMany(mappedBy="boss")
	private Set<User> users;

	/** Getters & Setters */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User getBoss() {
		return boss;
	}

	public void setBoss(User boss) {
		this.boss = boss;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
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
