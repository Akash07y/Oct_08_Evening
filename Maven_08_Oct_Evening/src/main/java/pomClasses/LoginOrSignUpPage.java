package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {

	//Variable : WebElement : Login Or Sign Up Page
	
	@FindBy (xpath = "//input[@id='email']") 
	private WebElement emailOrPhoneNo ;
	
	@FindBy (xpath = "//input[@id='pass']") 
	private WebElement password ;
	
	@FindBy (xpath = "//button[text()='Log in']") 
	private WebElement loginButton ;
	
	@FindBy (xpath = "//a[text()='Forgotten password?']") 
	private WebElement forgotPaswordLink ;
	
	@FindBy (xpath = "//a[text()='Create new account']") 
	private WebElement creatNewAccountButton ;
	
	@FindBy (xpath = "//a[text()='Create a Page']") 
	private WebElement createPage ;
	
	
	//Constructor : Initialization of WebElement : Login Or Sign Up Page
	//driver = driverTest = new ChromDriver()
	public LoginOrSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods : Action on WebElement : Login Or Sign Up Page
	public void sendEmailOrPhoneNo(String user){
		emailOrPhoneNo.sendKeys(user);
	}
	
	public void sendPassword(String pass){
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton(){
		loginButton.sendKeys("23456789");
	}
	
	public void clickOnForgotPassword() {
		forgotPaswordLink.click();
	}
	
	public void openSignUpForm() {
		creatNewAccountButton.click();
	}
	
	public void login() {
		emailOrPhoneNo.sendKeys("gfhsdhdj");
		password.sendKeys("1234556");
		loginButton.click();
	}
}
