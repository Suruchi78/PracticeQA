package seleniumPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Itn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.driver.chrome", "C:\\\\Program Files\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.itlearn360.com/");
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-42364\"]/a/span")).click();
		driver.findElement(By.id("user_login")).sendKeys("suruchi11");
		driver.findElement(By.id("user_pass")).sendKeys("NOVA9090$");
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.xpath("/html/body/header/nav/div/section/div/div[2]/div/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-menu-item-7397\"]/a/div")).click();
		driver.findElement(By.xpath("//*[@id=\"section-10412\"]/ul/li[1]")).click();
		driver.findElement(By.id("nav-menu-item-41925")).click();
		
		
		
	}

}
