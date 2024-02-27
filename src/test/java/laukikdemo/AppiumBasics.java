package laukikdemo;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AppiumBasics extends BaseTest {
	
	@Test
	public void AppiumTest()throws MalformedURLException{
		
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		
		
	}
	
}
