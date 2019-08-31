package net.abir.zerodefinition.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.abir.zerobackend.dto.News;

public class NewsValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return News.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		News news = (News) target;
		if(news.getFile() == null || news.getFile().getOriginalFilename().equals("")) {
			errors.rejectValue("file", null, "Please select a file to upload!");
			return;
		}
		if(! (news.getFile().getContentType().equals("image/jpeg") || 
				news.getFile().getContentType().equals("image/png")) ||
				news.getFile().getContentType().equals("image/gif")
			 )
			{
				errors.rejectValue("file", null, "Please select an image file to upload!");
				return;	
			}
	}

}
