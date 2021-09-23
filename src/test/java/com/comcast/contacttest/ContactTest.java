package com.comcast.contacttest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="regression")
	public void createContatc1Test() {
		System.out.println("execute 1");
		
	}
	@Test(groups="regression")
	public void createContatc2Test() {
		System.out.println("execute 2");
		
	}
	@Test(groups="smoke")
	public void createContatc3Test() {
		System.out.println("execute 3");
		
	}

}
