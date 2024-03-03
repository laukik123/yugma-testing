package community;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import laukikdemo.BaseTest;
import pageObjects.android.Community;
import pageObjects.android.HomeScreen;
import pageObjects.android.StartPage;

public class communityComment extends BaseTest{
	
	@BeforeMethod
	public void showPosts() {
		System.out.println("Working starts here");
		HomeScreen homeScreen = new HomeScreen(driver);
		StartPage startPage = new StartPage(driver);
		startPage.login();
		System.out.println("login working");
		homeScreen.openCommunity();
		System.out.println("Working");
		//assert posts are shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
	}
	
	
	@Test(groups = {"community"})
	public void comment() throws InterruptedException {
		Community community = new Community(driver);
		community.commentOnPost();
	}
}
