package com.sample.page;

import org.testng.annotations.Test;

public class Sample_Test_03 {

	@Test(groups = {"smoke", "regression"})
	public void Geography() {
		System.out.println("Focus on the static part and places in news");
	}
	
	@Test(groups = "regression")
	public void Environment() {
		System.out.println("Go for it only after the thorough reading of Geography");
	}
}
