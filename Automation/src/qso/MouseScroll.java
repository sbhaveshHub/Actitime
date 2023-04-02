package qso;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScroll {
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			JavascriptExecutor j=(JavascriptExecutor) driver;
			driver.get("https://www.bbc.com/news");
			j.executeScript("window.scroll(0,2000)");
			Thread.sleep(3000);
			driver.close();
		}


}
