package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	public ReadConfig()
	{
		
		try 
		{
		File src=new File("E:\\Automation\\BDDWithTestNG\\src\\test\\java\\Utility\\config.properties");
		FileInputStream fis=new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
		
		
		}
		catch(Exception e)
		{
		System.out.println("Exception Message" +e.getMessage());	
		}
	}
	
//	public String getApplicationURL()
//	{
//	      String url=prop.getProperty("Url");
//	      return url;
//	}
//	public String getEmail()
//	{
//		String email=prop.getProperty("UserName");
//		return email;
//	}
//	public String getPassword()
//	{
//		String password=prop.getProperty("Password");
//		return password;
//	}
	public String getDriver()
	{
		String driverPath=prop.getProperty("Driver");
		return driverPath;
	}
	
	
	
}
