package pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidActions;

public class Mentorship {
	AndroidDriver driver;
	public Mentorship(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"See all\"]")
	WebElement searchButton;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	WebElement mentorCard;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Book A Slot\"]")
	WebElement bookASlot;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"RouteScreen: 1\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.ImageView")
	WebElement nextMonth;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"29\"]")
	WebElement date29;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Time Slot\"]")
	WebElement timeSlotButton;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView[@content-desc=\"undefined flatlist\"]/android.view.ViewGroup/android.view.ViewGroup[1]")
	WebElement timeSlot;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Book\"]")
	WebElement bookButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Proceed To Pay\"]")
	WebElement proceedButton;
	
	@AndroidFindBy(xpath="//android.webkit.WebView[@content-desc=\"primary_webview\"]")
	WebElement razorPayScreen;
	
	public void openMentor() {
		mentorCard.click();
	}
	
	
	
	
	public void bookASlot() throws InterruptedException {
		searchButton.click();
		searchButton.sendKeys("Milan");
		Thread.sleep(3000);
		mentorCard.click();
		mentorCard.click();
		Thread.sleep(1000);
		bookASlot.click();
		timeSlotButton.click();
		Thread.sleep(1000);
		timeSlot.click();
		bookButton.click();
		proceedButton.click();
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.webkit.WebView[@content-desc=\"primary_webview\"]")).size()>0);
	}
	
}
