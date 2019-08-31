package net.abir.zerobackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.abir.zerobackend.dao.NewsDAO;
import net.abir.zerobackend.dto.News;


@Repository("newsDAO")
@Transactional
public class NewsDAOImpl implements NewsDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean create(News news) {
		try {
			sessionFactory.getCurrentSession().persist(news);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public News read(int newsId) {
		try {
			return sessionFactory.getCurrentSession()
					.get(News.class, newsId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<News> list() {
		try {
			return sessionFactory.getCurrentSession()
					.createQuery("FROM News").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<News> listActive() {
		String activeSQL="FROM News WHERE active = :active";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeSQL);
		query.setParameter("active", true);

		return query.getResultList();
	}

	public List<News> listActiveByCategory(int categoryId) {
		String activeByCat="FROM News WHERE active = :active AND catId = :catId";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeByCat);
		query.setParameter("catId", categoryId);

		return query.getResultList();
	}

	public List<News> listLatest(int count) {
		return sessionFactory.getCurrentSession()
				.createQuery("FROM News WHERE active = :active ORDER BY id", News.class)
				.setParameter("active", true)
				.setFirstResult(0)
				.setMaxResults(count)
				.getResultList();
	}

	public boolean update(News news) {
		try {
			sessionFactory.getCurrentSession().update(news);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(News news) {
		news.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(news);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
