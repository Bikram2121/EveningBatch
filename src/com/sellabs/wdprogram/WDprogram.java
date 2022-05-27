/**
 * 
 */
package com.sellabs.wdprogram;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author Sipun
 *
 */
public class WDprogram {

	WebDriver driver ;
	By downloadLink = By.linkText("Downloads");
	public void wd()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		driver.findElement(downloadLink).click();
		
		String expTitle = "downloads selenium";
		String actualTitle = driver.getTitle().replace("| ", "").toLowerCase();
		System.out.println(actualTitle);
		
		if (expTitle.equals(actualTitle)) {
			System.out.println("The Titles match");
		} else 
		{
			System.out.println("Title doesn't match");
		}	
		
		
		//driver.navigate().back();
		driver.quit();
		
		
	}
	
	public static void main(String[] args) 
	{
		WDprogram wdp = new WDprogram();
		wdp.wd();
		
		
	}
}
