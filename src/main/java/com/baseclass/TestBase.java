package com.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;


	public class TestBase {
		
		public static WebDriver driver;
		
		@BeforeTest
		public void LaunchApp() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\work\\new chromedriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();							
			driver.get("https://google.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		
		}
		@AfterTest
		public void teardown() {
			driver.quit();
		}
		
		

	}

