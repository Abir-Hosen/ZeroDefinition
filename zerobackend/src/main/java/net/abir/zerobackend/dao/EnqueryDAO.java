package net.abir.zerobackend.dao;

import java.util.List;

import net.abir.zerobackend.dto.Enquery;

public interface EnqueryDAO {
	
	boolean create(Enquery enquery);
	
	Enquery read(int enqueryId);
	List<Enquery> list();
	List<Enquery> listActive();
	
	boolean update(Enquery enquery);
	
	boolean delete(Enquery enquery);

}
