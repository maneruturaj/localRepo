package Selenium_Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Method {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity Software Class\\Chromedrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String baseURL= "https://www.amazon.in";
		driver.get(baseURL);
		
		Select dropCountry=new Select(driver.findElement(By.tagName("Select")));
		dropCountry.selectByVisibleText("Baby");


	}

}
