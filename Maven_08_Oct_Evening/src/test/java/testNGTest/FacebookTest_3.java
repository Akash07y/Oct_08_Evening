package testNGTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.BrowserSetup;
import pomClasses.LoginOrSignUpPage;
import pomClasses.SignUpPage;

public class FacebookTest_3 extends BrowserSetup{

	WebDriver driver ;
	SignUpPage signUpPage  ;
	LoginOrSignUpPage loginOrSignUpPage ;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName) {
		
		System.out.println(browserName);
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
			openChromeBrowser();
		}
		
		if(browserName.equals("Firefox")) 
		{
			driver = openFirefocBrowser();
		}
		
		if(browserName.equals("Opera")) 
		{
			driver = openOperaBrowser();
		}
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void creatPOMObjects() {
		signUpPage = new SignUpPage(driver) ;
		loginOrSignUpPage = new LoginOrSignUpPage(driver);
	}
	
	@BeforeMethod
	public void goToSignUpFrom() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		//LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.openSignUpForm();
	}
	
	@Test
	public void verifyTesrmLink() throws InterruptedException {
		
		//SignUpPage signUpPage = new SignUpPage(driver) ;
		signUpPage.clickTerms();
		Thread.sleep(5000);
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		String url = driver.getCurrentUrl() ;
		
		// Soft Assert
		// Assertion 1 - fail
		// Assertion 2
		// Assertion 3
		// Assertion 4
		
		
		
		if(url.equals("ghsdvhdjdd"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@Test
	public void veirifyCookiesPolicies() throws InterruptedException {
		//SignUpPage signUpPage = new SignUpPage(driver) ;
		signUpPage.clickCoockiesPlicies();
		Thread.sleep(5000);
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		String url = driver.getCurrentUrl() ;
		
		Assert.fail();
		if(url.equals("url1233"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

	
	@Test (dependsOnMethods = {"veirifyCookiesPolicies"})
	public void veirifyPrivacyPlicies() throws InterruptedException {
		//SignUpPage signUpPage = new SignUpPage(driver) ;
		signUpPage.clickPrivacyPlicies();
		Thread.sleep(5000);
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		String url = driver.getCurrentUrl() ;
		if(url.equals("url17658587"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
		driver.close();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
		
	}
	
	@AfterClass
	public void clearPOMObjects() {
		signUpPage = null ;
		loginOrSignUpPage = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		driver.quit();
		driver = null ;
		
		System.gc() ; // garbage collector 
	}
}
