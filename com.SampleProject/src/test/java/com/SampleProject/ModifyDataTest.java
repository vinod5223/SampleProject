package com.SampleProject;

import org.testng.annotations.Test;

public class ModifyDataTest {

	@Test
	public void modifyTest() {
		System.out.println("--data modified--");
	}
	
	@Test(groups = "smoke")
	public void deleteTest() {
		System.out.println("--data deleted--");
		System.out.println("Extra step added from github");
		System.out.println("This step is newly added from eclipse which is to be pushed");
	}
}
