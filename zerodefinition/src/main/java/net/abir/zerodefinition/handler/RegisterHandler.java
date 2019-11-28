package net.abir.zerodefinition.handler;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import net.abir.zerobackend.dao.UserDAO;
import net.abir.zerobackend.dto.User;
import net.abir.zerobackend.dto.Userinfo;
import net.abir.zerodefinition.model.RegisterModel;

@Component
public class RegisterHandler {
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public RegisterModel init() {
		
		return new RegisterModel();
	}
	
	public void addUser(RegisterModel registerModel, User user) {
		registerModel.setUser(user);
	}
	
	public void addUserinfo(RegisterModel registerModel, Userinfo userinfo) {
		registerModel.setUserinfo(userinfo);
	}
	
	public String validateUser(User user, MessageContext error) {
		
		String transitionValue="success";
		
		if(!(user.getPassword().equals(user.getConfirmPassword()))){
			error.addMessage(new MessageBuilder().error()
					.source("confirmPassword")
					.defaultText("Password doesn't match the confirm password!")
					.build());
			transitionValue="failure";
		}
		
		if(userDAO.getByEmail(user.getEmail())!=null) {
			error.addMessage(new MessageBuilder()
					.error()
					.source("email")
					.defaultText("Email address is already used!")
					.build());
			transitionValue="failure";
		}
		
		return transitionValue;
	}
	
	public String saveAll(RegisterModel model) {
		String transitionValue ="success";
		
		User user=model.getUser();
		user.setUsercat(1);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userDAO.addUser(user);
		
		Userinfo userinfo=model.getUserinfo();
		userinfo.setUser(user.getId());
		userinfo.setDate(userinfo.getBirth());
		userinfo.setBirth(new Date());
		userDAO.addUserInfo(userinfo);
		
		return transitionValue;
	}

}
