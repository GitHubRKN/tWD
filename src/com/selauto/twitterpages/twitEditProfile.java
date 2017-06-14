package com.selauto.twitterpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selauto.config.Configs;

public class twitEditProfile {

	@FindBy(xpath=Configs.editprofile)
	WebElement editprofile;
	
	@FindBy(xpath=Configs.image)
	WebElement image;
	
	@FindBy(xpath=Configs.upload)
	WebElement upload;
	
	@FindBy(xpath=Configs.cancelupload)
	WebElement cancelupload;
	public void editProfile(){
		
		editprofile.click();
		
	}
	public void changeImage(){
		
		image.click();
		upload.click();
	}
	
	public void cancelImage(){
		cancelupload.click();
		
	}
}
