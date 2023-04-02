package qso;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectDropDown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/owaik/Desktop/Menu.html");
		
		WebElement menu = driver.findElement(By.id("Menu"));
		Select s=new Select(menu);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("Single samosa");
		Thread.sleep(3000);
		s.deselectByValue("ce");
		Thread.sleep(3000);
		s.selectByValue("cp");
		Thread.sleep(5000);
		driver.close();
		
	}

	
}
