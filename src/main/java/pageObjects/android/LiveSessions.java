package pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LiveSessions {
AndroidDriver driver;
	
	public LiveSessions(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
	WebElement liveSessionCard;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Go To Content\"]")
	WebElement goToContentButton;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")
	WebElement module;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup")
	WebElement lesson;
	
	public void openLiveSessionCard() {
		liveSessionCard.click();
	}
	
	public void goToContent() {
		goToContentButton.click();
	}
	
	public void openModule() {
		module.click();
	}
	
	public void openLesson() {
		lesson.click();
	}
}
