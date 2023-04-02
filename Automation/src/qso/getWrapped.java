package qso;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrapped {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("file:///C:/Users/owaik/Desktop/Lang.html");
		WebElement acc = driver.findElement(By.id("Cricket"));
		Select s=new Select(acc);
		String var = s.getWrappedElement().getText();
		System.out.println(var);
		driver.close();
		

	}

}
