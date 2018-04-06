package com.leekuenfai.mvntest;

import java.io.File;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

	@Test
	public void testUser() {
		 
		System.out.println( System.getProperty("user.dir"));  
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		User user1 = (User)context.getBean("user");
		System.out.println(user1);
		
		User user2 = (User)context.getBean("user");
		System.out.println(user2);
		
		user1.add();
		
	}
}
