package pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidActions;

public class Community {
	AndroidDriver driver;
	
	public Community(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")
	WebElement postCard;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"tab_0\"]")
	WebElement postTab;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"GROUP\"]")
	WebElement groupTab;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")
	WebElement groupCard;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@text=\"JOIN\"])")
	WebElement joinButton;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	WebElement commentPost;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"SEND\"]")
	WebElement sendButton;	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Enter comment\"]")
	WebElement commentBox;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"RouteScreen: 2\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button/android.view.ViewGroup")
	WebElement searchButton;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Search by post, group, tag ...\"]")
	WebElement searchBar;
	
	@AndroidFindBy(xpath="(//android.widget.Button[@content-desc=\"Post\"])[2]")
	WebElement postButton;
	
	@AndroidFindBy(xpath="//android.widget.ImageView")
	WebElement dropdown;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView[@content-desc=\"undefined flatlist\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	WebElement groupName;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Type something...\"]")
	WebElement postTextArea;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@text=\"POST\"])[2]")
	WebElement post;
	
	public void openPost() {
		postCard.click();
	}
	
	public void showGroups() {
		groupTab.click();
	}
	
	public void joinGroup() throws InterruptedException {
		groupTab.click();
		searchButton.click();
		searchBar.sendKeys("Placement preparations");
		joinButton.click();
		Thread.sleep(1000);
		AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.widget.TextView[@text=\"JOIN\"])")).size()<1);
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	public void openGroup() {
		groupCard.click();
	}
	
	public void commentOnPost() throws InterruptedException {
		searchButton.click();
		searchBar.sendKeys("Campus placements");
		commentPost.click();
		String comment = "Test comment";
		commentBox.sendKeys(comment);
		sendButton.click();
		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")).getText());
		AssertJUnit.assertEquals(comment, driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")).getText());
		
	}
	
	public void post() throws InterruptedException {
		postTab.click();
		postButton.click();
		dropdown.click();
		groupName.click();
		String postText = "Test post";
		postTextArea.sendKeys(postText);
		post.click();
		driver.navigate().back();
		Thread.sleep(1000);
		groupTab.click();
		Thread.sleep(1000);
		postTab.click();                                
//		System.out.println(driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")).getText());
		AssertJUnit.assertEquals(postText, driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")).getText());
		
		
		
		
	}
}
