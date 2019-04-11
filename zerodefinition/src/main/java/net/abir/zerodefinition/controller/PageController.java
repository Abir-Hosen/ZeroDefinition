package net.abir.zerodefinition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
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
	
	@RequestMapping(value= {"/movies/viewMovie/movie-title"})
	public ModelAndView viewMovies() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Movies");
		mv.addObject("userClickViewMovie",true);
		
		return mv;
	}

}
