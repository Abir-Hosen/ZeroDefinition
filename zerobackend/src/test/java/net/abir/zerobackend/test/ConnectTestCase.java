package net.abir.zerobackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.abir.zerobackend.dao.ConnectDAO;
import net.abir.zerobackend.dto.Connect;


public class ConnectTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static ConnectDAO connectDAO;
	private Connect connect;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.abir.zerobackend");
		context.refresh();
		connectDAO=(ConnectDAO)context.getBean("connectDAO");
	}
	
	@Test
	public void testCRUD() {
		connect = new Connect();
		
		
		connect.setEnqId(1);
		connect.setName("Abir Hosen");
		connect.setEmail("abir040995.hosen@gmail.com");
		connect.setContact("01744103965");
		connect.setState("Noakhali");
		connect.setComment("Business purpose");
		
		assertEquals("Something went wrong while creating!", true, connectDAO.create(connect));
		
		/*		connect = enqueryDAO.read(1);
		assertEquals("Something went wrong while reading!", "Business", enquery.getName());
		
		connect = enqueryDAO.read(3);
		assertEquals("Something went wrong while deleting!", true, enqueryDAO.delete(enquery));
		
		connect = enqueryDAO.read(2);
		connect.setActive(true);
		assertEquals("Something went wrong while updating!", true, enqueryDAO.update(enquery));
		
		assertEquals("Fetch problem!", 4, enqueryDAO.listActive().size());*/

	}

}
