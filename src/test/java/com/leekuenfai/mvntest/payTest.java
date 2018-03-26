package com.leekuenfai.mvntest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class payTest {
	
	private Pay pay;
	
	@Before
	public void init() {
		pay = new Pay();
			
	}
	
	@Test
	public void testOrderPay() {
		int total = pay.orderPay(10, 9);
		Assert.assertEquals(90, total);
		
	}

}
