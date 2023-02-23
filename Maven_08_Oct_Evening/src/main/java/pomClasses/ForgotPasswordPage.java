package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	//Variable : WebElement : Login Or Sign Up Page
	@FindBy (xpath = "//table//tr[1]//td[2]//div") 
	private WebElement forgotMessage ;
	
	@FindBy (xpath = "(//input[@name='email'])[2]") 
	private WebElement emailOrMobile ;
	
	@FindBy (xpath = "//a[text()='Cancel']") 
	private WebElement cancelButton ;

	@FindBy (xpath = "//button[text()='Search']") 
	private WebElement searchButton ;
		
	//Constructor : Initialization of WebElement : Login Or Sign Up Page
	
	public ForgotPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods : Action on WebElement : Login Or Sign Up Page
	public void getForgotWindowMesage(){
		String text = forgotMessage.getText();
		System.out.println(text);
	}
	
	public void sendEmailID(){
		emailOrMobile.sendKeys("velocity@12345.com");
		// mouse action
	}
	
	public void clickOnCancel(){
		cancelButton.click();
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
}
