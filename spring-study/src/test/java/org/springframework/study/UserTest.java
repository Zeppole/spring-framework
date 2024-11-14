package org.springframework.study;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.study.dto.User;

/**
 * @author DingDong
 * @date 2024/11/14 18:11
 */

public class UserTest {

	@Test
	public void testUser() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
	}

}
