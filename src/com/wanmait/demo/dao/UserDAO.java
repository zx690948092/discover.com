package com.wanmait.demo.dao;

import java.util.List;

import com.wanmait.demo.vo.User;

public interface UserDAO {
	
	void insert(User user);
	void update(User user);
	void delete(Integer id);
	User findById(Integer id);
	List<User> findAll();
	User findByUsernameAndPassword(User user);

}
