package qso;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		Thread.sleep(5000);
		int totallink = alllinks.size();
		System.out.println(totallink);
		for (int i = 0; i < totallink; i++) {
			String link = alllinks.get(i).getText();
			System.out.println(link);
			
		}
		driver.close();
	}

}
