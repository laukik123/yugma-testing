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

//	@BeforeMethod
//	public void preSetup() throws IOException, InterruptedException {
////		Activity activity = new Activity("com.yugma.app", "com.yugma.app.MainActivity");
////		start the test from homescreen
////		((JavascriptExecutor)driver).executeScript("mobile: startActivity", ImmutableMap.of("intent", "com.yugma.app/com.yugma.app.MainActivity"));
//		String adbCommand = String.format("adb shell am start -n %s/%s", "com.yugma.app", "com.yugma.app.MainActivity");
//		Runtime.getRuntime().exec(adbCommand);
//		Thread.sleep(3000);
//	}
	

	@BeforeMethod
	public void openBizshorts() throws InterruptedException, MalformedURLException {
		HomeScreen homeScreen= new HomeScreen(driver);	
		StartPage startPage = new StartPage(driver);
		startPage.selectwhileUsingTheAppPermission();
		startPage.selectwhileUsingTheAppPermission();
		startPage.allowButtonClick();
		startPage.updateIgnore();
		startPage.continueWithEmail();
		startPage.login();
		homeScreen.openBizshorts();
		Thread.sleep(2000);
		//assert if the size of array of newscards is greater than 0 that means news are being displayed
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
	}
		
//		@Test
//		public void openNews() {
//			Bizshorts bizshorts=new Bizshorts(driver);
//			//open bizshorts
//			bizshorts.openNews();
//			//news title, description is shown
//			AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.TextView")).size()>4);
//		}
		
		@Test
		public void bookmarkTest() {
			Bizshorts bizshorts=new Bizshorts(driver);
			bizshorts.bookmark();
//			String title1= driver.findElement(By.xpath("//android.widget.TextView[@index=1]")).getText();
//			System.out.println(title1);
			bizshorts.topBookmark();
//			bizshorts.openBookmarked();
//			System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text=\"No bookmarked news yet. Bookmark news by clicking on the bookmark\"]")).getText());
			AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.TextView[@text=\"No bookmarked news yet. Bookmark news by clicking on the bookmark\"]")).size()<1);
		
		}
		}
				

//

