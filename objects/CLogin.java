package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CLogin {
	
	public static final String URL = "https://www.humanity.com/app/";
	
	public static final String USERNAME_XPATH ="//*[@id=\"email\"]";
	public static final String PASSWORD_XPATH = "//*[@id=\"password\"]";
	
	
	public static void inputUsername(WebDriver driver, String username) {
		driver.findElement(By.xpath(USERNAME_XPATH)).sendKeys(username);
	}
	
	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys(password);
	}
	
	public static void pressLogin(WebDriver driver) {
		driver.findElement(By.name("login")).click();
	}
	
}
