package qso;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedoption {
	static {
		System.setProperty("Webdriver.driver.chromedriver", "./driver.chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("file:///C:/Users/owaik/Desktop/Lang.html");
		WebElement acc = driver.findElement(By.id("Cricket"));
		Select s=new Select(acc);
		s.selectByVisibleText(" Python ");
		s.selectByValue("ht");
		s.selectByVisibleText(" Java ");
		s.selectByIndex(2);
		Thread.sleep(3000);
		String opt=s.getFirstSelectedOption().getText();
		System.out.println(opt);
		driver.close();
	
		

	}

}
