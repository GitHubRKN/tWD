package test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.selauto.twitterpages.twitEditProfile;
import com.selauto.twitterpages.twitLoginPage;
import com.selauto.twitterpages.twiterLandingPage;

public class testtwitLoginPage {
	private WebDriver driver;
	public twiterLandingPage landingpage;

	//public static void main(String[] args) {
	
		public testtwitLoginPage(){
			driver=new FirefoxDriver();
		}
		//@BeforeMethod
		/*public void setUp(){
		
		driver.get("http://twitter.com");
		
		}*/
		@Test(priority=1)
		public void testLog(){
			driver.get("http://twitter.com");
			twitLoginPage lp = PageFactory.initElements(driver, twitLoginPage.class);
		landingpage =lp.doLogin("n.vasu@hotmail.com", "Twitter23pwd");
		//return landingpage;
		}
		@Test(priority=2)
		public void edit_Profile(){
		twitEditProfile edit=landingpage.gotoProfile();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		edit.editProfile();
		
		/*driver.manage().window().maximize();
		edit.changeImage();
		edit.cancelImage();*/
		
	}
		@AfterSuite()
		public void close(){
			driver.quit();
		}
	
}
//this is my test class--15/06/2017
