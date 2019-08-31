package net.abir.zerobackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.abir.zerobackend.dao.ConnectDAO;
import net.abir.zerobackend.dto.Connect;

@Repository("connectDAO")
@Transactional
public class ConnectDAOImpl implements ConnectDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean create(Connect connect) {
		try {
			sessionFactory.getCurrentSession().persist(connect);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Connect read(int connectId) {
		try {
			return sessionFactory.getCurrentSession()
					.get(Connect.class, connectId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Connect> list() {
		try {
			return sessionFactory.getCurrentSession()
					.createQuery("FROM Connect").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Connect> listActive() {
		String activeSQL="FROM Connect WHERE active = :active";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeSQL);
		query.setParameter("active", true);

		return query.getResultList();
	}

	public List<Connect> listActiveByEnquery(int enqueryId) {
		String activeByEnq="FROM Connect WHERE active = :active AND enqId = :enqId";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(activeByEnq);
		query.setParameter("enqId", enqueryId);

		return query.getResultList();
	}

	public List<Connect> listLatest(int count) {
		return sessionFactory.getCurrentSession()
				.createQuery("FROM Connect WHERE active = :active ORDER BY id", Connect.class)
				.setParameter("active", true)
				.setFirstResult(0)
				.setMaxResults(count)
				.getResultList();
	}

	public boolean update(Connect connect) {
		try {
			sessionFactory.getCurrentSession().update(connect);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Connect connect) {
		connect.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(connect);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
