package qso;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Java");
			Thread.sleep(3000);
			List<WebElement> a = driver.findElements(By.xpath("//span[.='java']/../../../../.."));
			int count=a.size();
			for (int i = 0; i < count; i++) {
				String sugg = a.get(i).getText();
				System.out.println(sugg);
				
			}
			driver.findElement(By.xpath("//b[.=' online compiler']")).click();
			driver.findElement(By.xpath("//h3[.='Online Java Compiler - Tutorialspoint']")).click();
			Thread.sleep(3000);
			driver.close();
		}
}
