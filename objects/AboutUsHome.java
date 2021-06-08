package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsHome {
	
	public static final String URL = "https://www.humanity.com";
	
	public static final String ABOUT_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a";
	public static final String POP_UP_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String ABOUT_US_XPATH = "/html/body/div[7]/ul/li[7]/a";
	public static final String ABOUT_US_PAGE_XPATH = "/html/body/div[7]/ul/li[7]/ul/li[2]/a";
	
	
	public static void popUp(WebDriver driver) {
		driver.findElement(By.xpath(POP_UP_XPATH)).click();
	}
	
	public static void meny(WebDriver driver) {
		driver.findElement(By.id("sm_menu_ham")).click();
	}
	
	public static void aboutUs(WebDriver driver) {
		driver.findElement(By.xpath(ABOUT_US_XPATH)).click();
	}
	
	 public static void aboutUsPage(WebDriver driver) {
		 driver.findElement(By.xpath(ABOUT_US_PAGE_XPATH)).click();
	 }
	
	
	
}
