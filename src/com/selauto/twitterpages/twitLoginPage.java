package com.selauto.twitterpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selauto.config.Configs;

public class twitLoginPage {
	
	WebDriver driver;
	public twitLoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath=Configs.login)
	WebElement login;
	
		
	@FindBy(xpath=Configs.username)
	WebElement username;
	
	@FindBy(xpath=Configs.password)
	WebElement password;
	
	@FindBy(xpath=Configs.signin)
	WebElement signin;
	
	public twiterLandingPage doLogin(String myusername, String mypassword){
		login.click();
		username.sendKeys(myusername);
		password.sendKeys(mypassword);
		signin.click();
		
		return PageFactory.initElements(driver, twiterLandingPage.class);
		
	}

}
