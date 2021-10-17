package Utility;

import org.openqa.selenium.WebDriver;

import PageLayer.LoginPage;

public class BaseClass {

//	public WebDriver driver;
	public ReadConfig readConfig;
	public LoginPage loginPage;
	
	
	
	public void TearDown()
	{
	//	driver.close();
	}
	
	
}
