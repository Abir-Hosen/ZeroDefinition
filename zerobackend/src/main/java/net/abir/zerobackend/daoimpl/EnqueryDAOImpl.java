package net.abir.zerobackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.abir.zerobackend.dao.EnqueryDAO;
import net.abir.zerobackend.dto.Enquery;

@Repository("enqueryDAO")
@Transactional
public class EnqueryDAOImpl implements EnqueryDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean create(Enquery enquery) {
		try {
			sessionFactory.getCurrentSession().persist(enquery);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Enquery read(int enqueryId) {
		try {
			return sessionFactory.getCurrentSession()
					.get(Enquery.class, enqueryId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Enquery> list() {
		try {
			return sessionFactory.getCurrentSession()
					.createQuery("FROM Enquery").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Enquery> listActive() {
		String activeSQL="FROM Enquery WHERE active = :active";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeSQL);
		query.setParameter("active", true);

		return query.getResultList();
	}

	public boolean update(Enquery enquery) {
		try {
			sessionFactory.getCurrentSession().update(enquery);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Enquery enquery) {
		enquery.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(enquery);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
