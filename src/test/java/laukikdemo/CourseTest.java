package laukikdemo;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.android.Courses;
import pageObjects.android.StartPage;

public class CourseTest extends BaseTest {
	
	@BeforeMethod(alwaysRun = true)
	public void showCourses() {
		StartPage startPage = new StartPage(driver);
		Courses courses = new Courses(driver);
		
		startPage.selectwhileUsingTheAppPermission();
		startPage.selectwhileUsingTheAppPermission();
		startPage.allowButtonClick();
//		startPage.updateIgnore();
		startPage.continueWithEmail();
		startPage.login();
		
		courses.coursesOpen();
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
		
		}
	
		@Test
		public void playCourse() {
			Courses courses = new Courses(driver);
			courses.courseCardOpen();
			courses.watchNow();
			AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View")).size()>0);

		}
		
//		@Test
//		public void checkFilters() {
//			Courses courses = new Courses(driver);
//			courses.coursesFilter();
//			AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@text=\"Course\"])")).size()>0);
//			
//			courses.liveSessionFilter();
//			AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@text=\"Live Webinars\"])")).size()>0);
//
//			courses.placementPrepFilter();
//			AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.view.ViewGroup/android.widget.TextView[@text=\"Placement Prep\"])")).size()>0);
//
//		}
	
	
}






//android.view.ViewGroup[@resource-id="RouteScreen: 0"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup
//android.view.ViewGroup[@resource-id="RouteScreen: 0"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup



