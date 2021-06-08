package objs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Employees {
	public static final String URL = "https://jelenagreen.humanity.com/app/staff/list/load/true/";
	public static final String FIRST_NAME_XPATH = "//*[@id=\"_asf1\"]";
	public static final String LAST_NAME_XPATH = "//*[@id=\"_asl1\"]";
	public static final String EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	public static final String CHANGE_NAME_XPATH = "//*[@id=\"7\"]/a";
	public static final String EDIT_DETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String EDIT_EMPLOYEE_XPATH = "//*[@id=\"7\"]/a"; 
	
	
	
	public static void addEmployees(WebDriver driver) {
		driver.findElement(By.id("act_primary")).click();
	}
	
	public static void firstName(WebDriver driver, String firstName) {
		driver.findElement(By.xpath(FIRST_NAME_XPATH )).sendKeys(firstName);
	}
	
	public static void lastName(WebDriver driver, String lastName) {
		driver.findElement(By.xpath(LAST_NAME_XPATH)).sendKeys(lastName);
	}
	
	public static void email(WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL_XPATH)).sendKeys(email);
	}
	
	public static void saveEmployees(WebDriver driver) {
		driver.findElement(By.id("_as_save_multiple")).click();
	}
	public static void changeName(WebDriver driver) {
		driver.findElement(By.xpath(CHANGE_NAME_XPATH)).click();
	}
	
	public static void editDetails(WebDriver driver) {
		driver.findElement(By.xpath(EDIT_DETAILS_XPATH)).click();
	}
	public static void editEmployee(WebDriver driver) {
		driver.findElement(By.xpath(EDIT_EMPLOYEE_XPATH)).click();
	}
	
	public static void inputName(WebDriver driver, String inputName) {
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys(inputName);
	}
	
	public static void saveEmployee(WebDriver driver) {
		driver.findElement(By.name("update")).click();
	}
	
}
