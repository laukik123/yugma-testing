//package testUtils;
//
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//import java.util.Properties;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;
//import org.rahulshettyacademy.pageObjects.android.FormPage;
//import org.rahulshettyacademy.utils.AppiumUtils;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//
//import com.google.common.collect.ImmutableMap;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
//import Constants;
//public class AndroidBaseTest extends AppiumUtils{
//
//	public AndroidDriver driver;
//	public AppiumDriverLocalService service;
//	public FormPage formPage;
//	
//	
//	public Constants constants = new Constants();
//	
//	@BeforeClass(alwaysRun=true)
//	public void ConfigureAppium() throws IOException
//	{
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//rahulshettyacademy//resources//data.properties");
//		String ipAddress = System.getProperty("ipAddress")!=null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
//		System.out.println(ipAddress);
//		prop.load(fis);
//		//String ipAddress = prop.getProperty("ipAddress");
//		String port = prop.getProperty("port");
//			
////		service = startAppiumServer(ipAddress,Integer.parseInt(port));
//		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Laukik\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//								
//			UiAutomator2Options options = new UiAutomator2Options();
////			options.setDeviceName(prop.getProperty("AndroidDeviceNames")); //emulator
//			options.setDeviceName(constants.deviceName);// real device		
//			options.setChromedriverExecutable("//Users//rahulshetty//documents//chromedriver 11");
//			options.setApp(constants.appPath);
//			
//			 driver = new AndroidDriver(service.getUrl(), options);
//			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			 formPage= new FormPage(driver);
//	}
//	
//	
//
//
//	
//	@AfterClass(alwaysRun=true)
//	public void tearDown()
//	{
//		driver.quit();
//        service.stop();
//		}
//	
//}
