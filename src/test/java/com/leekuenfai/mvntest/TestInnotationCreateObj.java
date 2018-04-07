package com.leekuenfai.mvntest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnotationCreateObj {
	
	@Test
	public void test() {
	ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
	InnotationCreateObj innotationCreateObj = 
			(InnotationCreateObj)context.getBean("innotationCreateObj");
	innotationCreateObj.printMe();
	}
}
