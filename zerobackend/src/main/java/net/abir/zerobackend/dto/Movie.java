package net.abir.zerobackend.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String director;
	private String cast;
	private String synopse;
	private String description;
	private Date releseDate;
	private String imageUrl;
	private String videoUrl;
	private boolean active=true;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", cast=" + cast + ", synopse="
				+ synopse + ", description=" + description + ", releseDate=" + releseDate + ", imageUrl=" + imageUrl
				+ ", videoUrl=" + videoUrl + ", active=" + active + "]";
	}
	
}
