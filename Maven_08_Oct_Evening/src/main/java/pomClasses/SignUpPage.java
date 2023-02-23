package pomClasses;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

	@FindBy (xpath = "//input[@name='firstname']") 
	private WebElement firstName ;
	
	@FindBy (xpath = "//input[@name='lastname']") 
	private WebElement lastName ;
	
	@FindBy (xpath = "//input[contains(@name,'email')]") 
	private WebElement emailId ;
	
	@FindBy (xpath = "(//input[contains(@type,'password')])[2]") 
	private WebElement newPassword ;
	
	@FindBy (xpath = "//select[@id='day']") 
	private WebElement dayOfBirth ;
	
	@FindBy (xpath = "//select[@id='month']") 
	private WebElement monthOfBirth ;
	
	@FindBy (xpath = "//select[@id='year']") 
	private WebElement yearOfBirth ;
	
	@FindBy (xpath = "(//input[@type='radio'])[1]") 
	private WebElement femaleRadioButton ;
	
	@FindBy (xpath = "(//input[@type='radio'])[2]") 
	private WebElement maleRadioButton ;
	
	@FindBy (xpath = "(//input[@type='radio'])[3]") 
	private WebElement customRadioButton ;
	
	@FindBy (xpath = "(//button[text()='Sign Up'])[1]") 
	private WebElement submitButton ;
	
	@FindBy (xpath = "(//a[text()='Terms'])[2]") 
	private WebElement termsLink ;
	
	@FindBy (xpath = "(//a[text()='Privacy Policy'])[2]") 
	private WebElement provacyPolicy ;
	
	@FindBy (xpath = "//a[text()='Cookies Policy']") 
	private WebElement cookiesPolicy ;

	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait ;
	private JavascriptExecutor javascriptExecutor ;
	
	public SignUpPage(WebDriver driver)   // driver = driverTest =new ChromeDrive()
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
		action = new Actions(this.driver);
		wait = new WebDriverWait(driver, 20);
		javascriptExecutor = (JavascriptExecutor)driver;
	}
	
	public void sendEmail() {
		//JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", emailId);
		emailId.sendKeys("velocity@gmail.com");
	}
	
	public void clickCoockiesPlicies() {
		//WebDriverWait wait = new WebDriverWait(driver, 20); // 20 Sec
		wait.until(ExpectedConditions.visibilityOf(cookiesPolicy));
		cookiesPolicy.click();
	}
	
	public void clickPrivacyPlicies() {
		//WebDriverWait wait = new WebDriverWait(driver, 20); // 20 Sec
		wait.until(ExpectedConditions.visibilityOf(provacyPolicy));
		provacyPolicy.click();
	}
	
	public void clickTerms() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // 30 Sec
		wait.until(ExpectedConditions.visibilityOf(termsLink));
		termsLink.click();
	}

	public void clickOnSubmitButton() {
		//Actions action = new Actions(driver);
		action.moveToElement(submitButton).click().build().perform();
	}
	
	public void clickOnCustomerRadioButton() {
		//Actions action = new Actions(driver);
		action.moveToElement(customRadioButton).click().build().perform();
	}
	
	public void selectDay() {
		Select s = new Select(dayOfBirth);
		s.selectByValue("5");
	}
	
	public void selectMonth() {
		Select s = new Select(monthOfBirth);
		s.selectByValue("May");
	}
	
	public void selectYear() {
		Select s = new Select(yearOfBirth);
		s.selectByValue("2000");
	}
	
	
}
