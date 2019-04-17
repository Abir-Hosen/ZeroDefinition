package net.abir.zerobackend.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.abir.zerobackend.dao.BlogDAO;
import net.abir.zerobackend.dto.Blog;

public class BlogTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static BlogDAO blogDAO;
	private Blog blog;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.abir.zerobackend");
		context.refresh();
		blogDAO = (BlogDAO)context.getBean("blogDAO");
	}
	
	@Test
	public void TestBlog() {
		
/*		blog = new Blog();
		
		blog.setCatId(4);
		blog.setTitle("Title 5");
		blog.setPubDate(new Date());
		blog.setDescription("This is Blog description");
		blog.setConclusion("This is Blog conclusion");
		blog.setImgUrl("imgUrl");
		
		assertEquals("Something went wrong while inserting a new blog!", true, blogDAO.create(blog));
		
		blog = blogDAO.read(2);
		assertEquals("Something went wrong while inserting a new blog!", "Title", blog.getTitle());

		blog = blogDAO.read(4);
		assertEquals("Something went wrong while inserting a new blog!", true, blogDAO.delete(blog));

		blog = blogDAO.read(3);
		blog.setCatId(3);
		blog.setTitle("Title 3");
		assertEquals("Something went wrong while inserting a new blog!", true, blogDAO.update(blog));
		*/
		assertEquals("Fetch problem", 5, blogDAO.blogListActive().size());
	}
}
