package testNGTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.LoginOrSignUpPage;
import pomClasses.SignUpPage;
import utils.Utility;

public class FacebookTest1 {
	
	WebDriver driver ;
	SignUpPage signUpPage  ;
	LoginOrSignUpPage loginOrSignUpPage ;
	
	private String testID ; 
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName) {
		
		System.out.println(browserName);
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (6)\\chromedriver.exe");	
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}
		
		if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");	
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		if(browserName.equals("Opera")) {
			System.setProperty("webdriver.opera.driver", "C:\\Automation\\operadriver.exe");	
			driver = new OperaDriver();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			
		}
		
		
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
		

		loginOrSignUpPage.sendEmailOrPhoneNo( Utility.getDataFromExcelSheet("TestData", 3, 0) );
		
		loginOrSignUpPage.sendPassword( Utility.getDataFromExcelSheet("TestData", 3, 1));
	}
	
	@Test
	public void verifyTesrmLink() throws InterruptedException {
		testID = "TC101" ;
		//SignUpPage signUpPage = new SignUpPage(driver) ;
		signUpPage.clickTerms();
		Thread.sleep(5000);
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		String url = driver.getCurrentUrl() ;
		if(url.equals("ghsdvhdjdd"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		 row++;
	}
	
	@Test
	public void veirifyCookiesPolicies() throws InterruptedException {
		testID = "TC1223" ;	
	}
	
	@Test
	public void veirifyPrivacyPlicies() throws InterruptedException {
		testID = "TC65101" ;
	}

	// Listner => used to maintain the statuses/result of test methods
//	IReporter
//	ITestResult
//	ITestListner

	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreeshot(testID);
		}
		
		
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
