package com.leekuenfai.mvntest;

import java.util.function.Consumer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.glass.ui.Application;

public class TestComplexPropertyInject {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		ComplexPropertityInject inject = (ComplexPropertityInject)context.getBean("complexPropertityInject");
		inject.printeach();
//		inject.getList().forEach();
	
	}
}
