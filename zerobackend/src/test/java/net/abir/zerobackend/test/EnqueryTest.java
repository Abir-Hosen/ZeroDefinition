package net.abir.zerobackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.abir.zerobackend.dao.EnqueryDAO;
import net.abir.zerobackend.dto.Enquery;

public class EnqueryTest {
	
	private static AnnotationConfigApplicationContext context;
	private static EnqueryDAO enqueryDAO;
	private Enquery enquery;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.abir.zerobackend");
		context.refresh();
		enqueryDAO=(EnqueryDAO)context.getBean("enqueryDAO");
	}
	
	@Test
	public void testCRUD() {
		enquery = new Enquery();
		
		enquery.setName("Work");
		enquery.setAddress("work@zerodefinition.com");
		
		assertEquals("Something went wrong while creating!", true, enqueryDAO.create(enquery));
		
		enquery = enqueryDAO.read(1);
		assertEquals("Something went wrong while reading!", "Business", enquery.getName());
		
		enquery = enqueryDAO.read(3);
		assertEquals("Something went wrong while deleting!", true, enqueryDAO.delete(enquery));
		
		enquery = enqueryDAO.read(2);
		enquery.setActive(true);
		assertEquals("Something went wrong while updating!", true, enqueryDAO.update(enquery));
		
		assertEquals("Fetch problem!", 4, enqueryDAO.listActive().size());

	}

}
