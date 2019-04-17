package net.abir.zerobackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.abir.zerobackend.dao.CategoryDAO;
import net.abir.zerobackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean create(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Category read(int catId) {
		try {
			return sessionFactory.getCurrentSession()
					.get(Category.class, catId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Category> catList() {
		try {
			return sessionFactory.getCurrentSession()
					.createQuery("FROM Category").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Category> catListActive() {
		String activeCategory="FROM Category WHERE active = :active";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeCategory);
		query.setParameter("active", true);

		return query.getResultList();
	}

	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
