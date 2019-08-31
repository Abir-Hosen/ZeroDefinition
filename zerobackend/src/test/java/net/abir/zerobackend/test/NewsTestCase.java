package net.abir.zerobackend.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.abir.zerobackend.dao.NewsDAO;
import net.abir.zerobackend.dto.News;

public class NewsTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static NewsDAO newsDAO;
	private News news;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.abir.zerobackend");
		context.refresh();
		newsDAO = (NewsDAO)context.getBean("newsDAO");
	}
	
	@Test
	public void testNews() {
		
		news = new News();
		
		news.setCatId(4);
		news.setTitle("Title 5");
		news.setPubDate(new Date());
		news.setIntroduction("This is news introduction");
		news.setDescription("This is news description");
		news.setConclusion("This is news conclusion");
		news.setImgUrl("imgUrl");
		
		assertEquals("Something went wrong while inserting a new news!", true, newsDAO.create(news));
//		
//		news = newsDAO.read(2);
//		assertEquals("Something went wrong while inserting a new news!", "Title 1", news.getTitle());
//
//		news = newsDAO.read(4);
//		assertEquals("Something went wrong while inserting a new news!", true, newsDAO.delete(news));
//
//		news = newsDAO.read(2);
//		news.setCatId(2);
//		news.setTitle("Title 2");
//		assertEquals("Something went wrong while inserting a new blog!", true, newsDAO.update(news));
//		
//		assertEquals("Fetch problem", 5, newsDAO.listActive().size());
	}
}
