package seleniumPractice;

	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

	public class Flight {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			
			System.setProperty("webdriver.driver.chrome","C:\\\\\\\\Program Files\\\\\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
			driver.findElement(By.id("autosuggest")).sendKeys("ind");
			
			Thread.sleep(3000);
			
			List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));
			for(WebElement option : options) {
					
				if(option.getText().equalsIgnoreCase("India")) {
						
					option.click();
					break;
				}
			}
			
			
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			
		   
			
			//driver.findElement(By.xpath("//button[@type='button']")).click();
			//driver.findElement(By.id("ui-datepicker-div")).click();
			
          System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
			
			driver.findElement(By.id(("ctl00_mainContent_rbtnl_Trip_1"))).click();
			System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
			
			driver.findElement(By.cssSelector("//td[@class='ui-state-default']")).click();
			
			 driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
			 
			 
		}
	}
			
			
		
	




