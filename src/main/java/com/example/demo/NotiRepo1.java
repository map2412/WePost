package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NotiRepo1 extends CrudRepository<noti1, String>{
public List<noti1> findAll();
	
	public List<noti1> findByCid(String Cid);

	
}


