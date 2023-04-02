package qso;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("file:///C:/Users/owaik/Desktop/TextBox.html");
		driver.findElement(By.id("t2")).sendKeys("Word publishing");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("Publishing");
		Thread.sleep(3000);
		driver.close();

	}

}
