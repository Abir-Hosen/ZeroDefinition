package net.abir.zerodefinition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.abir.zerobackend.dao.MovieDAO;
import net.abir.zerobackend.dto.Movie;

@Controller
public class PageController {
	
	@Autowired
	private MovieDAO movieDAO;
	
	@RequestMapping(value= {"/","/home"})
	public ModelAndView index() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome",true);
		
		return mv;
	}
	
	@RequestMapping(value= {"/ourstory"})
	public ModelAndView ourStory() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Our Story");
		mv.addObject("userClickOurStory",true);
		
		return mv;
	}
	
	@RequestMapping(value= {"/theteam"})
	public ModelAndView theTeam() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "The Team");
		mv.addObject("userClickTheTeam",true);
		
		return mv;
	}
	
	@RequestMapping(value= {"/movies"})
	public ModelAndView movies() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Movies");
		mv.addObject("userClickMovies",true);
		
		//passing movie
		mv.addObject("movies", movieDAO.list());
		
		return mv;
	}
	
	@RequestMapping(value= {"/news"})
	public ModelAndView news() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "News");
		mv.addObject("userClickNews",true);
		
		return mv;
	}
	
	@RequestMapping(value= {"/blog"})
	public ModelAndView blog() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Blog");
		mv.addObject("userClickBlog",true);
		
		return mv;
	}
	
	@RequestMapping(value= {"/connect"})
	public ModelAndView connect() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Connect");
		mv.addObject("userClickConnect",true);
		
		return mv;
	}
	
	@RequestMapping(value= {"/blog/viewBlog/blog-title"})
	public ModelAndView viewBlog() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Blog");
		mv.addObject("userClickViewBlog",true);
		
		return mv;
	}
	
	@RequestMapping(value= {"/news/viewNews/news-title"})
	public ModelAndView viewNews() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "News");
		mv.addObject("userClickViewNews",true);
		
		return mv;
	}
	
	@RequestMapping(value= {"/movies/viewMovie/{id}/{moviename}"})
	public ModelAndView viewMovies(@PathVariable("id") int id, @PathVariable("moviename") String moviename) {
		
		ModelAndView mv= new ModelAndView("page");
		Movie movie = movieDAO.getById(id);
		mv.addObject("movie", movie);
		mv.addObject("title", "Movies");
		mv.addObject("userClickViewMovie",true);
		
		return mv;
	}

}
