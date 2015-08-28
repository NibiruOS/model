package com.aajtech.model.core.impl.java;

import java.util.Date;

import com.aajtech.model.core.api.Property;
import com.aajtech.model.core.api.Type;

public class Person {
	public static final Type<Person> TYPE = new JavaType<>(Person.class);
	public static final Property<Person, String> NAME = TYPE.getProperty("name");
	public static final Property<Person, Date> BIRTHDAY = TYPE.getProperty("birthday");
	public static final Property<Person, Address> ADDRESS = TYPE.getProperty("address");

	private String name;
	private Address address;
	private Person father;
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}