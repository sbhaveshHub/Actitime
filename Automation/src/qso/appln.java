package qso;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class appln {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://auth.services.adobe.com/en_US/index.html?callback=https%3A%2F%2Fims-na1.adobelogin.com%2Fims%2Fadobeid%2FCCHomeWeb1%2FAdobeID%2Ftoken%3Fredirect_uri%3Dhttps%253A%252F%252Fcreativecloud.adobe.com%252Fcc%252Fillustrator%253Flocale%253Den%2523old_hash%253D%2526from_ims%253Dtrue%2526client_id%253DCCHomeWeb1%2526api%253Dauthorize%2526scope%253DAdobeID%252Copenid%252Cgnav%252Cread_organizations%252Ccreative_sdk%252Cadditional_info.optionalAgreements%252Cadditional_info.screen_name%252Cadditional_info.roles%252Ctk_platform%252Cpiip_read%26state%3D%257B%2522jslibver%2522%253A%2522v2-v0.31.0-2-g1e8a8a8%2522%252C%2522nonce%2522%253A%25223907152434118017%2522%257D%26code_challenge_method%3Dplain%26use_ms_for_expiry%3Dtrue&client_id=CCHomeWeb1&scope=AdobeID%2Copenid%2Cgnav%2Cread_organizations%2Ccreative_sdk%2Cadditional_info.optionalAgreements%2Cadditional_info.screen_name%2Cadditional_info.roles%2Ctk_platform%2Cpiip_read&denied_callback=https%3A%2F%2Fims-na1.adobelogin.com%2Fims%2Fdenied%2FCCHomeWeb1%3Fredirect_uri%3Dhttps%253A%252F%252Fcreativecloud.adobe.com%252Fcc%252Fillustrator%253Flocale%253Den%2523old_hash%253D%2526from_ims%253Dtrue%2526client_id%253DCCHomeWeb1%2526api%253Dauthorize%2526scope%253DAdobeID%252Copenid%252Cgnav%252Cread_organizations%252Ccreative_sdk%252Cadditional_info.optionalAgreements%252Cadditional_info.screen_name%252Cadditional_info.roles%252Ctk_platform%252Cpiip_read%26response_type%3Dtoken%26state%3D%257B%2522jslibver%2522%253A%2522v2-v0.31.0-2-g1e8a8a8%2522%252C%2522nonce%2522%253A%25223907152434118017%2522%257D&state=%7B%22jslibver%22%3A%22v2-v0.31.0-2-g1e8a8a8%22%2C%22nonce%22%3A%223907152434118017%22%7D&relay=2814d365-45a0-466e-af63-96e783c1b2f2&locale=en_US&flow_type=token&dctx_id=v%3A2%2Cs%2Cd8b1f640-7adf-11ec-b094-1998d314c651&idp_flow_type=login&s_p=google%2Cfacebook%2Capple&response_type=token#/");
		driver.findElement(By.id("EmailPage-EmailField")).sendKeys("jon25343@adobe.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Company or School Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("input43")).sendKeys("jon25343@adobe.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		Thread.sleep(25000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.titleContains("Adobe Inc - Sign In"));
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@class='button button-primary']")).click();
	
	
	
	
	}

}
