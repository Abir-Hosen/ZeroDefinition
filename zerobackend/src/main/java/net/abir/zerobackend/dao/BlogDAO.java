package net.abir.zerobackend.dao;

import java.util.List;

import net.abir.zerobackend.dto.Blog;

public interface BlogDAO {
	
	boolean create(Blog blog);
	Blog read(int blogId);
	List<Blog> blogList();
	List<Blog> blogListActive();
	List<Blog> blogListActiveByCategory(int categoryId);
	List<Blog> blogListLatest(int count);
	boolean update(Blog blog);
	boolean delete(Blog blog);

}
