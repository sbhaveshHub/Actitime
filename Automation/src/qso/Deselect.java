package qso;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/owaik/Desktop/Lang.html");
		WebElement cr = driver.findElement(By.id("Cricket"));
		Select s=new Select(cr);
		s.selectByVisibleText(" Java ");
		s.selectByVisibleText(" Python ");
		s.selectByIndex(2);
		s.selectByValue("ht");
		Thread.sleep(3000);
		s.deselectAll();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
