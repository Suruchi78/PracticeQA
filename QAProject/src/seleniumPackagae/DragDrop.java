package seleniumPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.driver.chrome", "C:\\\\Program Files\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement source =driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		
		
		WebElement target =driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
	}

}
