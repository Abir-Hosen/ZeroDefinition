package net.abir.zerodefinition.model;

import java.io.Serializable;

import net.abir.zerobackend.dto.User;
import net.abir.zerobackend.dto.Userinfo;

public class RegisterModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	private Userinfo userinfo;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Userinfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

}
