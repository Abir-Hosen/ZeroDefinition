package net.abir.zerobackend.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int usercat;
	@NotBlank(message="Please enter the name")
	private String name;
	@NotBlank(message="Please enter the Email")
	private String email;
	private String password;
	private boolean allowance;
	private boolean active;
	
	@Transient
	private String confirmPassword;
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUsercat() {
		return usercat;
	}
	public void setUsercat(int usercat) {
		this.usercat = usercat;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAllowance() {
		return allowance;
	}
	public void setAllowance(boolean allowance) {
		this.allowance = allowance;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", usercat=" + usercat + ", name=" + name + ", email=" + email + ", password="
				+ password + ", allowance=" + allowance + ", active=" + active + "]";
	}
	
}
