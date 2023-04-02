package qso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(8000);
	boolean img=driver.findElement(By.xpath("(//img[@class='img-loader lazy-img-loader loaded'])[4]  ")).isDisplayed();
	
	if (img==true) {
		System.out.println("Yes");
		
	} else {
		System.out.println("No");

	}
	driver.close();
		
	}
		

}
