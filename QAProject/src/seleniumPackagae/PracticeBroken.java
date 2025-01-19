package seleniumPackagae;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBroken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.driver.chrome","C:\\\\\\\\Program Files\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");
		
		
		
		/*List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement alllinks:link )
		{
			String url=alllinks.getAttribute("href");
			verifyLink(url);
		}
			
		}
	

  public static void verifyLink(String url) {
	 try {
	 URL link = new URL(url);
	 HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
	 httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
	 httpURLConnection.connect();*/

	}
}
