package net.abir.zerobackend.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.abir.zerobackend.dao.MovieDAO;
import net.abir.zerobackend.dto.Movie;

public class MovieTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static MovieDAO movieDAO;
	private Movie movie;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.abir.zerobackend");
		context.refresh();
		movieDAO=(MovieDAO)context.getBean("movieDAO");
	}
	
	@Test
	public void testCRUDMovie() {
		movie = new Movie();
		
		movie.setName("Rashtro Vasha Bangla Chai");
		movie.setCatId(1);
		movie.setDirector("Hasib Al Amin");
		movie.setCast("Ashraful Islam");
		movie.setDescription("This is description");
		movie.setSynopse("This is synopsse");
		movie.setImageUrl("IUrl");
		movie.setVideoUrl("VUrl");
		movie.setReleseDate(new Date());
		
		assertEquals("Something went wrong while inserting a new movie!", true, movieDAO.add(movie));
	}

/*	@Test
	public void testGetMovie() {
		movie = movieDAO.getById(2);
		assertEquals("Fetching problem", "Philosophy", movie.getName());
	}*/

/*	@Test
	public void testUpdateMovie() {
		movie = movieDAO.getById(2);
		movie.setName("Philosophy");
		movie.setCast("Nazmul Hossain Bappy");
		movie.setReleseDate(new Date());
		assertEquals("Updating problem", true, movieDAO.update(movie));
	}*/


/*	@Test
	public void testDeleteMovie() {
		movie = movieDAO.getById(3);
		assertEquals("Updating problem", true, movieDAO.delete(movie));
	}*/

/*	@Test
	public void testActiveMovieList() {
		assertEquals("Fetch problem", 3, movieDAO.listActiveMovie().size());
	}*/

//	@Test
//	public void testCRUDCategory() {
//		movie = new Movie();
//
//		movie.setName("Keno Hothat Tumi Ele");
//		movie.setDirector("Shakib ony");
//		movie.setCast("Rafi & Jemi");
//		movie.setDescription("This is description");
//		movie.setSynopse("This is synopsse");
//		movie.setImageUrl("IUrl");
//		movie.setVideoUrl("VUrl");
//		movie.setReleseDate(new Date());
//
//		assertEquals("Something went wrong while inserting a new movie!", true, movieDAO.add(movie));
//
//		movie = movieDAO.getById(2);
//		assertEquals("Fetching problem", "Philosophy", movie.getName());
//
//		movie = movieDAO.getById(2);
//		movie.setName("Dorshon");
//		movie.setReleseDate(new Date());
//		assertEquals("Updating problem", true, movieDAO.update(movie));
//
//		movie = movieDAO.getById(1);
//		assertEquals("Updating problem", true, movieDAO.delete(movie));
//
//		assertEquals("Fetch problem", 3, movieDAO.listActiveMovie().size());
//	}

}
