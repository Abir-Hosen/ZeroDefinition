package net.abir.zerobackend.dto;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int catId;
	@NotBlank(message="You must enter the Title!")
	private String title;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pubDate= new Date();
	@Size(min=50, max=1000)
	private String introduction;
	@Size(min=500, max=10000)
	private String description;
	@Size(min=50, max=1000)
	private String conclusion;
	private String imgUrl;
	private int views;
	private boolean active;
	@Transient
	private MultipartFile file;
	
	public News() { 
		
		this.imgUrl = "NWS" + UUID.randomUUID().toString().substring(26).toUpperCase();
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {

		System.out.println("Introduction length: "+introduction.length());
		System.out.println("Description length: "+description.length());
		System.out.println("Conclusion length: "+conclusion.length());
		return "News [id=" + id + ", catId=" + catId + ", title=" + title + ", pubDate=" + pubDate + ", introduction="
				+ introduction + ", description=" + description + ", conclusion=" + conclusion + ", imgUrl=" + imgUrl
				+ ", views=" + views + ", active=" + active + "]";
	}

}
