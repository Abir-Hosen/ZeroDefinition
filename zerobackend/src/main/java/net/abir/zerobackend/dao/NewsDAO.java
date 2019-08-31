package net.abir.zerobackend.dao;

import java.util.List;

import net.abir.zerobackend.dto.News;

public interface NewsDAO {
	
	boolean create(News news);
	News read(int newsId);
	List<News> list();
	List<News> listActive();
	List<News> listActiveByCategory(int categoryId);
	List<News> listLatest(int count);
	boolean update(News news);
	boolean delete(News news);

}
