package searchPkg;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.manager.SeleniumManagerOutput.Result;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumExample {

	public static void main(String[] args) {

		//ChromeOptions options = new ChromeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		InternetExplorerOptions options = new InternetExplorerOptions();

		Result path=SeleniumManager.getInstance().getDriverPath(options, false);

		System.out.println(path);

		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com");
		
		

	}

}
