package net.abir.zerobackend.dao;

import java.util.List;

import net.abir.zerobackend.dto.Coverimages;
import net.abir.zerobackend.dto.Profileimages;
import net.abir.zerobackend.dto.User;
import net.abir.zerobackend.dto.Userinfo;

public interface UserDAO {
	
	//User DAO
	boolean addUser(User user);
	User read(int userId);
	User getByEmail(String email);
	List<User> list();
	List<User> listAllowed();
	List<User> listActive();
	List<User> listActiveByUserCat(int catId);
	boolean update(User user);
	boolean delete(User user);
	
	//User info DAO
	boolean addUserInfo(Userinfo userinfo);
	
	//User ProfileImages DAO
	boolean addProfileImages(Profileimages profileimages);
	
	//User CoverImages DAO
	boolean addCoverImages(Coverimages coverimages);


}
