package com.leekuenfai.mvntest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "innotationCreateObj")
@Scope(value = "prototype")
public class InnotationCreateObj {
	public void printMe() {
		System.out.println("this is innotationCreateObj......");
	}
}