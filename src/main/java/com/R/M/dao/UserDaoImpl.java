package com.R.M.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public String findName(Integer id) {
		
		return "John";
	}

}
