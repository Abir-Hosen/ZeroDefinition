package net.abir.zerobackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.abir.zerobackend.dao.UserDAO;
import net.abir.zerobackend.dto.Coverimages;
import net.abir.zerobackend.dto.Profileimages;
import net.abir.zerobackend.dto.User;
import net.abir.zerobackend.dto.Userinfo;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	//=========    USER    =============
	
	public boolean addUser(User user) {
		try {
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public User read(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByEmail(String email) {
		String selectQuery="From User WHERE email= :email";
		try {
			return sessionFactory.getCurrentSession()
					.createQuery(selectQuery, User.class)
					.setParameter("email", email)
					.getSingleResult();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listAllowed() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listActive() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listActiveByUserCat(int catId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listLatest(int count) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(User user) {
		try {
//			sessionFactory.getCurrentSession().delete(user);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//===========    USER INFO    =============
	
	public boolean addUserInfo(Userinfo userinfo) {
		try {
			sessionFactory.getCurrentSession().persist(userinfo);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//=========   PROFILE IMAGES     ==========

	public boolean addProfileImages(Profileimages profileimages) {
		try {
			sessionFactory.getCurrentSession().persist(profileimages);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//==========    COVER IMAGES     ==========

	public boolean addCoverImages(Coverimages coverimages) {
		try {
			sessionFactory.getCurrentSession().persist(coverimages);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
