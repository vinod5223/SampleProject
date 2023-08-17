package com.SampleProject;

import org.testng.annotations.Test;

public class CreateDataTest {
	@Test(groups = "smoke")
	public void createTest() {
		System.out.println("--data created--");
	}	
	@Test
	public void insertData() {
		System.out.println("--data inserted--");
	}
}