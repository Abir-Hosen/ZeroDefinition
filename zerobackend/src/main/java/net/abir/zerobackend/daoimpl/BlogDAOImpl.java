package net.abir.zerobackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.abir.zerobackend.dao.BlogDAO;
import net.abir.zerobackend.dto.Blog;

@Repository("blogDAO")
@Transactional
public class BlogDAOImpl implements BlogDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean create(Blog blog) {
		try {
			sessionFactory.getCurrentSession().persist(blog);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Blog read(int blogId) {
		try {
			return sessionFactory.getCurrentSession()
					.get(Blog.class, blogId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Blog> blogList() {
		try {
			return sessionFactory.getCurrentSession()
					.createQuery("FROM Blog").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Blog> blogListActive() {
		String activeBlog="FROM Blog WHERE active = :active";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeBlog);
		query.setParameter("active", true);

		return query.getResultList();
	}

	public List<Blog> blogListActiveByCategory(int categoryId) {
		String activeCatBlog="FROM Blog WHERE active = :active AND catId = :catId";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeCatBlog);
		query.setParameter("catId", categoryId);

		return query.getResultList();
	}

	public List<Blog> blogListLatest(int count) {
		return sessionFactory.getCurrentSession()
				.createQuery("FROM Blog WHERE active = :active ORDER BY id", Blog.class)
				.setParameter("active", true)
				.setFirstResult(0)
				.setMaxResults(count)
				.getResultList();
	}

	public boolean update(Blog blog) {
		try {
			sessionFactory.getCurrentSession().update(blog);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Blog blog) {
		blog.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(blog);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
