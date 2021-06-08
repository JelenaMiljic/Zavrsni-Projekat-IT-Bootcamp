package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objs.DashBoard;
import objs.Employees;
import objs.CLogin;

public class TestEmployees {
	

	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority =1)
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
	
	@Test (priority =2)
	public void testAddOneEmployee() {
		
		driver.navigate().to(Employees.URL);
		sacekaj();
		Employees.addEmployees(driver);
		sacekaj();
		Employees.firstName(driver, "Petar");
		sacekaj();
		Employees.lastName(driver, "Petrovic");
		sacekaj();
		Employees.email(driver, "eco@green.com");
		sacekaj();
		Employees.saveEmployees(driver);
		sacekaj();
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("&new=1"));
		
	}
	
	@Test (priority=4)
	public void testChangeName() {
		driver.navigate().to(Employees.URL);
		sacekaj();

		Employees.editEmployee(driver);
		sacekaj();
		Employees.editDetails(driver);
		sacekaj();
		Employees.inputName(driver, "Jovana");
		sacekaj();
		Employees.saveEmployee(driver);
		sacekaj();
		
		String tekst = driver.findElement(By.id("_status")).getText();
		Assert.assertEquals(tekst, "Employee Updated");
		
	}
	
	@Test (priority =3)
	public void testAddEmployees() {
		
		driver.navigate().to(Employees.URL);
		sacekaj();
		Employees.addEmployees(driver);
		sacekaj();
		
		File f = new File("data.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);

			SoftAssert sa = new SoftAssert();
			
			List<WebElement>tabelaRedovi =	driver.findElements(By.className("_ns_row"));

			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				
				Row row = sheet.getRow(i);
				Cell c0 = row.getCell(0); 
				Cell c1 = row.getCell(1);
				Cell c2 = row.getCell(2);
				
				String firstName = c0.toString();
				String lastName = c1.toString();
				String email = c2.toString();
				
				
				tabelaRedovi.get(i).findElement(By.className("_ns_fname")).sendKeys(firstName);
				tabelaRedovi.get(i).findElement(By.className("_ns_lname")).sendKeys(lastName);
				tabelaRedovi.get(i).findElement(By.className("_ns_email")).sendKeys(email);
				
			}
			
			Employees.saveEmployees(driver);
			sacekaj();
			
			String currentUrl = driver.getCurrentUrl();
			sa.assertTrue(driver.getPageSource().contains("email"));
			
			sa.assertAll();
			wb.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void sacekaj() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
