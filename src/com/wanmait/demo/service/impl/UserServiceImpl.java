package com.wanmait.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;



import org.springframework.stereotype.Service;

import com.wanmait.demo.dao.UserDAO;
import com.wanmait.demo.service.UserService;
import com.wanmait.demo.util.Pager;
import com.wanmait.demo.vo.User;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDAO userDAO;

	/*@Resource
	public void setUserDAO(UserDAO UserDAO) {
		this.UserDAO = UserDAO;
	}*/
	/*private LogDAO logDAO;
	

	public void setLogDAO(LogDAO logDAO) {
		this.logDAO = logDAO;
	}*/

	@Override
	public void insert(User user) {
		userDAO.insert(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		userDAO.delete(id);
	}

	@Override
	public User findById(Integer id) {
		if(id<1) return null;
		return userDAO.findById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	@Override
	public User login(User user) {

		return null;
	}

	@Override
	public void delete(String ids) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getDataCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> findAll(Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

}
