package net.abir.zerobackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Connect {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int enqId;
	@NotBlank(message="You must enter the Name!")
	private String name;
	@NotBlank(message="You must enter the Email!")
	private String email;
	@NotBlank(message="You must enter the Contact Number!")
	private String contact;
	@NotBlank(message="You must enter the Region!")
	private String state;
	@NotBlank(message="You must enter your Message!")
	private String comment;
	private boolean active=true;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEnqId() {
		return enqId;
	}
	public void setEnqId(int enqId) {
		this.enqId = enqId;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Connect [id=" + id + ", enqId=" + enqId + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ ", state=" + state + ", comment=" + comment + ", active=" + active + "]";
	}
	
}
