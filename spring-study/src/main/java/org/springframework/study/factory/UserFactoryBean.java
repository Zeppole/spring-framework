package org.springframework.study.factory;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.study.dto.User;

/**
 * @author Author
 * @date 2024/11/17 10:52
 */

public class UserFactoryBean implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		User user = new User();
		user.setAddress("北京市大兴区");
		user.setAge(10);
		user.setName("factoryBeanUser");
		return user;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
