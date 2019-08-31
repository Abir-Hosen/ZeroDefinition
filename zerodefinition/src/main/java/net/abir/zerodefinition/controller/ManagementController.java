package net.abir.zerodefinition.controller;



import java.util.List;

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
import net.abir.zerobackend.dao.MovieDAO;
import net.abir.zerobackend.dao.NewsDAO;
import net.abir.zerobackend.dto.Blog;
import net.abir.zerobackend.dto.Category;
import net.abir.zerobackend.dto.Movie;
import net.abir.zerobackend.dto.News;
import net.abir.zerodefinition.util.FileUploadUtility;
import net.abir.zerodefinition.validator.BlogValidator;
import net.abir.zerodefinition.validator.MovieValidator;
import net.abir.zerodefinition.validator.NewsValidator;

@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);
	
	@Autowired
	MovieDAO movieDAO;

	@Autowired
	NewsDAO newsDAO;

	@Autowired
	BlogDAO blogDAO;
	
	@Autowired
	CategoryDAO categoryDAO;

	
	
	@ModelAttribute("categories")
	public List<Category> getCategories(){
		return categoryDAO.catList();
	}
	
	/*
	 * 
	 *************             MANAGE MOVIE BLOCK            *************
	 * 
	 */
	
	@RequestMapping(value= {"/movies"}, method=RequestMethod.GET)
	public ModelAndView manageMovie(@RequestParam(name="operation", required=false) String operation) {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickManageMovie", true);
		mv.addObject("title", "Movies");

		//list for list of other movies
		mv.addObject("movies", movieDAO.list());
		
		//passing model attribute
		Movie movie = new Movie();
		mv.addObject("movieF", movie);
	 	
		if(operation !=null) {
			if(operation.equals("movie")) {
				mv.addObject("message", "Movie included to database Successfully!");
			}
		}
		
		return mv;
	}

	@RequestMapping(value= {"/movies"}, method=RequestMethod.POST)
	public String handleMovieSubmission(@Valid @ModelAttribute("movieF") Movie mMovie,
			BindingResult result, Model model,
			HttpServletRequest request) {
		
		if(mMovie.getId()==0) {
			new MovieValidator().validate(mMovie, result);
		}else {
			if(!mMovie.getFile().getOriginalFilename().equals("")) {
				new MovieValidator().validate(mMovie, result);
			}
		}
		//Check if there are any error
		if(result.hasErrors()) {
			
			model.addAttribute("userClickManageMovie", true);
			model.addAttribute("title", "Movies");
//			model.addAttribute("movies", movieDAO.list());
			
			return "page";
		}
		
		logger.info(mMovie.toString());
		
		if(mMovie.getId()==0) {
			movieDAO.add(mMovie);	
		}
		else{
			movieDAO.update(mMovie);
		}
		
		if(!mMovie.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request,mMovie.getFile(), mMovie.getImageUrl());
		}
		
		return "redirect:/manage/movies?operation=movie";
	}
	
	@RequestMapping(value= {"/{id}/movies"}, method=RequestMethod.GET)
	public ModelAndView editMovie(@PathVariable("id") int movId) {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickManageMovie", true);
		mv.addObject("title", "Movies");

		//list for list of other movies
		mv.addObject("movies", movieDAO.list());
		
		//passing model attribute
		Movie movie = movieDAO.getById(movId);
		mv.addObject("movieF", movie);
		
		return mv;
	}
	
	
	/*
	 * 
	 *************             MANAGE NEWS BLOCK            *************
	 * 
	 */
	
	@RequestMapping(value= {"/news"}, method=RequestMethod.GET)
	public ModelAndView manageNews( @RequestParam(name="operation", required=false) String operation) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickManageNews",true);
		mv.addObject("title","News");
		mv.addObject("categories", categoryDAO.catListActive());
		mv.addObject("nnews",newsDAO.list());
		
		News nNews = new News();
		nNews.setActive(true);
		mv.addObject("news", nNews);
		
		if(operation !=null) {
			if(operation.equals("news")) {
				mv.addObject("message","News Published Successfully!");
			}
		}
		
		return mv;
	}
	
	@RequestMapping(value= {"/news"}, method=RequestMethod.POST)
	public String handleNewsSubmission(@Valid @ModelAttribute("news") News mNews,
			BindingResult result, Model model,
			HttpServletRequest request) {
		
		if(mNews.getId()==0) {
			new NewsValidator().validate(mNews, result);
		}else {
			if(!mNews.getFile().getOriginalFilename().equals("")) {
				new NewsValidator().validate(mNews, result);
			}
		}
	
		//Check if there are any error
		if(result.hasErrors()) {
			
			model.addAttribute("userClickManageNews", true);
			model.addAttribute("title", "News");
			
			return "page";
		}
		
		logger.info(mNews.toString());
		
		if(mNews.getId()==0) {
			newsDAO.create(mNews);
		}else {
			newsDAO.update(mNews);
		}
		
		if(!mNews.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request,mNews.getFile(), mNews.getImgUrl());
		}
		
		return "redirect:/manage/news?operation=news";
	}
	
	@RequestMapping(value= {"/{id}/news"}, method=RequestMethod.GET)
	public ModelAndView editNews(@PathVariable("id") int newsId) {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickManageNews",true);
		mv.addObject("title","News");
		mv.addObject("categories", categoryDAO.catListActive());
		mv.addObject("nnews",newsDAO.list());
		
		News nNews = newsDAO.read(newsId);
		mv.addObject("news", nNews);
		
		return mv;
	}
	
	/*
	 * 
	 *************             MANAGE BLOG BLOCK            *************
	 * 
	 */
	
	@RequestMapping(value= {"/blog"}, method=RequestMethod.GET)
	public ModelAndView manageBlog(@RequestParam(name="operation", required=false) String operation) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickManageBlog", true);
		mv.addObject("title", "Blog");
		mv.addObject("blogs", blogDAO.blogList());
		mv.addObject("categories", categoryDAO.catListActive());
		
		Blog nblog = new Blog();
		nblog.setActive(true);
		mv.addObject("blog", nblog);
		
		if(operation !=null) {
			if(operation.equals("blog")) {
				mv.addObject("message","News Published Successfully!");
			}
		}
		
		return mv;
	}
	
	@RequestMapping(value={"/blog"}, method=RequestMethod.POST)
	public String manageBlogSubmission(@Valid @ModelAttribute("blog") Blog mblog,
			BindingResult result, Model model,
			HttpServletRequest request) {
		
		if(mblog.getId()==0) {
			new BlogValidator().validate(mblog, result);
		}else {
			if(!mblog.getFile().getOriginalFilename().equals("")) {
				new BlogValidator().validate(mblog, result);
			}
		}
		
		//Check if there are any error
		if(result.hasErrors()) {
			
			model.addAttribute("userClickManageBlog", true);
			model.addAttribute("title", "Blog");
			
			return "page";
		}
		
		logger.info(mblog.toString());
		
		if(mblog.getId()==0) {
			blogDAO.create(mblog);
		}else {
			blogDAO.update(mblog);
		}
		
		if(!mblog.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request,mblog.getFile(), mblog.getImgUrl());
		}
		
		return "redirect:/manage/blog?operation=blog";
	}
	
	@RequestMapping(value= {"/{id}/blog"}, method=RequestMethod.GET)
	public ModelAndView editBlog(@PathVariable("id") int blogId) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickManageBlog", true);
		mv.addObject("title", "Blog");
		mv.addObject("blogs", blogDAO.blogList());
		mv.addObject("categories", categoryDAO.catListActive());
		
		Blog nblog = blogDAO.read(blogId);
		mv.addObject("blog", nblog);
		
		return mv;
	}
}
