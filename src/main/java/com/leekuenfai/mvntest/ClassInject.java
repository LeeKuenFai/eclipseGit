package com.leekuenfai.mvntest;


public class ClassInject {
	
	PropertyInject  propertyInject;

	public void setPropertyInject(PropertyInject propertyInject) {
		this.propertyInject = propertyInject;
	}
	
	public void printIt() {
		System.out.println("ClassInject.................");
		propertyInject.printInjectedString();
	}
}
