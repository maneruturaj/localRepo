package Selenium_121;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity Software Class\\Chromedrivers\\chromedriver_win32\\chromedriver.exe");	
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver =new ChromeDriver(ops);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f, new File("G:\\Velocity Software Class\\screenshot_automation\\rokkybhai.jpg"));
		
	}
}
