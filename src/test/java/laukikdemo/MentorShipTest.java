package laukikdemo;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.android.HomeScreen;
import pageObjects.android.Mentorship;
import pageObjects.android.StartPage;
import utils.AndroidActions;

public class MentorShipTest extends BaseTest {
	

	@Test(priority=1)
	public void openMentorship() throws InterruptedException {
		System.out.println("running openMentorship");
		HomeScreen homeScreen= new HomeScreen(driver);	
		StartPage startPage = new StartPage(driver);
		
		startPage.login();
		homeScreen.openMentorship();
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")).size()>0);
//		homeScreen.backToHomescreen();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	
	@Test(priority=2)
	public void openMentor() throws InterruptedException {
		System.out.println("Running openMentor");
		HomeScreen homeScreen= new HomeScreen(driver);	
		Mentorship mentorship = new Mentorship(driver);
		homeScreen.openMentorship();
		mentorship.openMentor();
		//assert image and description shown
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).size()>0);
//		homeScreen.backToHomescreen();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void bookASlot() throws InterruptedException {
		System.out.println("Running bookASlot");
		HomeScreen homeScreen= new HomeScreen(driver);	
		Mentorship mentorship = new Mentorship(driver);
		homeScreen.openMentorship();
		mentorship.bookASlot();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	
}
