package com.crossBrowserTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class crossBrowserTestPractice {
	WebDriver driver;
	String expText = "";
	String actText, actText1, actText2;
	
	@Parameters({"bName"})
	
  @Test
  public void CrossBrowserTestResult(String bName) throws MalformedURLException, InterruptedException
  
	{
		
	if(bName.equalsIgnoreCase("chrome"))
	{
		ChromeOptions option = new ChromeOptions();
		driver =new RemoteWebDriver(new URL("http://localhost:4444"),option);
		System.out.println("Expected text is matching with actual text in Chrome browser");
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("twotabsearchtextbox")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sam");
		//Thread.sleep(2000);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		//actText = driver.findElement(By.cssSelector("span[class='a-truncate _c2xpZ_truncate_11Epi a-size-medium'] span[class='a-truncate-cut']")).getText();
		System.out.println("Test is completed with Chrome");
		}
	else if(bName.equalsIgnoreCase("firefox"))
	{
		FirefoxOptions option = new FirefoxOptions();
		driver =new RemoteWebDriver(new URL("http://localhost:4444"),option);
		System.out.println("Expected text is matching with actual text in Firefox browser");
		driver.get("https://www.amazon.in/");
		WebElement crm = driver.findElement(By.id("twotabsearchtextbox"));
		crm.click();
		crm.sendKeys("sam");
		Thread.sleep(2000);
		crm.sendKeys(Keys.ARROW_DOWN);
		crm.sendKeys(Keys.ARROW_DOWN);
		crm.sendKeys(Keys.ENTER);
		actText1 = driver.findElement(By.cssSelector("span[class='a-truncate _c2xpZ_truncate_11Epi a-size-medium'] span[class='a-truncate-cut']")).getText();
		System.out.println("Test is completed with Firefox"+actText1);
	}
	else if(bName.equalsIgnoreCase("edge"))
	{
		EdgeOptions option = new EdgeOptions();
		driver =new RemoteWebDriver(new URL("http://localhost:4444"),option);
		System.out.println("Expected text is matching with actual text in Edge browser");
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("twotabsearchtextbox")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sam");
		//Thread.sleep(2000);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		////driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		//actText2 = driver.findElement(By.cssSelector("span[class='a-truncate _c2xpZ_truncate_11Epi a-size-medium'] span[class='a-truncate-cut']")).getText();
		System.out.println("Test is completed with Edge"); 
	}
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(5000);
	//driver.get("https://www.amazon.in/");
	//driver.findElement(By.id("twotabsearchtextbox")).click();
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sam");
	//Thread.sleep(2000);
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	
	
	Thread.sleep(10000);
	//System.out.println(driver.findElement(By.cssSelector("span[class='a-truncate _c2xpZ_truncate_11Epi a-size-medium'] span[class='a-truncate-cut']")).getText());
		
	//Thread.sleep(10000);
	driver.quit();
  }

}
