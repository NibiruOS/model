package com.aajtech.model.core.impl.java;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.aajtech.model.core.api.ComplexValue;

public class JavaValueTests {
	@Test
	public void test() throws Exception {
		ComplexValue<Person> personValue = JavaValue.of(new Person());

		Person person = personValue.get();

		person.setName("a");
		String name = personValue.get(Person.NAME).get();
		assertEquals("a", name);

		personValue.set(Person.NAME, JavaValue.of("b")).set(Person.BIRTHDAY, JavaValue.of(new Date(123)));
		assertEquals("b", person.getName());
		assertEquals(new Date(123), person.getBirthday());

		personValue.set(Person.ADDRESS, JavaValue.of(new Address()));
		personValue.getComplex(Person.ADDRESS).set(Address.STREET, JavaValue.of("elm"));
		assertEquals("elm", person.getAddress().getStreet());

		personValue.get(Person.BIRTHDAY).set(new Date(456));
		assertEquals(new Date(456), person.getBirthday());
		assertEquals(new Date(456), person.birthday.get());
	}
}
