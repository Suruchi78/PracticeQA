package seleniumPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmericanEagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nvcc.edu/");
		driver.findElement(By.xpath("//*[@id=\"QID1-1-label\"]/span/strong")).click();
		
		WebElement cn = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[2]/nav/ul/li[1]/button"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(cn).build().perform();
	
		driver.close();
	}

}

