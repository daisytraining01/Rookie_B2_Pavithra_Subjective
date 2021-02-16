package individual;

import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Questiontwo{
    
    public static void main (String[] args) throws Throwable{
        
    	File file = new File("drivers/chromedriver_new.exe");
    	String filePath = file.getAbsolutePath();
    	System.out.println(filePath);
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("start-maximized");
    	WebDriver driver =  new ChromeDriver(chromeOptions);
        driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
       
 boolean cricketChckBoxFlag = driver.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).isSelected();
		
		if(!cricketChckBoxFlag) {
			driver.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();
			Thread.sleep(5000);
			
			System.out.println("The Belarus check box is clicked: "+driver.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).isSelected());
		}
       
          
		driver.close();
       
		 
}
   
 
}