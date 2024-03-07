package laukikdemo;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import pageObjects.android.Bizshorts;
import pageObjects.android.HomeScreen;
import pageObjects.android.StartPage;

public class BizshortsTest extends BaseTest {

	@Test(priority=1)
	public void openBizshorts() throws InterruptedException, MalformedURLException {
		System.out.println("Running openBizshorts");
		HomeScreen homeScreen= new HomeScreen(driver);	
		StartPage startPage = new StartPage(driver);
		startPage.login();
		homeScreen.openBizshorts();
		Thread.sleep(2000);
		//assert if the size of array of newscards is greater than 0 that means news are being displayed
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
//		homeScreen.backToHomescreen();
		Thread.sleep(2000);
		driver.navigate().back();
	}
		
		@Test(priority=2)
		public void openNews() throws InterruptedException {
			System.out.println("Running openNews");
			HomeScreen homeScreen= new HomeScreen(driver);	
			Bizshorts bizshorts=new Bizshorts(driver);
			//open bizshorts
			homeScreen.openBizshorts();
			bizshorts.openNews();
			//news title, description is shown
			AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.TextView")).size()>4);
//			homeScreen.backToHomescreen();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
		}
		
		@Test(priority=3)
		public void bookmarkTest() throws InterruptedException {
			System.out.println("runnning bookmarkTest");
			HomeScreen homeScreen= new HomeScreen(driver);	
			Bizshorts bizshorts=new Bizshorts(driver);
			homeScreen.openBizshorts();
			bizshorts.bookmark();
//			String title1= driver.findElement(By.xpath("//android.widget.TextView[@index=1]")).getText();
//			System.out.println(title1);
			bizshorts.topBookmark();
//			bizshorts.openBookmarked();
//			System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text=\"No bookmarked news yet. Bookmark news by clicking on the bookmark\"]")).getText());
			AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.TextView[@text=\"No bookmarked news yet. Bookmark news by clicking on the bookmark\"]")).size()<1);
//			homeScreen.backToHomescreen();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
		}
		}
				

//

