package qso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.kesari.in/");
		String cssvalue=driver.findElement(By.xpath("(//img[@src='https://d3r8gwkgo0io6y.cloudfront.net/upload/sightseeing_image1_file/tour_leader.png'])[1]")).getCssValue("color");
		System.out.println(cssvalue);
		driver.close();
		
	
	}

}
