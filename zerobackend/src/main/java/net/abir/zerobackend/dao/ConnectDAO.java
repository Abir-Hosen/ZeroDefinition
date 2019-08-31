package net.abir.zerobackend.dao;

import java.util.List;

import net.abir.zerobackend.dto.Connect;

public interface ConnectDAO {
	
	boolean create(Connect connect);
	Connect read(int connectId);
	List<Connect> list();
	List<Connect> listActive();
	List<Connect> listActiveByEnquery(int enqueryId);
	List<Connect> listLatest(int count);
	boolean update(Connect connect);
	boolean delete(Connect connect);

}
