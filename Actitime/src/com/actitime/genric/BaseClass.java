package com.actitime.genric;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() throws IOException {
		Reporter.log("Open Browser",true);
		driver = new ChromeDriver();
		Filelib f=new  Filelib();
		String url = f.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login",true);
        Filelib f=new  Filelib();
		String un = f.getProperty("username");
		String pw = f.getProperty("password");
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pw);
	}
	@AfterMethod
	public void logout(){
		Reporter.log("Log Out",true);
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("Close Browser",true);
		//driver.close();
	}
}
