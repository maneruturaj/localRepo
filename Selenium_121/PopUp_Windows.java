package Selenium_121;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp_Windows
{
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Firefox driver\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize(); //to click window maximize
		
		Thread.sleep(2000);
		
		//code to scroll to HTML table on the main page
		
		JavascriptExecutor je =(JavascriptExecutor)driver;
		
		WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']")); //
		
		je.executeScript("arguments[0].scrollIntoView(true);", table);
		
		Thread.sleep(2000);
		
		//HTML table cells
		
		List<WebElement> cells= driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		int size = cells.size();
		System.out.println("Size of List"+size); // size of table
		
		//table rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr")); // store the all rows from tables no of rows=7
		
		for (int j=2;j<=rows.size();j++) //length of row j=2-7
			{
				List<WebElement> cells1 = driver.findElements(By.xpath("//table[@id='customers']//td")); //cells1 size =18
		
				for(int i=0;i<cells1.size();i++) // size 18 starting from (0-17)
					{
			
						String S1 =  cells1.get(i).getText();             ///cells.get(...); for an  index value and .getText(); to get the data from that index value
						System.out.print(S1 +" , ");
					}
					
				System.out.println();
			}
	
		
	}

}

