package testNGTest;

import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomClasses.LoginOrSignUpPage;
import pomClasses.SignUpPage;

public class TestClass123 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - TestClass 1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - TestClass 1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - TestClass 1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - TestClass 1");
	}
	
	@Test 
	public void test1() {
		System.out.println("Test 1 - TestClass 1");
		
		String actualUrl = "https://www.facebook.com/" ;
		String expectedURl = "https://www.facebook.com/home" ;
		
		SoftAssert soft = new SoftAssert();
		//1. To compare the data
		//2. Create the result 
		// If actual data is EQUALS to expected data then Test Case is PASSED
		// If actual data is NOT EQUALS to expected data then Test Case is FAILED
		soft.assertEquals(actualUrl, expectedURl, "Homepage URL is not found");
		
		//1. To compare the data
		//2. Create the result 
		// If actual data is EQUALS to expected data then Test Case is FAILED
		// If actual data is NOT EQUALS to expected data then Test Case is PASSED
		soft.assertNotEquals(actualUrl, expectedURl, "Homepage URL is not found") ;

		boolean result = actualUrl.equals(expectedURl) ;
		
		//2. Create the result 
		// If result == true then Test Case PASSED
		// If result == false then Test Case FAILED
		soft.assertTrue(result,  "Homepage URL is not found");
		
		//2. Create the result 	
		// If result == true then Test Case FAILED
		// If result == false then Test Case PASSED
		soft.assertFalse(result, "Homepage URL is not found");
		
		// Forcefully failed the test method 
		soft.fail();  
		
		// to apply the result of soft assert on test methods. 
		soft.assertAll();
		
		if(result == true )
		{
			
		}
		else
		{
			Assert.fail();
		}
		
		
	}
 
	@Test 
	public void test2() {
		System.out.println("Test 2 - TestClass 1");
	}
	 
	@Test
	public void test3() {
		System.out.println("Test 3 - TestClass 1");
	}
	
	@Test 
	public void test4() {
		System.out.println("Test 4 - TestClass 1");
	}

	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method - TestClass 1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class - TestClass 1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test - TestClass 1");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite - TestClass 1");
	}
	
	
	
}
