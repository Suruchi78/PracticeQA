package seleniumPackagae;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://training.qaonlinetraining.com/testPage.php");
		
		Thread.sleep(4000);
	    browserObject.findElement(By.name("name")).sendKeys("Rob");
	    browserObject.findElement(By.id("eml")).sendKeys("rob@gmail.com");
	    browserObject.findElement(By.name("website")).sendKeys("http: www.facebook.com");
	    browserObject.findElement(By.name("comment")).sendKeys("Nice");
	    
	    browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	    browserObject.findElement(By.xpath("/html/body/form/input[7]")).click();
	    browserObject.findElement(By.xpath("/html/body/form/select[1]")).click();
	    browserObject.findElement(By.xpath("/html/body/form/select[2]/option[2]")).click();
	    //browserObject.findElement(By.xpath("/html/body/form/input[8]")).click();
	    browserObject.findElement(By.xpath("/html/body/form/input[9]")).click();
	    browserObject.findElement(By.xpath("/html/body/form/input[10]")).click();
	    
	    WebElement cn=browserObject.findElement(By.name("country"));
	    
	    Select country=new Select(cn);
	    country.selectByVisibleText("Ethiopia");
	    
	    
	    
	    WebElement skl = browserObject.findElement(By.name("skill"));
	    
	    Select skill = new Select(skl);
	    skill.selectByContainsVisibleText("Programming");
	    
	    
		browserObject.findElement(By.name("submit")).click();
		
		browserObject.findElement(By.id("alert")).click();
		Alert alert1=browserObject.switchTo().alert();
		alert1.accept();
		
		browserObject.findElement(By.id("confirm")).click();
		
		Alert alert2 = browserObject.switchTo().alert();
		alert2.dismiss();
		
		browserObject.findElement(By.id("prompt")).click();
		
		Alert alert3 = browserObject.switchTo().alert();
		alert3.sendKeys("send alert");
		alert3.accept();
	}

}
