package net.abir.zerobackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.abir.zerobackend.dao.MMDAO;
import net.abir.zerobackend.dto.Images;
import net.abir.zerobackend.dto.Videos;

@Repository("mMDAO")
@Transactional
public class MMDAOImpl implements MMDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addImages(Images img) {
		try {
			sessionFactory.getCurrentSession().persist(img);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean addVideos(Videos video) {
		try {
			sessionFactory.getCurrentSession().persist(video);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Images> listImages(int itemId, int prvId) {
		String imgs="FROM Images WHERE itemId = :itemId AND prvId = :prvId";
		Query query = sessionFactory.getCurrentSession()
				.createQuery(imgs, Images.class);
		query.setParameter("itemId", itemId);
		query.setParameter("prvId", prvId);

		return query.getResultList();
	}

}
