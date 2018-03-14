package com.wanmait.demo.service;

import com.wanmait.demo.vo.User;

public interface UserService extends CommonService<User> {
	
	User login(User admin);
}
