package qso;

import java.time.Duration;

import javax.security.auth.callback.LanguageCallback;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectedDropdown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement daydrop = driver.findElement(By.id("day"));
		Select s=new Select(daydrop);
		s.selectByIndex(1);
		driver.findElement(By.id("u_2_4_8I")).click();
		
		/*WebElement gender=driver.findElement(By.xpath("//label[.='Female']"));
		Select g=new Select(gender);
		g.selectByVisibleText("Female");
		*/
		Thread.sleep(5000);
		driver.close();
		
	}

}
