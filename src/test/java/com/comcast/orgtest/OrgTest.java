package com.comcast.orgtest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="smoke")
	public void createOrg1Test() {
		System.out.println("execute org 1");
		
	}
	@Test(groups="smoke")
	public void createOrg2Test() {
		System.out.println("execute org 2");
		
	}
	@Test(groups="regression")
	public void createOrg3Test() {
		System.out.println("execute org 3");
		
	}

}
