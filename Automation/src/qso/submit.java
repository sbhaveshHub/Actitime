package qso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {
static {
	System.setProperty("Webdriver.chrome.driver", "./driver.chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/corporate-training");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[.='CONNECT WITH US']]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@required='required'])[6]")).sendKeys("Deepak Weeds Riddhi");
		
		driver.findElement(By.xpath("(//input[@data-validation='required'])[3]")).sendKeys("JamalGota.Pvt Ltd");
		
		driver.findElement(By.xpath("(//input[@required='required'])[7]")).sendKeys("deepakbhabi32@gmail.com");
		
		driver.findElement(By.xpath("(//input[@placeholder='Phone Number'])[3]")).sendKeys("9300211248");
		
		driver.findElement(By.xpath("(//textarea[@placeholder='Enter your Query'])[3]")).sendKeys("Deepak Loves Riddhi");
		Thread.sleep(3000);
		driver.close();
	}

	
}
