package net.abir.zerobackend.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.abir.zerobackend.dao.BlogDAO;
import net.abir.zerobackend.dao.MMDAO;
import net.abir.zerobackend.dto.Blog;
import net.abir.zerobackend.dto.Images;

public class MMTestCase {

	private static AnnotationConfigApplicationContext context;
	private static MMDAO mMDAO;
	private static BlogDAO blogDAO;

	private Blog blog;
	private Images image;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.abir.zerobackend");
		context.refresh();
		mMDAO = (MMDAO)context.getBean("mMDAO");
		blogDAO = (BlogDAO)context.getBean("blogDAO");
	}

	@Test
	public void TestMM() {

		blog = blogDAO.read(22);

		image = new Images();
		image.setPrvId(3);
		image.setUrl("url1");
		image.setDate(new Date());
		image.setDescription("Description");
		image.setItemId(blog.getId());

		assertEquals("Something went wrong while inserting a new img!", true, mMDAO.addImages(image));

	}
}
