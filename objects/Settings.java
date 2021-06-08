package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {
	public static final String URL = "https://jelenagreen.humanity.com/app/dashboard/";
	public static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]";
	public static final String LANGUAGE_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";

	public static void settings(WebDriver driver) {
		driver.findElement(By.xpath(SETTINGS_XPATH)).click();
	}

	public static void changeLanguage(WebDriver driver, String language) {
		driver.findElement(By.xpath(LANGUAGE_XPATH)).sendKeys(language);
	}

	public static void disableViaEmail(WebDriver driver) {
		driver.findElement(By.id("pref_pref_email")).click();
	}

	public static void disableSMS(WebDriver driver) {
		driver.findElement(By.id("pref_pref_sms")).click();
	}

	public static void disableMobile(WebDriver driver) {
		driver.findElement(By.id("pref_pref_mobile_push")).click();
	}

	public static void disableTraining(WebDriver driver) {
		driver.findElement(By.id("pref_pref_training")).click();
	}

	public static void disableReports(WebDriver driver) {
		driver.findElement(By.id("pref_pref_reports")).click();
	}

	public static void disableProfileEdit(WebDriver driver) {
		driver.findElement(By.id("pref_pref_edit_profile")).click();
	}

	public static void disableStaffGalery(WebDriver driver) {
		driver.findElement(By.id("pref_pref_visible_staff")).click();
	}

	public static void disableContactDetails(WebDriver driver) {
		driver.findElement(By.id("pref_pref_visible_staff_details")).click();
	}

	public static void disableNow(WebDriver driver) {
		driver.findElement(By.id("pref_pref_on_now")).click();
	}

	public static void disableMessages(WebDriver driver) {
		driver.findElement(By.id("pref_pref_message_wall_on")).click();
	}

	public static void disableComments(WebDriver driver) {
		driver.findElement(By.id("pref_pref_message_wall_comments")).click();
	}

	public static void disableModule(WebDriver driver) {
		driver.findElement(By.id("pref_pref_messaging_module")).click();
	}

	public static void saveSettings(WebDriver driver) {
		driver.findElement(By.id("_save_settings_button")).click();
	}

}
