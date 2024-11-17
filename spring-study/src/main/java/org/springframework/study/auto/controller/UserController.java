package org.springframework.study.auto.controller;


import org.springframework.study.auto.service.UserService;
import org.springframework.study.dto.User;

/**
 * @author Author
 * @date 2024/11/17 11:02
 */

public class UserController {

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void addUser() {
		User user = new User();
		user.setName("controllerUser");
		System.out.println("user controller add user:" + user);
		userService.addUser(user);
	}

}
