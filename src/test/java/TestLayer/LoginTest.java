package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import PageLayer.LoginPage;
import Utility.BaseClass;
import Utility.ReadConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseClass {
WebDriver driver;
@Given("^I open browser and enter url$")
public void i_open_browser_and_enter_url() throws Throwable {
		readConfig=new ReadConfig();
		System.setProperty("webdriver.chrome.driver",readConfig.getDriver());
	 //	WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
}
@When("^I enter valid credential$")
public void i_enter_valid_credential() throws Throwable {
	loginPage=new LoginPage(driver);
	loginPage.setUserName();
	loginPage.setPassword();
}
@When("^I click on login$")
public void i_click_on_login() throws Throwable {
	loginPage.clickLogin();
	
}

@Then("^I redirect to Home page of application$")
public void i_redirect_to_Home_page_of_application() throws Throwable {
    String title=driver.getTitle();
    Assert.assertEquals(title, "OrangeHRM", "Passed");
    driver.close();
}	

@Given("^I click on assign leave$")
public void i_click_on_assign_leave() throws Throwable {
    System.out.println("First---Test-----start");
    System.out.println("click done");
    
}

@When("^I click on assign button$")
public void i_click_on_assign_button() throws Throwable {
}

@Then("^It shows the validation error$")
public void it_shows_the_validation_error() throws Throwable {

    System.out.println("Test-----End");
    
    
 
}

@Given("^I click on assign leave and fill detail$")
public void i_click_on_assign_leave_and_fill_detail() throws Throwable {

    System.out.println("Second----Test-----start");
}

@When("^I click assign button$")
public void I_click_assign_button() throws Throwable {

    
}
@Then("^It shows the success message$")
public void It_shows_the_success_message() throws Throwable {

    System.out.println("Test-----end");
  
}
}
