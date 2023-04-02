package TestngScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static WebDriver driver;
	Properties p;

	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database conneted",true);
	}
	@BeforeTest
	public void LaunchBrowser() throws IOException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("browser launched",true);
		FileInputStream fis=new FileInputStream("./test/login1.property"); 
		Properties p=new Properties(); 
		p.load(fis); 
		String URL = p.getProperty("url");
		driver.get(URL);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		Reporter.log("logged in",true);
	}
	@BeforeMethod
	public void Login() throws InterruptedException, FileNotFoundException {
		
//		FileInputStream fis1=new FileInputStream("./test/login1.property"); 
//		Properties p1=new Properties(); 
//		String UN = p1.getProperty("username");
		
	//String pwd = p1.getProperty("password");
		
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		Reporter.log("logout successfully",true);
		Thread.sleep(10000);
		driver.findElement(By.id("logoutLink")).click();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		Reporter.log("browser closed",true);
		
	}
	
	@AfterSuite
	public void databaseDisconnect() {
		Reporter.log("database disconnected",true);
	}

}
