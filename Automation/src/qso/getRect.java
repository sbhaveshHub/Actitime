package qso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(3000);
		int a=driver.findElement(By.id("searchField")).getRect().getHeight();
	int b=driver.findElement(By.id("searchField")).getRect().getWidth();
	int c=driver.findElement(By.id("searchField")).getRect().getX();
	int d=driver.findElement(By.id("searchField")).getRect().getY();
	System.out.println("height is: "+a+"width is: "+b);
	System.out.println("x axis is: "+c+"y axis is: "+d);
	driver.close();
	
	}
}
