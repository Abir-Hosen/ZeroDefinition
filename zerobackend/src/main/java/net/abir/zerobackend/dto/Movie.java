package net.abir.zerobackend.dto;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int catId; 
	@NotBlank(message="Please Enter The Movie Name!")
	private String name;
	@NotBlank(message="Please Enter The Director Name!")
	private String director;
	@NotBlank(message="Please Enter The Cast Name!")
	private String cast;
	@NotBlank(message="Please Enter The Synopse!")
	private String synopse;
	@NotBlank(message="Please Enter The Description!")
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date releseDate;
	private String imageUrl;
	private String videoUrl;
	private boolean active;
	@Transient
	private MultipartFile file;
	
public Movie() { 
		
		this.imageUrl = "MOV" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getSynopse() {
		return synopse;
	}
	public void setSynopse(String synopse) {
		this.synopse = synopse;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getReleseDate() {
		return releseDate;
	}
	public void setReleseDate(Date releseDate) {
		this.releseDate = releseDate;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", catId=" + catId + ", name=" + name + ", director=" + director + ", cast=" + cast
				+ ", synopse=" + synopse + ", description=" + description + ", releseDate=" + releseDate + ", imageUrl="
				+ imageUrl + ", videoUrl=" + videoUrl + ", active=" + active + "]";
	}

}
