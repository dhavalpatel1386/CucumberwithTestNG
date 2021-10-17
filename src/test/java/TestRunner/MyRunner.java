package TestRunner;


import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import Utility.EmailWithAttachedReport;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
        features = {"src/test/java/Feature"},
        glue = {"TestLayer"},
        tags = {"~@Ignore"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt" },
        plugin = {"pretty:STDOUT","html:E:\\Automation\\BDDWithTestNG\\Report\\Reportcucumber-pretty",
				  "json:E:\\Automation\\BDDWithTestNG\\Report\\cucumber-json\\cucumber.json",
				 "com.cucumber.listener.ExtentCucumberFormatter:E:\\Automation\\BDDWithTestNG\\Report\\Cucumber-Extent-Report\\report.html"
			     })

public class MyRunner {
   private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
    	testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {

  	testNGCucumberRunner.finish();

  	  Reporter.loadXMLConfig(new File("E:\\Automation\\BDDWithTestNG\\config\\extent-config.xml")); 
  	  
  	  Reporter.setSystemInfo("User Name","Dhaval Patel");
      Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
      Reporter.setSystemInfo("64 Bit", 	"Windows 10");
      Reporter.setSystemInfo("2.53.0", "Selenium");
      Reporter.setSystemInfo("3.3.9", "Maven");
      Reporter.setSystemInfo("1.8.0_66", "Java Version");
      Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
      EmailWithAttachedReport emailWithAttachedReport=new EmailWithAttachedReport();
      emailWithAttachedReport.EmailSent();
      System.out.println("****************Email sent ********************");

  	  
    }

    
}
