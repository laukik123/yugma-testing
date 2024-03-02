package pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Courses {
AndroidDriver driver;
	
	public Courses(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement coursesButton;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")
	WebElement courseCard;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button")
	WebElement watchNowButton;
	
	@AndroidFindBy(xpath="(//android.view.ViewGroup/android.widget.TextView[@text=\"Course\"])")
	WebElement courseTag;
	
	@AndroidFindBy(xpath="(//android.view.ViewGroup/android.widget.TextView[@text=\"Live Webinars\"])")
	WebElement webinarTag;
	
	@AndroidFindBy(xpath="(//android.view.ViewGroup/android.widget.TextView[@text=\"Placement Prep\"])")
	WebElement placementPrepTag;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Courses\"]")
	WebElement courseFilter;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Live Sessions\"]")
	WebElement liveSessionFilter;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Placement Prep\"]")
	WebElement placementPrepFilter;
	
	public void coursesOpen() {
		coursesButton.click();
	}
	
	public void courseCardOpen() {
		courseCard.click();
	}
	
	public void watchNow() {
		watchNowButton.click();
	}
	
	public void coursesFilter() {
		courseFilter.click();
	}
	
	public void liveSessionFilter() {
		liveSessionFilter.click();
	}
	
	public void placementPrepFilter() {
		placementPrepFilter.click();
	}
}
