package com.sample.page;

import org.testng.annotations.Test;

public class Sample_Test_01 {


///group execution
	@Test(groups = "smoke")
	public void Economy() {
		System.out.println("Tomorrow start reading with Economy at the first hand");
	}
	
	@Test(groups = "regression")
	public void Polity() {
		System.out.println("Static portion must be connect with current affairs");
	}
}
