package pageObjects.android;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidActions;

public class HomeScreen {
	AndroidDriver driver;
		
	public HomeScreen(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Yugma BizShorts\"]")
	WebElement bizShortsButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Placements\"]")
	WebElement placementsButton;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")
	WebElement newsCard;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Community\"]")
	WebElement communityButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Mentorship\"]")
	WebElement mentorshipButton;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[4]")
	WebElement fourthIcon;
	
	
	public void openBizshorts() {
		bizShortsButton.click();
	}
	
	public void openPlacements() {
		placementsButton.click();
	}
	
	public void openCommunity() {
		communityButton.click();
	}
	
	public void openMentorShip() throws InterruptedException {
		AndroidActions actions = new AndroidActions(driver);
		actions.swipeAction(communityButton, "left");
		Thread.sleep(2000);
//		mentorshipButton.click();
		
	}

}
