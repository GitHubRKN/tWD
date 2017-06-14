package com.selauto.twitterpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selauto.config.Configs;

public class twiterLandingPage {
	
	WebDriver driver;
	public twiterLandingPage(WebDriver driver){
		this.driver = driver;
	}

	@FindBy(xpath=Configs.profile)
	WebElement profile;
	
	@FindBy(xpath=Configs.tweets)
	WebElement tweets;
	
	@FindBy(xpath=Configs.following)
	WebElement following;
	
	public twitEditProfile gotoProfile(){
		
		profile.click();
		
		return PageFactory.initElements(driver, twitEditProfile.class);
	}
	
	public void gotoTweets(){
		
		tweets.click();
	}
	
	public void gotoFollowing(){
		
		following.click();
	}
	
}
