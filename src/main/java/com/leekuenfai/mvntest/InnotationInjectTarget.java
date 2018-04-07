package com.leekuenfai.mvntest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "innotationInjectTarget")
@Scope(value = "prototype")
public class InnotationInjectTarget {

	@Autowired
	InnotationInjectSrc innotationInjectSrc;
	
	public void printMe() {
		innotationInjectSrc.setMyString("setMyString...........");
		System.out.println(innotationInjectSrc.getMyString());
	}
}
