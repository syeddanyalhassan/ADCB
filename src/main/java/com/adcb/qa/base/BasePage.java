package com.adcb.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adcb.qa.utility.Constants;

import io.netty.util.Constant;

public class BasePage {

	public static WebDriver driver;
	static Properties prop;
	
	public BasePage(){
		// TODO Auto-generated constructor stub
	try 
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\adcb\\qa\\config\\config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException ex)
	{
		ex.printStackTrace();
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	}

	
	}
	
	public static void Initialization()
	{
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
	}
	
	

}
