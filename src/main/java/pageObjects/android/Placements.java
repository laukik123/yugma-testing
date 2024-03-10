package pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Placements {
AndroidDriver driver;
	
	public Placements(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	WebElement jobCard;

	
	public void openJob() {
		jobCard.click();
	}
	
	public void jobClickWorking() throws InterruptedException {
		Thread.sleep(2000);
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.ImageView")).size()>0);
		Thread.sleep(2000);
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.TextView[@index=1]")).size()>0);
		AssertJUnit.assertTrue(driver.findElements(By.xpath("//android.widget.TextView[@index=19]")).size()>0);
		
	}
	
	
}
