package net.abir.zerobackend.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.abir.zerobackend.dao.MovieDAO;
import net.abir.zerobackend.dto.Movie;

@Repository("movieDAO")
@Transactional
public class MovieDAOImpl implements MovieDAO {

	@Autowired
	private SessionFactory sessionFactory;


	public boolean add(Movie movie) {
		try {
			sessionFactory.getCurrentSession().persist(movie);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public Movie getById(int movieId) {

		try {
			return sessionFactory.getCurrentSession()
					.get(Movie.class, Integer.valueOf(movieId));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}


	public List<Movie> list() {
		return sessionFactory .getCurrentSession()
				.createQuery("FROM Movie", Movie.class).getResultList();
	}

	public List<Movie> listActiveMovie() {
		String activeMovie="FROM Movie WHERE active = :active";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeMovie);
		query.setParameter("active", true);

		return query.getResultList();
	}

	public List<Movie> listMovieByCategory(int categoryId) {
		String activeByCat="FROM Movie WHERE active = :active AND catId = :catId";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeByCat);
		query.setParameter("catId", categoryId);

		return query.getResultList();
	}

	public List<Movie> listLatestMovie(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(Movie movie) {
		try {
			sessionFactory.getCurrentSession().update(movie);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Movie movie) {
		movie.setActive(false);

		try {
			sessionFactory.getCurrentSession().update(movie);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
