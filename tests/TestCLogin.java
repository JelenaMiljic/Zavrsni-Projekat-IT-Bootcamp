package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.CLogin;

public class TestCLogin {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testLogin() {
		driver.navigate().to(CLogin.URL);
		driver.manage().window().maximize();
		sacekaj();
		CLogin.inputUsername(driver, "zeleni@green.com");
		CLogin.inputPassword(driver, "yeleni85");
		CLogin.pressLogin(driver);
		sacekaj();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://jelenagreen.humanity.com/app/dashboard/";
		Assert.assertEquals(currentUrl, expectedUrl);
		
	}
	
	public static void sacekaj() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
