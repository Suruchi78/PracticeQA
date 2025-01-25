package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sephora {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.driver.chrome","C:\\\\\\\\Program Files\\\\\\\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.sephora.com/");
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("svg[class='css-psp8z9 eanm77i0']")).click();
		
		driver.findElement(By.id("signin_username")).sendKeys("Suruchi1");
		driver.findElement(By.name("password")).sendKeys("Diya0345");
		driver.findElement(By.cssSelector("div[class='css-lbyitw Checkbox-box']")).click();
		
	    driver.findElement(By.cssSelector("button[type='submit']")).click();	
	    //driver.findElement(By.cssSelector("button[type='button']")).click();	    
	    //Alert alert1 = driver.switchTo().alert();
		//alert1.accept();
		
		//driver.quit();

		

	}

}
