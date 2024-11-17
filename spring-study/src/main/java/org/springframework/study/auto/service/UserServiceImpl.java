package org.springframework.study.auto.service;


import org.springframework.study.auto.dao.UserDao;
import org.springframework.study.dto.User;

/**
 * @author Author
 * @date 2024/11/17 11:01
 */

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		System.out.println("user service add user:" + user);
		userDao.addUser(user);
	}

}
