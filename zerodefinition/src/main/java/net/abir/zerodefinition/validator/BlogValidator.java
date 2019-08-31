package net.abir.zerodefinition.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.abir.zerobackend.dto.Blog;

public class BlogValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Blog.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		
		Blog blog = (Blog) target;
		if(blog.getFile() == null || blog.getFile().getOriginalFilename().equals("")) {
			errors.rejectValue("file", null, "Please select a file to upload!");
			return;
		}
		if(! (blog.getFile().getContentType().equals("image/jpeg") || 
				blog.getFile().getContentType().equals("image/png")) ||
				blog.getFile().getContentType().equals("image/gif")
			 )
			{
				errors.rejectValue("file", null, "Please select an image file to upload!");
				return;	
			}

	}

}
