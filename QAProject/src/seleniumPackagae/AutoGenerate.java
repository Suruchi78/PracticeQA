package seleniumPackagae;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoGenerate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.driver.chrome","C:\\\\\\\\Program Files\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		//Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));
		for(WebElement option : options) {
				
			if(option.getText().equalsIgnoreCase("India")) {
					
				option.click();
				break;
			}
		}
		
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
	driver.close();
	}
}


