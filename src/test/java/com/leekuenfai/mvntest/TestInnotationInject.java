package com.leekuenfai.mvntest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnotationInject {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		InnotationInjectTarget beanbean 
		= (InnotationInjectTarget)context.getBean("innotationInjectTarget");
		beanbean.printMe();
	}
}
