package org.springframework.study.auto.dao;


import org.springframework.study.dto.User;

/**
 * @author Author
 * @date 2024/11/17 11:00
 */

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		System.out.println("user dao add user:" + user);
	}
}
