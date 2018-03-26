package com.leekuenfai.mvntest;

public class Pay {
	
	
	public int orderPay(int price ,int num ) {
		return price*num;
	}
	
	public static void main(String args[]) {
		Pay pay = new Pay();
		int total = pay.orderPay(10,5);
		System.out.println(total);
	}

}
