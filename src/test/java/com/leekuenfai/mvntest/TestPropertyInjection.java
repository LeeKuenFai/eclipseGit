package com.leekuenfai.mvntest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropertyInjection{
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		PropertyInject propertyInject = (PropertyInject)context.getBean("propertyInject");
		propertyInject.printInjectedString();
		
	}
}