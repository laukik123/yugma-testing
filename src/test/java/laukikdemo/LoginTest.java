package laukikdemo;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.android.StartPage;


public class LoginTest extends BaseTest {
	
	@Test
	public void loginTest()throws MalformedURLException, InterruptedException{
		StartPage startPage = new StartPage(driver);
		
		startPage.selectwhileUsingTheAppPermission();
		startPage.selectwhileUsingTheAppPermission();
		startPage.allowButtonClick();
		startPage.updateIgnore();
		startPage.continueWithEmail();
		startPage.login();
//		Thread.sleep(2000);
//		startPage.confirmLogin();
	}
	
}
