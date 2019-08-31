package net.abir.zerobackend.dao;

import java.util.List;

import net.abir.zerobackend.dto.Images;
import net.abir.zerobackend.dto.Videos;

public interface MMDAO {
	
	boolean addImages(Images img);
	List<Images> listImages(int itemId, int prvId);
	boolean addVideos(Videos video);
}
