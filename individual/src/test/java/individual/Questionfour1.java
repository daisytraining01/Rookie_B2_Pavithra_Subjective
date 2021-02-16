package individual;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Questionfour1 {
	public static void main (String[] args) throws InterruptedException{
		
	File file = new File("drivers/chromedriver_new.exe");
	String filePath = file.getAbsolutePath();
	System.out.println(filePath);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("start-maximized");
	WebDriver driver =  new ChromeDriver(chromeOptions);

	
		
	driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).clear();
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Alert alert=driver.switchTo().alert();
	String alertText=alert.getText();
	
	System.out.println(alertText);
	alert.accept();
	System.out.println("Alert accepted successfully");
	driver.close();
	
	try {
		float c=5/0;
		System.out.println(c);
		}
		catch (Exception e){
			System.out.println(e);
			
		}
		
		try {
			int array[]= {1,2,3,4}; 
			System.out.println(array[6]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	
	
	}

}