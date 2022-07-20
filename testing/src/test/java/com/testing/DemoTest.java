package com.testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void createDemo1Test() {
		Reporter.log("Test Demo8",true);
	}
	@Test
	public void pratice1Test() {
		String url=System.getProperty("URL");
		String browser=System.getProperty("BROWSER");
		String username=System.getProperty("USERNAME");
		String password=System.getProperty("PASSWORD");
		System.out.println("TYSS 1---> Test1");
		System.out.println("Url ----->"+url);
		System.out.println("browser----->"+browser);
		System.out.println("username----->"+username);
		System.out.println("password----->"+password);
		//ghytdrjydytftyf
		  
		
	}
	@Test
	public void createDemo2Test() {
		
	}
	@Test
	public void createDemo3Test() {
		Reporter.log("Test Demo3",true);
	}
	@Test
	public void createDemo5Test() {
		Reporter.log("Test Demo5",true);
	}
	@Test
	public void createDemo6Test() {
		Reporter.log("Test Demo6",true);
	}
	
	@Test
	public void createDemo7Test() {
		Reporter.log("Test Demo7",true);
		
	}
	
	
	
	
	

}
