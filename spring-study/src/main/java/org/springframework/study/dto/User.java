package org.springframework.study.dto;

import java.io.Serializable;

/**
 * @author DingDong
 * @date 2024/11/14 18:07
 */

public class User implements Serializable {

	private static final long serialVersionUID = -4721607536018568393L;

	private String name;
	private Integer age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				", address='" + address + '\'' +
				'}';
	}

}
