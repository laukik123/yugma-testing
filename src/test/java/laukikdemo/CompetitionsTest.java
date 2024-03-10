package laukikdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import pageObjects.android.Competitions;
import pageObjects.android.HomeScreen;
import pageObjects.android.StartPage;
import utils.AndroidActions;
import org.testng.*;
public class CompetitionsTest extends BaseTest{
	
	@Test(priority=1)
	public void scrollToCompetition() throws InterruptedException {
		System.out.println("Running scrollToCompetition");
		AndroidActions actions = new AndroidActions(driver);
		StartPage startPage = new StartPage(driver);
		HomeScreen homeScreen = new HomeScreen(driver);
		startPage.login();
//		System.out.println("waiting started");
		Thread.sleep(10000);
//		System.out.println("waiting for 5 secs fininshed");
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 500,
			    "direction", "down",
			    "percent", 9.0
			));
		Thread.sleep(2000);
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView")).size()>0);
		
	}
	
	@Test(priority=2)
	public void openCompetition() throws InterruptedException {
		System.out.println("Running openCompetition");
		Competitions competitions = new Competitions(driver);
		competitions.openCompetition();
		Thread.sleep(3000);
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ImageView")).size()>0);		
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]")).size()>0);
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
}
