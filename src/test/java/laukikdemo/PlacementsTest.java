package laukikdemo;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import pageObjects.android.HomeScreen;
import pageObjects.android.Placements;
import pageObjects.android.StartPage;

public class PlacementsTest extends BaseTest{
	
	com.aventstack.extentreports.ExtentReports extent;
	
	@BeforeTest
	public  void ExtentReports()
	{
		
	//	ExtentReports , ExtentSparkReporter
		String path =System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rahul Shetty");
//		return extent;
		
	}
	
	@Test(priority=1)
	public void showPlacementsTest() throws InterruptedException {
		extent.createTest("demo test");
		System.out.println("runnning showPlacementsTest");
		StartPage startPage = new StartPage(driver);
		HomeScreen homeScreen = new HomeScreen(driver);
		
		startPage.login();
		homeScreen.openPlacements();
		//check if jobcards are displayed
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
//		homeScreen.backToHomescreen();
		Thread.sleep(2000);
		driver.navigate().back();
		extent.flush();
	}
	
//	@Test(priority=2)
//	public void openJobTest() throws InterruptedException {
//		System.out.println("runnning openJobTest");
//		Placements placements = new Placements(driver);
//		HomeScreen homeScreen = new HomeScreen(driver);
//		homeScreen.openPlacements();
//		Thread.sleep(1000);
//		placements.openJob();
//		placements.jobClickWorking();
////		homeScreen.backToHomescreen();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.navigate().back();
//	}
	
	
	
//	@AfterMethod
//	public void backToHomescreen(){
//		HomeScreen homeScreen = new HomeScreen(driver);
//		homeScreen.backToHomescreen();
//	}
	
}
