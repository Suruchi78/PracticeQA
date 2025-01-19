package seleniumPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.driver.chromedriver", "C:\\\\Program Files\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
		
		WebElement cn = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
		
		Select sel = new Select(cn);
		sel.selectByIndex(2);
		System.out.println(sel.getFirstSelectedOption().getText());
		
		sel.selectByVisibleText("USD");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000L);
		
		
		for(int i=1; i< 5; i++) {
			
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}  {
			driver.findElement(By.id("btnclosepaxoption")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		
		
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
	    driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_SeniorCitizenDiv\"]/label")).click();
	    //driver.findElement(By.xpath("//*[@id=\"discount-checkbox\"]/span/a")).click();
	
	 
	
	}
}


