package com.nms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nms.bo.UsersBo;

public interface UserRepository extends JpaRepository<UsersBo, Integer> {

	UsersBo findByUsername(String username);
	

}
