package laukikdemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	@BeforeClass(alwaysRun = true)
	public void ConfigureAppium() throws MalformedURLException {
//		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Laukik\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		
//		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setDeviceName("SM_G781B");
		options.setApp("D:\\FCRIT\\vMentor\\YugmaApp\\android\\app\\build\\outputs\\apk\\release\\app-release.apk");
				
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
//	@AfterClass(alwaysRun = true)
	public void TearDown() {
		driver.quit();
		service.stop();
	}
}
