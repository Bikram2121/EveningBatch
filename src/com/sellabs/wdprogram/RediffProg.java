/**
 * 
 */
package com.sellabs.wdprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * @author Vikram
 *
 */
public class RediffProg {

	WebDriver driver ;
	By downloadLink = By.linkText("Downloads");
	By idName = By.id("srchword");
	String url = "https://www.rediff.com/";
	public void wd1()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "/geckodriver/geckodriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement srchField = driver.findElement(idName);
		srchField.sendKeys("mail");
		srchField.submit();
		
		
		//driver.navigate().back();
		//driver.quit();
}
	
	public static void main(String[] args) {
		RediffProg rp = new RediffProg();
		rp.wd1();
	}
}