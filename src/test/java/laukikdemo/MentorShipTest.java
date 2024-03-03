package laukikdemo;

import org.testng.annotations.Test;

import pageObjects.android.HomeScreen;
import pageObjects.android.StartPage;

public class MentorShipTest extends BaseTest {
	
	
	
	@Test
	public void openMentorship() throws InterruptedException {
		HomeScreen homeScreen= new HomeScreen(driver);	
		StartPage startPage = new StartPage(driver);
		startPage.selectwhileUsingTheAppPermission();
		startPage.selectwhileUsingTheAppPermission();
		startPage.allowButtonClick();
//		startPage.updateIgnore();
		startPage.continueWithEmail();
		startPage.login();
		
		homeScreen.openMentorShip();
	}
}
