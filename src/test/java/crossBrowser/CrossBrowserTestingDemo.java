package crossBrowser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v114.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.manager.SeleniumManagerOutput.Result;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingDemo {
	WebDriver driver;
	
	ChromeOptions chromeoptions = new ChromeOptions();
	FirefoxOptions firefoxoptions = new FirefoxOptions();
	InternetExplorerOptions ieoptions = new InternetExplorerOptions();

	
	//SeleniumManager path=SeleniumManager.getInstance();
	
	@Parameters("browser")
	@BeforeTest
	public void initilize(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Firefox is Launched");
			Result path=SeleniumManager.getInstance().getDriverPath(firefoxoptions, false);
			System.out.println(path);
			//driver.get("https://www.google.com");
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("chrome browser is Launched");
			Result path=SeleniumManager.getInstance().getDriverPath(chromeoptions, false);
			System.out.println(path);
			//driver.get("https://www.google.com");
		} 
		else if(browser.equalsIgnoreCase("iebrowser")) {
			driver = new EdgeDriver();
			System.out.println("Internet Explorer is Launched");
			Result path=SeleniumManager.getInstance().getDriverPath(ieoptions, false);
			System.out.println(path);
 
			//driver.get("https://www.google.com");
		} 
	}
	@Test
	public void citiLogin() {
		driver.get("https://www.citi.com");
		String actual=driver.getTitle();
		String expect ="Citi";
		AssertJUnit.assertEquals(actual.contains("Citi"), expect.contains("Citi"));
	}
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
