package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile {

	public static final String URL = "https://jelenagreen.humanity.com/app/dashboard/";
	public static final String PROF_XPATH = "//*[@id=\"tr_avatar\"]";
	public static final String PROFILE_XPATH = "//*[@id=\"userm\"]/div/a[1]";
	public static final String NOTIFICATIONS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[6]";
	public static final String MOBILE_PUSH_XPATH = "//*[@id=\"mobile_push[pref]\"]";
	public static final String EDIT_PROFILE_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	
	
	public static void prof(WebDriver driver) {
		driver.findElement(By.xpath(PROF_XPATH)).click();
	}

	public static void profile(WebDriver driver) {
		driver.findElement(By.xpath(PROFILE_XPATH)).click();
	}
	
	public static void notifications(WebDriver driver) {
		driver.findElement(By.xpath(NOTIFICATIONS_XPATH)).click();
	}
	
	public static void mobilePush(WebDriver driver) {
		driver.findElement(By.xpath(MOBILE_PUSH_XPATH)).click();
	}
	
	
	public static void saveNotification(WebDriver driver) {
		driver.findElement(By.id("notif-settings")).click();
	}
	
	public static void editDetails(WebDriver driver) {
		driver.findElement(By.xpath(EDIT_PROFILE_XPATH)).click();
	}
	
	public static void lastName(WebDriver driver, String lastName) {
		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys(lastName);
	}
	
	public static void nickName(WebDriver driver, String nickname) {
		driver.findElement(By.name("nick_name")).clear();
		driver.findElement(By.name("nick_name")).sendKeys(nickname);
	}
	
	public static void adress(WebDriver driver, String adress) {
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys(adress);
	}
	
	public static void city(WebDriver driver, String city) {
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(city);
	}
	
	public static void gender(WebDriver driver,String gender) {
		driver.findElement(By.id("gender")).sendKeys(gender);
	}
	
	public static void submit(WebDriver driver) {
		driver.findElement(By.name("update")).click();
	}
	
	public static void photo(WebDriver driver, String photo) {
		driver.findElement(By.id("fileupload")).sendKeys(photo);
	}
	
}
