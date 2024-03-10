package laukikdemo;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import laukikdemo.BaseTest;
import pageObjects.android.Courses;
import pageObjects.android.HomeScreen;
import pageObjects.android.LiveSessions;
import pageObjects.android.StartPage;
import org.testng.*;
public class LiveSessionsTest extends  BaseTest{
	
	@Test(priority=1)
	public void openLiveSessions() throws InterruptedException {
		System.out.println("Runnning openLiveSessions");
		StartPage startPage = new StartPage(driver);
		Courses courses = new Courses(driver);
		HomeScreen homeScreen= new HomeScreen(driver);	
		startPage.login();
		courses.coursesOpen();
		Thread.sleep(2000);
		courses.liveSessionFilter();
		courses.liveSessionFilter();
		Thread.sleep(2000);
		//assert live sessions cards are shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).size()>0);
			
	}
	
	@Test(priority=2)
	public void openLiveSessionCard() throws InterruptedException {
		System.out.println("Runnning openLiveSessionCard");
		LiveSessions ls=new LiveSessions(driver);
		ls.openLiveSessionCard();
		Thread.sleep(5000);
		//assert image and title shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ImageView")).size()>0);
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")).size()>0);
		
	}
	
	@Test(priority=3)
	public void playVideos() throws InterruptedException {
		System.out.println("Runnning playVideos");
		LiveSessions ls=new LiveSessions(driver);
		ls.goToContent();
		ls.openModule();
		ls.openLesson();
		Thread.sleep(5000);
		//assert videoplayer is shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View")).size()>0);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
}
