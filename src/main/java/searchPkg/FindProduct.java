package searchPkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.manager.SeleniumManagerOutput.Result;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindProduct {

//	Actions action;
//	public FindProduct(WebDriver driver)
//	{
//		action = new Actions(driver);
//
//	}
//	public void pressEnter() {
//		action.sendKeys(Keys.ENTER).build().perform();
//	}
//	public void scrollDown(WebDriver driver) {
//		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
//		jsexe.executeScript("windows.scrollBy(0,2000)", "");
//
//	}
//	public void performMouseOver(WebElement element) {
//		action.moveToElement(element).build().perform();
//	}
//	public void clickUsingJSExecutor(WebElement element, WebDriver driver) {
//		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
//		jsexe.executeScript("arguments[0].click();",element);
//	}
	public static void main(String[] args) {

		//Result driverpath = SeleniumManager.getInstance().getDriverPath("gecko");		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		//FindProduct objSearch = new FindProduct(driver);
		driver.get("https://www.saucedemo.com/v1/inventory.html");	
		
		WebElement btnClick = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
		btnClick.click();
		
				

	}

}
