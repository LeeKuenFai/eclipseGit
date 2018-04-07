package com.leekuenfai.mvntest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "innotationInjectSrc")
@Scope(value = "prototype")
public class InnotationInjectSrc {

	private String myString;

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
	
	
}
