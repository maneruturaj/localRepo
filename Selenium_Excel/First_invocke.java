package Selenium_Excel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First_invocke {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity Software Class\\Chromedrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jeevansathi.com/");
		
		driver.manage().window().maximize();
		
		//time implicit
		
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement login = driver.findElement(By.xpath("//div[@class='fl hpwid3 lh63 txtc disp-tbl cursp']"));
		login.click();
		
		/*By username = By.id("homePageLogin");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.presenceOfElementLocated(username));
		*/
		WebElement username = driver.findElement(By.id("EmailContainer"));
		username.click();
		username.sendKeys("mane.ruturaj4@gmail.com");
		
	   driver.findElement(By.xpath("//input[@type='email']")).click();
		
		WebElement log = driver.findElement(By.xpath("//button[@id='jspcLoginLayerButton']"));
		log.click();
		

	}

}