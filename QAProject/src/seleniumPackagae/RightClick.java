package seleniumPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.driver.chrome", "C:\\\\Program Files\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		WebElement cn=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions acc = new Actions(driver);
	    acc.contextClick(cn).build().perform();
		
	    driver.close();
	}

}
