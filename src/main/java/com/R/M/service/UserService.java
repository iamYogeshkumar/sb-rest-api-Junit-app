package com.R.M.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.R.M.dao.UserDao;

@Service
public class UserService {

	@Autowired(required = false)
	private UserDao userDao;
	
	public String getUserName(Integer uid) {
		System.out.println(userDao.getClass().getName());
		String name = userDao.findName(uid);
		System.out.println("Name :: "+name);
		return name;
	}
}
