package net.abir.zerodefinition.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.abir.zerobackend.dto.Movie;

public class MovieValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Movie.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		Movie movie = (Movie) target;
		if(movie.getFile() == null || movie.getFile().getOriginalFilename().equals("")) {
			errors.rejectValue("file", null, "Please select a file to upload!");
			return;
		}
		if(! (movie.getFile().getContentType().equals("image/jpeg") || 
				movie.getFile().getContentType().equals("image/png") ||
				movie.getFile().getContentType().equals("image/jpg") ||
				movie.getFile().getContentType().equals("image/gif")
				))
			{
				errors.rejectValue("file", null, "Please select an image file to upload!");
				return;	
			}
	}

}
