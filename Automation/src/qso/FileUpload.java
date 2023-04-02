package qso;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static{
		System.setProperty("Webdriver.driver.Chromedriver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		Thread.sleep(5000);
		File f=new File("./test/EAadhaar_1218502245069120111212134402_17012023221132.pdf");
		String fc=f.getAbsolutePath();
		driver.findElement(By.id("file-upload")).sendKeys(fc);
		Thread.sleep(3000);

}
	}
