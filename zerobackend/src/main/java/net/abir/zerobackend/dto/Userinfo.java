package net.abir.zerobackend.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Userinfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int user;
	@NotBlank(message="Please enter the address")
	private String address;
	@NotBlank(message="Please enter the Work")
	private String work;
	private Date birth;
	@NotBlank(message="Please enter your country")
	private String country;
	@NotBlank(message="Please enter the mobile")
	private String mobile;
	@NotBlank(message="Please enter about yours")
	private String about;
	@NotBlank(message="Please enter the blood group")
	private String blood;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Userinfo [id=" + id + ", user=" + user + ", address=" + address + ", work=" + work + ", birth=" + birth
				+ ", country=" + country + ", mobile=" + mobile + ", about=" + about + ", blood=" + blood + ", date="
				+ date + "]";
	}

}
