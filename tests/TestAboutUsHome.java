package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import objs.AboutUsHome;



public class TestAboutUsHome {
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public static void testAboutUS() {
		driver.navigate().to(AboutUsHome.URL);
		//driver.manage().window().maximize();

		AboutUsHome.popUp(driver);
		AboutUsHome.meny(driver);
		sacekaj();
		AboutUsHome.aboutUs(driver);
		sacekaj();
		AboutUsHome.aboutUsPage(driver);
		sacekaj();
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\screenshots\\screenshot.png");
		
        try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.humanity.com/about";
		
		
		Assert.assertEquals(currentUrl, expectedUrl);
		
	}
	
	public static void sacekaj() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
