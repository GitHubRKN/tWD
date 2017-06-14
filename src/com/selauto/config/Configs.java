package com.selauto.config;

public class Configs {
	
	//test site
	public static final String testsite = "http://twitter.com";

	//Login page
	public static final String login = "//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]";
	public static final String username=		"//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input";
	public static final String password = "//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input";
	public static final String signin = "//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]";
	
	//Landing Page
	public static final String profile = "//*[@id='page-container']/div[1]/div[1]/div/div[1]/div/a";
	public static final String tweets = "//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[1]/a/span[1]";
	public static final String following = "//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[2]/a/span[1]";
	
	//Edit Profile
	public static final String editprofile = "//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[5]/div/button";
	public static final String image = "//*[@id='page-container']/div[3]/div/div[1]/div[4]/div[1]/div[2]/div[5]/button";
	public static final String upload = "//*[@id='photo-choose-existing']/div/div/label/input";
	public static final String cancelupload = "//*[@id='choose-photo']/div/div/ul/li[5]/button";
	
			
	
	
	
	
}



