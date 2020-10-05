package com.NewMaven.NewMaven;

import org.testng.annotations.Test;

public class A {
	@Test
	public void aTest() {
		int i=10/0;
		
		System.out.println("this is A class method"+i);
	}
}
