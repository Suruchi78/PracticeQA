package seleniumPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starbucks {
	
	public static void main(String args []) {
		
		
		System.setProperty("webdriver.driver.chrome", "C:\\\\Program Files\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.starbucks.com/gift");
		
		//Thread.sleep(1000);
		driver.findElement(By.id("truste-consent-button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"js-content\"]/div/div[2]/header/nav/div[1]/div/div[2]/div[2]/div/a")).click();
	     
		
	     driver.findElement(By.id("firstName")).sendKeys("Nima");
	     driver.findElement(By.id("lastName")).sendKeys("Shrestha");
	     driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("nimashrestha456@gmail.com");
	     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("yyh");
	     driver.findElement(By.xpath("")).click();
	
	}

}
