package com.leekuenfai.mvntest;

import java.awt.print.Printable;

public class PropertyInject{
	
	
	private String injectString;

	public String getInjectString() {
		return injectString;
	}

	public void setInjectString(String injectString) {
		this.injectString = injectString;
	}
	
	public void printInjectedString() {
		System.out.println("injected string : " + injectString);
	}
	
}