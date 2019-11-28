
package net.abir.zerodefinition.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.abir.zerobackend.dao.BlogDAO;
import net.abir.zerobackend.dto.Blog;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired
	private BlogDAO blogDAO;
	
	@GetMapping("/all/blog")
	@ResponseBody  //---------  ResponseBody annotation for returning the data in json formate
	public List<Blog> getAllBlog(){
		return blogDAO.blogListActive();
	}
	
	@RequestMapping("/category/{catId}/blog")
	@ResponseBody  //---------  ResponseBody annotation for returning the data in json formate
	public List<Blog> getBlogByCategory(@PathVariable("catId") int id){
		return blogDAO.blogListActiveByCategory(id);
	}

}