package individual;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Questionthree {
	public static void main(String[] args) throws InterruptedException, IOException {
		//File file = new File("drivers/chromedriver_new.exe");
		//String filePath = file.getAbsolutePath();
		//System.out.println(filePath);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		WebDriver driver =  new ChromeDriver(chromeOptions);
		driver.navigate().to("https://wordpress.com/?aff=58022&cid=8348279");
		
		
		
		  System.out.println("Products");
		  System.out.println("---------");
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/button[1]")).click(); //Clicking Sub Menu
		  Thread.sleep(3000);
		  
		  for (int k=1;k<=6;k++) {
			 
		   String Result = driver.findElement(By.xpath("//body/div[@id='lpc-header-nav']/div[1]/div[1]/div[2]/div[4]/ul[1]/li["+k+"]/a[1]")).getText();
			System.out.println(Result);
		  }
		  System.out.println();
		  System.out.println("Resources");
		  System.out.println("---------");
		  
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/button[1]")).click();
		  Thread.sleep(3000);
		  for (int p=1;p<=7;p++) {
				 
			   String Result1 = driver.findElement(By.xpath("//body/div[@id='lpc-header-nav']/div[1]/div[1]/div[2]/div[6]/ul[1]/li["+p+"]/a[1]")).getText();
				System.out.println(Result1);
			  }
		  System.out.println();
		  Thread.sleep(3000);
		  System.out.println("Features");
		  System.out.println("---------");
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/button[1]")).click();
		  for (int q=1;q<=4;q++) {
				 
			   String Result1 = driver.findElement(By.xpath("//body/div[@id='lpc-header-nav']/div[1]/div[1]/div[2]/div[5]/ul[2]/li["+q+"]/a[1]")).getText();
				System.out.println(Result1);
			  }
		
		driver.close();
		
	}

}
