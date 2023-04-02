package qso;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions cp = new ChromeOptions(); 
		cp.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(cp);
		FileInputStream fis=new FileInputStream("./test/login1.property"); 
		Properties p=new Properties(); 
		p.load(fis); 
		String URL = p.getProperty("url");
		System.out.println(URL);
		driver.get(URL); 
		String UN = p.getProperty("username"); driver.findElement(By.id("username")).sendKeys(UN);
		String pwd = p.getProperty("password");
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5)); 
		//wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track")); 
		//driver.findElement(By.id("container_tasks")).click(); 
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click(); 
		Thread.sleep(5000);
		FileInputStream fis1=new FileInputStream("./test/pp.xlsx"); 
		Workbook w = WorkbookFactory.create(fis1); 
		String custname = w.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		//System.out.println(custname); 
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(custname); 
		String discr=w.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue(); 
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(discr); 
		driver.findElement(By.xpath("//div[.='Create Customer']")).click();
		Thread.sleep(10000);
		driver.close(); 
		}
	


	}


