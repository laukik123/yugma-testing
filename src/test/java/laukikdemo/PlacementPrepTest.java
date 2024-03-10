package laukikdemo;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pageObjects.android.Courses;
import pageObjects.android.HomeScreen;
import pageObjects.android.LiveSessions;
import pageObjects.android.PlacementPrep;
import pageObjects.android.StartPage;
import org.testng.*;
public class PlacementPrepTest extends BaseTest{
	
	@Test(priority=1)
	public void openPlacementPrep() throws InterruptedException {
		System.out.println("Runnning openPlacementPrep");
		StartPage startPage = new StartPage(driver);
		Courses courses = new Courses(driver);
		HomeScreen homeScreen= new HomeScreen(driver);	
		startPage.login();
		courses.coursesOpen();
		Thread.sleep(2000);
		courses.placementPrepFilter();
		courses.placementPrepFilter();
		Thread.sleep(2000);
		//assert live sessions cards are shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).size()>0);
	}
	
	@Test(priority=2)
	public void openPlacementPrepCard() throws InterruptedException {
		System.out.println("Runnning openPlacementPrepCard");
		PlacementPrep pp = new PlacementPrep(driver);
		pp.openCard();
		Thread.sleep(5000);
		//assert image and title/info shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")).size()>0);	
	}
	
	@Test(priority=3)
	public void playVideo() throws InterruptedException {
		System.out.println("Runnning playVideo");
		PlacementPrep pp = new PlacementPrep(driver);
		pp.goToContent();
		Thread.sleep(5000);		
		//assert videoplayer is shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View")).size()>0);
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
}
