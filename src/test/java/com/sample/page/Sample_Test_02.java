package com.sample.page;

import org.testng.annotations.Test;

public class Sample_Test_02 {

	@Test(groups = "regression")
	public void History() {
		System.out.println("Focus on modern history thoroughly and significant administrative measures in the ancient & medieval history");
	}
	@Test(groups = "smoke")
	public void Society() {
		System.out.println("very basic things are enough and clean observation of news paper is required");
	}
}
