package net.abir.zerodefinition.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.abir.zerobackend.dao.BlogDAO;
import net.abir.zerobackend.dao.CategoryDAO;
import net.abir.zerobackend.dao.ConnectDAO;
import net.abir.zerobackend.dao.EnqueryDAO;
import net.abir.zerobackend.dao.MovieDAO;
import net.abir.zerobackend.dao.NewsDAO;
import net.abir.zerobackend.dto.Blog;
import net.abir.zerobackend.dto.Connect;
import net.abir.zerobackend.dto.Movie;
import net.abir.zerobackend.dto.News;

@Controller
public class PageController {
	
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	
	@Autowired
	private MovieDAO movieDAO;
	
	@Autowired
	private BlogDAO blogDAO;
	
	@Autowired
	private NewsDAO newsDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private EnqueryDAO enqueryDAO;
	
	@Autowired
	private ConnectDAO connectDAO;
	
	@RequestMapping(value= {"/","/home"})
	public ModelAndView index() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Home");
		
		logger.info("Inside PageController index method - INFO");
		logger.debug("Inside PageController index method - DEBUG");
		
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
		mv.addObject("news", newsDAO.listActive());
		mv.addObject("categories", categoryDAO.catListActive());
		
		return mv;
	}
	
	@RequestMapping(value= {"/blog"})
	public ModelAndView blog() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Blog");
		mv.addObject("userClickBlog",true);
		mv.addObject("blogs",blogDAO.blogListActive());
		mv.addObject("categories", categoryDAO.catListActive());
		
		return mv;
	}
	
	@RequestMapping(value= {"/connect"}, method=RequestMethod.GET)
	public ModelAndView connect(@RequestParam(name="operation", required=false) String operation) {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Connect");
		mv.addObject("userClickConnect",true);
		
		mv.addObject("enquery", enqueryDAO.listActive());
		
		Connect connect = new Connect();
		mv.addObject("connect", connect);
		
		if(operation !=null) {
			if(operation.equals("a_connect")) {
				mv.addObject("message", "Message sent Successfully!");
			}
		}
		
		return mv;
	}
	
	@RequestMapping(value= {"/connect"}, method=RequestMethod.POST)
	public String handleConnectSubmission(@Valid @ModelAttribute("connect") Connect connect,
			BindingResult result, Model model,
			HttpServletRequest request) {
		
		if(result.hasErrors()) {
			
			model.addAttribute("userClickConnect", true);
			model.addAttribute("title", "Connect");
			model.addAttribute("enquery", enqueryDAO.listActive());
			
			return "page";
		}
		
		logger.info(connect.toString());
		
		connectDAO.create(connect);
		
		return "redirect:/connect?operation=a_connect";
	}
	
	@RequestMapping(value= {"/blog/viewBlog/{id}/{blogname}"})
	public ModelAndView viewBlog(@PathVariable("id") int blogId, @PathVariable("blogname") String blogTitle) {
		Blog blog = blogDAO.read(blogId);
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Blog");
		mv.addObject("userClickViewBlog",true);
		mv.addObject("blog",blog);
		
		return mv;
	}
	
	@RequestMapping(value= {"/news/viewNews/{id}/{newsname}"})
	public ModelAndView viewNews(@PathVariable("id") int newsId, @PathVariable("newsname") String newsTitle) {
		ModelAndView mv= new ModelAndView("page");
		News news = newsDAO.read(newsId);
		mv.addObject("news",news);
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
	
	@RequestMapping(value= {"/register"})
	public ModelAndView theSignUp() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "SignUp");
		mv.addObject("userClickSignUp",true);
		
		return mv;
	}

}
