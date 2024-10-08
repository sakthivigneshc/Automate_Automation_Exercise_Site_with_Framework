package commonActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonTestFunctionalities {
	public static Properties properties;
	public static WebDriver driver;
	
	
	static String expectedHomePageTitle = System.getProperty("homePageTitle");
	
	public static Properties loadPropertyFile() throws IOException {
		FileInputStream fileinputStream =  new FileInputStream("C:\\Users\\2252407\\eclipse-workspace\\Automation_Exercise_Site\\configFile\\config.properties");
		properties = new Properties();
		properties.load(fileinputStream);
		return properties;
	}
	

	@BeforeSuite
	public static void launchBrowser() throws IOException {
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url =  properties.getProperty("url");
//		System.out.println(properties.getProperty("emailAddress"));
		if(browser.equalsIgnoreCase("chrome")) {
//				setDriver(new ChromeDriver());
			driver= new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("edge")){
//			setDriver(new EdgeDriver());
			driver= new EdgeDriver();

		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	
	
	
	@AfterSuite
	public void tearDown() {
//		driver.quit();
	}

//	public static WebDriver getDriver() {
//		return driver;
//	}
//
//	public static void setDriver(WebDriver driver) {
//		files.driver = driver;
//	}
	
}
