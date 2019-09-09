package net.abir.zerodefinition.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import net.abir.zerobackend.dao.UserDAO;
import net.abir.zerobackend.dto.User;
import net.abir.zerodefinition.model.UserModel;

@ControllerAdvice
public class GlobalController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private UserDAO userDAO;
	
	private UserModel userModel = null;
	
	@ModelAttribute("userModel")
	public UserModel getUserModel() {
		if(session.getAttribute("userModel")==null) {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			User user=userDAO.getByEmail(authentication.getName());
			if(user!=null) {
				userModel =new UserModel();
				userModel.setId(user.getId());
				userModel.setEmail(user.getEmail());
				userModel.setUsercat(user.getUsercat());
				userModel.setName(user.getName());
				
				session.setAttribute("userModel", userModel);
				
				return userModel;
			}
		}
		
		return (UserModel) session.getAttribute("userModel");
	}

}
