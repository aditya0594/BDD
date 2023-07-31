package stepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class LoginStepDefinition {

	WebDriver driver;
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@After
	public void teardown(){
		driver.quit();
	}
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {

		driver.get("https://www.saucedemo.com/");
	}
// commit
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);

	}
	@Then("user enters {string} and {string}")
	public void user_enters_username_and_password(DataTable user) {
		List<List<String>> data = usercredentials.raw();

		//	driver.findElement(By.id("user-name")).sendKeys((CharSequence) data.get("username"));
		//	driver.findElement(By.id("password")).sendKeys((CharSequence) data.get("password"));
		}


	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}
	@Then("^User land on the homepage$")
	public void User_land_on_the_homepage() {
		String hompage_title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		System.out.println(hompage_title);
		Assert.assertEquals("Products", hompage_title);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
//
//	@Given("^user is already on Login Page$")
//	public void user_already_on_login_page_locked() {
//		driver.get("https://www.saucedemo.com/");
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_free_CRM_locked() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Swag Labs", title);
//
//	}
//	@Then("user enters {string} and {string}")
//	public void user_enters_username_and_password_locked(String username, String password) {
//
//		driver.findElement(By.name("user-name")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//
//
//	}	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button_locked() {
//		driver.findElement(By.id("login-button")).click();
//	}
//	@Then("^User should able to see error message for the locked user$")
//	public void User_should_able_to_see_error_message_for_the_locked_user() {
//		Boolean errorMessage = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()")).isDisplayed();
//		Assert.assertTrue("Error message displayed",errorMessage );
//	}
//	@Then("^Message should be \"Epic sadface: Sorry, this user has been locked out.\"$")
//	public void User_should_able_to_see_error_message_for_the_locked_user_message_verify() {
//		String errorMessage_text = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()")).getText();
//		Assert.assertEquals("Error Displayed", "Epic sadface: Sorry, this user has been locked out.",errorMessage_text);
//
//	}
//	@Then("^Close the browser$")
//	public void close_the_browser_locked() {
//		driver.quit();
//	}



}