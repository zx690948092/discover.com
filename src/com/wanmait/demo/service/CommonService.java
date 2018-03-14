package com.wanmait.demo.service;

import java.util.List;

import com.wanmait.demo.util.Pager;

public interface CommonService<T> {
	void insert(T object);
	void update(T object);
	void delete(Integer id);
	void delete(String ids);
	T findById(Integer id);
	List<T> findAll();
	List<T> findAll(Pager pager);
	int getDataCount();
	
}









