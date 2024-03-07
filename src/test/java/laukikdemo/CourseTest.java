package laukikdemo;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.android.Courses;
import pageObjects.android.HomeScreen;
import pageObjects.android.StartPage;

public class CourseTest extends BaseTest {
	
		@Test(priority=1)
		public void showCourses() throws InterruptedException {
			System.out.println("runnning showCourses");
			StartPage startPage = new StartPage(driver);
			Courses courses = new Courses(driver);
			HomeScreen homeScreen= new HomeScreen(driver);	
			startPage.login();
			courses.coursesOpen();
			AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
//			homeScreen.backToHomescreen();
			Thread.sleep(2000);
			driver.navigate().back();
			}
	
		@Test(priority=2)
		public void playCourse() throws InterruptedException {
			System.out.println("runnning playCourse");
			Courses courses = new Courses(driver);
			HomeScreen homeScreen= new HomeScreen(driver);	
			courses.coursesOpen();
			courses.courseCardOpen();
			courses.watchNow();
			AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View")).size()>0);
//			homeScreen.backToHomescreen();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
		}
		
		@Test(priority=3)
		public void checkFilters() throws InterruptedException {
			System.out.println("runnning checkFilters");
			Courses courses = new Courses(driver);
			HomeScreen homeScreen= new HomeScreen(driver);	
			courses.coursesOpen();
			Thread.sleep(2000);
			courses.coursesFilter();
			AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@text=\"Course\"])")).size()>0);
			
			courses.liveSessionFilter();
			AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@text=\"Live Webinars\"])")).size()>0);

			courses.placementPrepFilter();
			AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@text=\"Placement Prep\"])")).size()>0);
//			homeScreen.backToHomescreen();
			Thread.sleep(2000);
			driver.navigate().back();
		}
	
	
}






//android.view.ViewGroup[@resource-id="RouteScreen: 0"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup
//android.view.ViewGroup[@resource-id="RouteScreen: 0"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup



