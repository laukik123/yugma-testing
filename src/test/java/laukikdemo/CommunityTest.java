package laukikdemo;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pageObjects.android.Community;
import pageObjects.android.HomeScreen;
import pageObjects.android.StartPage;

public class CommunityTest extends BaseTest{
	
	@Test(priority=1)
	public void showPosts() throws InterruptedException {
		System.out.println("Running showPosts");
		HomeScreen homeScreen = new HomeScreen(driver);
		StartPage startPage = new StartPage(driver);
		startPage.login();
		homeScreen.openCommunity();
		//assert posts are shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
//		homeScreen.backToHomescreen();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	
	@Test(priority=2)
	public void comment() throws InterruptedException {
		System.out.println("Running commentOnPost");
		Community community = new Community(driver);
		HomeScreen homeScreen = new HomeScreen(driver);
		homeScreen.openCommunity();
		community.commentOnPost();
//		homeScreen.backToHomescreen();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=4)
	public void joinGroupAndPost() throws InterruptedException {
		System.out.println("Running joinGroupAndPost");
		Community community = new Community(driver);
		HomeScreen homeScreen = new HomeScreen(driver);
		homeScreen.openCommunity();
		community.joinGroup();
		community.post();
//		homeScreen.backToHomescreen();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void showGroupsPosts() throws InterruptedException {
		System.out.println("runnning showGroupsPosts");
		Community community = new Community(driver);
		HomeScreen homeScreen = new HomeScreen(driver);
		homeScreen.openCommunity();
		community.showGroups();
		//assert groups are shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
		
		//check group posts shown
		community.openGroup();
		//assert group posts are shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);		
//		homeScreen.backToHomescreen();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}
}
