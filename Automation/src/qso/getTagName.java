package qso;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class getTagName {
	static {
		System.setProperty("WebDriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");

	}
	}
