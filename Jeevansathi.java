import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jeevansathi 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity Software Class\\Chromedrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jeevansathi.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement login = driver.findElement(By.xpath("//div[@class='fl hpwid3 lh63 txtc disp-tbl cursp']"));
		//login.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mane.ruturaj4@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mh10@u1140");
		driver.findElement(By.xpath("//div[@class=' tw-px-5 tw-relative']")).click();
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement Element =driver.findElement(By.xpath("f14 color7 opa50 icons1 myjs_arow1"));
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 Thread.sleep(3000);
		 Element.click();
	}

}
