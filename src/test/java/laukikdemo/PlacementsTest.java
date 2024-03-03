package laukikdemo;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.android.HomeScreen;
import pageObjects.android.Placements;
import pageObjects.android.StartPage;

public class PlacementsTest extends BaseTest{
	
	@BeforeMethod
	public void showPlacementsTest() {
		StartPage startPage = new StartPage(driver);
		HomeScreen homeScreen = new HomeScreen(driver);
		
		startPage.login();
		homeScreen.openPlacements();
		//check if jobcards are displayed
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")).size()>0);
		
	}
	
	@Test
	public void openJobTest() {
		Placements placements = new Placements(driver);
		placements.openJob();
		placements.jobClickWorking();
	}
	
	
}
