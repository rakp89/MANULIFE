package com.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRetirement {

public WebDriver driver;
@FindBy (partialLinkText="Sign in")
public static WebElement signin;
@FindBy(partialLinkText="My group retirement or VIP Room")
public static WebElement selectplan;
@FindBy(id="username-input")
public static WebElement email;
@FindBy(id="password-input")
public static WebElement password;
@FindBy(id="password-input")
public static WebElement Wrongpassword;
@FindBy(id="sign-in-username-input-field-error-message")
public static WebElement emptyemailerror;
@FindBy(id="sign-in-password-input-field-error-message")
public static WebElement emptypassworderror;
@FindBy(xpath="//button[@class='sc-kgoBCf dqzdlV']")
public static WebElement enter;







public void openbrowser() throws IOException {
	FileInputStream fs =new FileInputStream("/Users/rakesh/eclipse-workspace/manulife/src/com/utilities/config.properties");
	Properties P=new Properties();
	P.load(fs);
	String Browser=P.getProperty("browser");
if(Browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "/Users/rakesh/eclipse-workspace/manulife/src/com/utilities/chromedriver");
	 driver=new ChromeDriver();
	 
}else if(Browser.equals("firefox")) {
	System.setProperty("webdriver.gecko.driver", "/Users/rakesh/eclipse-workspace/manulife/src/com/utilities/geckodriver");
	driver= new FirefoxDriver();
}else
{
	System.setProperty("webdriver.gecko.driver", "/Users/rakesh/eclipse-workspace/manulife/src/com/utilities/geckodriver");
	driver= new FirefoxDriver();
	}
PageFactory.initElements(driver, this);
}
public void closebrowser() {
	driver.quit();
}
public void manulifelogin() {
	driver.get("https://portal.manulife.ca/apps/groupretirement/login?lang=en");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
public void enteremail(String a) {
	email.sendKeys(a);
}
public void enterpassword(String b) {
password.sendKeys(b);

}
public void login()
{
	enter.click();
	}
	

public String wemailpassworderror() {
String	Wpassworderror =Wrongpassword.getText();
System.out.println(Wpassworderror);

	return Wpassworderror;
	
}
public String emailEmpty() {
	String emailempty=emptyemailerror.getText();
	System.out.println(emailempty);
	
	return emailempty;
	
}
public String passwordEmpty() {
	String passwordempty=emptypassworderror.getText();
	System.out.println(passwordempty);
	
	return passwordempty;
	
}










}