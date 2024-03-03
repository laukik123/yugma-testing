package pageObjects.android;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StartPage {
	
	AndroidDriver driver;
	
	public StartPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement whileUsingTheAppPermissionButton;
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement allowButton;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement updateIgnoreButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Continue with Email']")
	private WebElement continueWithEmailButton;
	
	@AndroidFindBy(xpath="(//android.widget.EditText[@text=\" \"])[1]")
	private WebElement emailTextbox;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement passwordTextbox;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Login\"]")
	private WebElement loginButton;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement toast;
	
	
	
	public void selectwhileUsingTheAppPermission() {
		whileUsingTheAppPermissionButton.click();
	}
	
	public void allowButtonClick() {
		allowButton.click();
	}
	
	public void updateIgnore() {
		updateIgnoreButton.click();
	}
	
	public void continueWithEmail() {
		continueWithEmailButton.click();
	}
	
	public void login() {
		selectwhileUsingTheAppPermission();
		selectwhileUsingTheAppPermission();
		allowButtonClick();
//		startPage.updateIgnore();
		continueWithEmail();
		emailTextbox.sendKeys("laukik@vmentor.ai");
		passwordTextbox.sendKeys("laukikvmentor123");
		loginButton.click();
	}
	
	
	
	//not using because the test was failing
	public void confirmLogin() {
		AssertJUnit.assertEquals(toast.getText(),"Successfully logged in");
	}
	
}
