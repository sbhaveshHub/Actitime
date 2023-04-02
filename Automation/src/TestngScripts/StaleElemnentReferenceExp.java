
package TestngScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class StaleElemnentReferenceExp {
	@Test
	public void demo() throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(5000);
		WebElement un = driver.findElement(By.id("username"));
		driver.navigate().refresh();
		Thread.sleep(5000);
		un.sendKeys("admin");
		driver.close();
	}

}
