package com.example.login.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.login.entity.Login;

public interface LoginRepository extends CrudRepository<Login,Integer> {
	
	public List<Login> findAll();
	
	Login findByEmail(String email);
	

}
