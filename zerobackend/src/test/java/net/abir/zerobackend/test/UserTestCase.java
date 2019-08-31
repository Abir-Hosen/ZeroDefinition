package net.abir.zerobackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.abir.zerobackend.dao.UserDAO;
import net.abir.zerobackend.dto.User;


public class UserTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.abir.zerobackend");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
	}
	
	@Test
	public void testCRUDUser() {
		user = new User();

		user.setUsercat(1);
		user.setName("Abir Hosen");
		user.setEmail("Hasib Al Amin");
		user.setPassword("Ashraful Islam");
		user.setAllowance(true);
		user.setActive(true);
		
		assertEquals("Something went wrong while inserting a new user!", true, userDAO.addUser(user));
	}
}
