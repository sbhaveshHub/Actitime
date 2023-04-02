package qso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintrial {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/people/login.html");
		driver.findElement(By.xpath("(//a[.='SIGN IN'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login_id")).sendKeys("omkar.waikar@wpsgp.com");
		Thread.sleep(5000);
		driver.findElement(By.id("nextbtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("PASSWORD")).sendKeys("Omkar@123");
		Thread.sleep(5000);
		driver.findElement(By.id("nextbtn"));
		Thread.sleep(5000);
		driver.close();
		
	}

}
