package com.leekuenfai.mvntest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClassInject {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		ClassInject classInject  = (ClassInject) context.getBean("classInject");
		classInject.printIt();
	}

}
