package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard {
	
	public static final String URL = "https://jelenagreen.humanity.com/app/dashboard/";
	public static final String SHIFT_PLAN_XPATH = "//*[@id=\"sn_schedule\"]/span"; 
	public static final String CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	public static final String AVAILABILLITY_XPATH = "//*[@id=\"sn_availability\"]/span";
	public static final String PAYROLL_XPATH ="//*[@id=\"sn_payroll\"]/span";
	public static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span";
	
	
	public static void shiftPlan(WebDriver driver) {
		driver.findElement(By.xpath(SHIFT_PLAN_XPATH)).click();
	}
	
	public static void clock(WebDriver driver) {
		driver.findElement(By.xpath(CLOCK_XPATH)).click();
	}
	
	public static void leave(WebDriver driver) {
		driver.findElement(By.xpath(LEAVE_XPATH)).click();
	}
	
	public static void training(WebDriver driver) {
		driver.findElement(By.xpath(TRAINING_XPATH)).click();
	}
	public static void staff(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
	}
	public static void availabillity(WebDriver driver) {
		driver.findElement(By.xpath(AVAILABILLITY_XPATH)).click();
	}
	
	public static void payroll(WebDriver driver) {
		driver.findElement(By.xpath(PAYROLL_XPATH)).click();
	}
	
	public static void reports(WebDriver driver) {
		driver.findElement(By.xpath(REPORTS_XPATH)).click();
		
	}
}
