package laukikdemo;
import org.testng.*;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.android.Courses;
import pageObjects.android.HomeScreen;
import pageObjects.android.StartPage;
import org.testng.*;
public class CourseTest extends BaseTest {
	
		@Test(priority=1, groups= {"Smoke"})
		public void showCourses() throws InterruptedException {
			System.out.println("Runnning showCourses");
			StartPage startPage = new StartPage(driver);
			Courses courses = new Courses(driver);
			HomeScreen homeScreen= new HomeScreen(driver);	
			startPage.login();
			courses.coursesOpen();
			Thread.sleep(2000);
			AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
//			homeScreen.backToHomescreen();
			Thread.sleep(2000);
//			driver.navigate().back();
			}
	
		@Test(priority=2, groups= {"Smoke"})
		public void playCourse() throws InterruptedException {
			System.out.println("Runnning playCourse");
			Courses courses = new Courses(driver);
			HomeScreen homeScreen= new HomeScreen(driver);	
//			courses.coursesOpen();
			courses.courseCardOpen();
			courses.watchNow();
			Thread.sleep(2000);
			AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View")).size()>0);
//			homeScreen.backToHomescreen();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
//			driver.navigate().back();
		}
		
		@Test(priority=3, groups= {"Smoke"})
		public void checkFilters() throws InterruptedException {
			System.out.println("Runnning checkFilters");
			Courses courses = new Courses(driver);
			HomeScreen homeScreen= new HomeScreen(driver);	
//			courses.coursesOpen();
			Thread.sleep(2000);
			courses.coursesFilter();
			Thread.sleep(2000);
			AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@text=\"Course\"])")).size()>0);
			
			courses.liveSessionFilter();
			Thread.sleep(2000);
			AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@text=\"Live Webinars\"])")).size()>0);
			
			courses.placementPrepFilter();
			Thread.sleep(2000);
			AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@text=\"Placement Prep\"])")).size()>0);
//			homeScreen.backToHomescreen();
			Thread.sleep(2000);
			driver.navigate().back();
		}
	
	
}






//android.view.ViewGroup[@resource-id="RouteScreen: 0"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup
//android.view.ViewGroup[@resource-id="RouteScreen: 0"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup



