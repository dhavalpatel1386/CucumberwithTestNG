package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.CSS,using="input#txtUsername")
	WebElement txtUserName;
	
	@FindBy(how=How.CSS,using="input#txtPassword")
	WebElement txtPassword;
	
	@FindBy(how=How.CSS,using="input#btnLogin")
	WebElement btnLogin;
	
	
	public void setUserName()
	{
		txtUserName.sendKeys("Admin");
	}
	public void setPassword()
	{
		txtPassword.sendKeys("admin123");
	}
	public void clickLogin()
	{
		btnLogin.click();
	}

}
