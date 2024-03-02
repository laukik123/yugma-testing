package pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Bizshorts {
	AndroidDriver driver;
	
	public Bizshorts(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	WebElement newsCard;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button[2]/android.view.ViewGroup")
	WebElement bookmarkButton;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"RouteScreen: 0\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button[2]/android.view.ViewGroup")
	WebElement topBookmarkButton;
	
//	@AndroidFindBy(xpath="driver.findElement(By.xpath(\"(//android.widget.TextView[@index=2])\"))")
//	WebElement bookmarked;
	
	
	
	
	public void openNews() {
		newsCard.click();
	}
	
	public void bookmark() {
		bookmarkButton.click();
	}
	
	public void topBookmark() {
		topBookmarkButton.click();
	}
	
//	public void openBookmarked() {
//		bookmarked.click();
//	}
	
}
