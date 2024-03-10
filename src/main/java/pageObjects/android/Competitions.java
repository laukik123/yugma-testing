package pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Competitions {
AndroidDriver driver;
	
	public Competitions(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"tab_0\"]")
	WebElement postTab;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"ILEAD- PGDM (Operations & Supply Chain Management\"]")
	WebElement competition;
	
	
	public void openCompetition() {
		competition.click();
	}
}
