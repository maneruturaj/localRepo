package Selenium_121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity Software Class\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_pop.asp");
		WebElement alertbox =driver.findElement(By.xpath(""));
		

	}

}
