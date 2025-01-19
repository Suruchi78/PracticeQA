package seleniumPackagae;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.driver.chrome", "C:\\\\Program Files\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("loginlabel")).click();
		driver.findElement(By.id("user_login")).sendKeys("Demo12");
		driver.findElement(By.id("user_pass")).sendKeys("Test123456$");
		driver.findElement(By.id("wp-submit")).click();
		
	}

}
