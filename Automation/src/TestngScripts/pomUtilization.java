package TestngScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class pomUtilization {
	
	@Test
	public void login() throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		LoginPage lp=new LoginPage(driver);
		lp.getUntbx().sendKeys("admin");
		driver.navigate().refresh();
		lp.getUntbx().sendKeys("admin");
		lp.getPwtbx().sendKeys("manager");
		lp.getLgbtn().click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
