package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.selauto.twitterpages.twitEditProfile;
import com.selauto.twitterpages.twitLoginPage;
import com.selauto.twitterpages.twiterLandingPage;

public class testtwitLoginPage {
	

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://twitter.com");
		twitLoginPage lp = PageFactory.initElements(driver, twitLoginPage.class);

		twiterLandingPage landingpage =lp.doLogin("n.vasu@hotmail.com", "Twitter23pwd");
		twitEditProfile edit=landingpage.gotoProfile();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		edit.editProfile();
		driver.manage().window().maximize();
		edit.changeImage();
		edit.cancelImage();
		
	}
	
}