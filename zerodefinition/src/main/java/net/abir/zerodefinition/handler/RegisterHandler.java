package net.abir.zerodefinition.handler;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.abir.zerobackend.dao.UserDAO;
import net.abir.zerobackend.dto.User;
import net.abir.zerobackend.dto.Userinfo;
import net.abir.zerodefinition.model.RegisterModel;

@Component
public class RegisterHandler {
	
	@Autowired
	private UserDAO userDAO;
	
	public RegisterModel init() {
		
		return new RegisterModel();
	}
	
	public void addUser(RegisterModel registerModel, User user) {
		registerModel.setUser(user);
	}
	
	public void addUserinfo(RegisterModel registerModel, Userinfo userinfo) {
		registerModel.setUserinfo(userinfo);
	}
	
	public String saveAll(RegisterModel model) {
		String transitionValue ="success";
		
		User user=model.getUser();
		userDAO.addUser(user);
		
		Userinfo userinfo=model.getUserinfo();
		userinfo.setUser(user.getId());
		userinfo.setDate(new Date());
		userDAO.addUserInfo(userinfo);
		
		return transitionValue;
	}

}
