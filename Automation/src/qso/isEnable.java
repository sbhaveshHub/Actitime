package qso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);
		boolean enable=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
		
		if (enable== true) {
			System.out.println("Is enabled");
			
		} else {
			System.out.println("Is disabled");

		}
		driver.close();

	}

}
