package net.abir.zerobackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.abir.zerobackend.dao.CategoryDAO;
import net.abir.zerobackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.abir.zerobackend");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void testCRUDCategory() {
		category = new Category();
		
		category.setName("Live");
		category.setDescription("This is Live description");
		category.setImgUrl("IUrl");

		assertEquals("Something went wrong while inserting a new category!", true, categoryDAO.create(category));

		category = categoryDAO.read(2);
		assertEquals("Fetching problem", "Music Video", category.getName());

		category = categoryDAO.read(3);
		assertEquals("Updating problem", true, categoryDAO.delete(category));
		
		category = categoryDAO.read(1);
		category.setActive(true);
		assertEquals("Updating problem", true, categoryDAO.update(category));

		assertEquals("Fetch problem", 4, categoryDAO.catListActive().size());
	}
}
