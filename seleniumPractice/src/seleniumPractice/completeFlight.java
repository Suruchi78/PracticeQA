package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class completeFlight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement returnDate = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_view_date2")));
	//	Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.cssSelector("a[value='IXG']")).click();
		//driver.findElement(By.xpath("//a[@value='CJB']")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		
		driver.findElement(By.cssSelector("a[class='ui-state-default']")).click();
		//driver.findElement(By.cssSelector("a[class='ui-state-default']")).click();
		
		
		//driver.findElement(By.cssSelector("a[class='ui-state-default")).click();
		
		//driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		
		driver.findElement(By.xpath("")).click();
		
		//driver.findElement(By.cssSelector("a.ui-state-default[onclick*='2025-02-10']")).click();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));
		for(WebElement option: options) {
		if(option.getText().equalsIgnoreCase("India")) {
		
		option.click();
		break;
		}
		}
		
		
	driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
		
	}

}
