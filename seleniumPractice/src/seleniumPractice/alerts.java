package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome","C:\\\\\\\\Program Files\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		Thread.sleep(3000);
		String text = "raj";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		//driver.findElement(By.id("confirmbtn")).click();
		//driver.switchTo().alert().dismiss();
		
		
	}

}
