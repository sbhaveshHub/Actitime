package qso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class submitMethod {
	
	static {
		System.setProperty("Webdriver.chrome.driver", "./driver.chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/corporate-training");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='CONNECT WITH US']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@required='required'])[6]")).sendKeys("Dipak chavan");
		driver.findElement(By.xpath("(//input[@data-validation='required'])[3]")).sendKeys("Dipak chavan and brothers");
		driver.findElement(By.xpath("(//input[@placeholder='Email ID'])[3]")).sendKeys("Dipak123@gmail.com");
		driver.findElement(By.xpath("(//textarea[@placeholder='Enter your Query'])[3]")).sendKeys("Query related the courses");
		driver.findElement(By.xpath("(//input[@placeholder='Phone Number'])[3]")).sendKeys("9876898987");
		WebElement element=driver.findElement(By.xpath("(//select[@class='form-control required'])[3]"));
		Select s=new Select(element);
		s.selectByVisibleText("For Myself");
		
		Thread.sleep(3000);
		driver.findElement(By.id("corp-talk-modal-submit")).submit();
		Thread.sleep(3000);
		driver.close();
	}

}
