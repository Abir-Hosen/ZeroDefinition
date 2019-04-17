package net.abir.zerobackend.dao;

import java.util.List;

import net.abir.zerobackend.dto.Category;

public interface CategoryDAO {
	
	boolean create(Category category);
	Category read(int catId);
	List<Category> catList();
	List<Category> catListActive();
	boolean update(Category category);
	boolean delete(Category category);
}
