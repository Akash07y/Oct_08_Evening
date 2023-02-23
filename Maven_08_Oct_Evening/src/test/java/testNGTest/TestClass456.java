package testNGTest;

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

public class TestClass456 {

	SoftAssert soft ;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - TestClass 2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - TestClass 2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - TestClass 2");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - TestClass 2");
		soft = new SoftAssert();
	}
	
	@Test (priority = 2)
	public void testA() {
		System.out.println("Test A - TestClass 2");
	}
 
	@Test 
	public void testB() {
		//soft = new SoftAssert();
		System.out.println("Test B - TestClass 2");
		
		String actualUrl = "https://www.facebook.com/" ;
		String expectedURl = "https://www.facebook.com/home" ;

		soft.assertEquals(actualUrl, expectedURl, "Homepage URL is not found");
		soft.assertAll();
	}
	 
	@Test  (priority = 1)
	public void testC() {
		//soft = new SoftAssert();
		System.out.println("Test C - TestClass 2");
		String actualTitle = "Facebook – log in or sign up" ;
		String expectedTitle = "Facebook – log in or sign u23p" ;
		
		soft.assertEquals(actualTitle, expectedTitle, "Homepage Title is wrong");
		soft.assertAll();
	}
	
	@Test 
	public void testD() {
		//soft = new SoftAssert();
		System.out.println("Test D - TestClass 2");
		
		String actualName = "Cancel" ;
		String expectedName = "Cancel45" ;
		
		soft.assertEquals(actualName, expectedName, "Cancel button text is wrong");
		soft.assertAll();
	}

	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method - TestClass 2");
		/////;
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class - TestClass 2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test - TestClass 2");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite - TestClass 2");
	}
	
}





//     Suite Tagname        TestClass Annotation
//      parameter           @Parameters
//      suite               @BeforeSuite  @AfterSuite
//      test                @BeforeTest   @AfterTest
//		class               @BeforeClass @AfterClass     
//      include             @BeforeMethod @Test  @AfterMethod







