package qso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		boolean select=driver.findElement(By.xpath("//input[@name='remember'][1]")).isSelected();
		
		if (select==true) {
			System.out.println("isSelected");
			
		} else {
			System.out.println("is not selected");

		}
		driver.close();
	}

}
