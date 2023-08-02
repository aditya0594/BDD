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

import java.sql.Driver;
import java.util.List;


public class LoginStepDefinition {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {

		driver.get("https://www.saucedemo.com/");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);

	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.asLists();
		driver.findElement(By.id("user-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}

	@Then("^User land on the homepage$")
	public void User_land_on_the_homepage() {
		String hompage_title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();
		System.out.println("Title of the element is :" + hompage_title);
		Assert.assertEquals("Swag Labs", hompage_title);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}


	@Given("^invalid user is already on Login Page$")
	public void user_already_on_login_page_locked() {
		driver.get("https://www.saucedemo.com/");
	}

	//
	@When("^user enters Locked username and password$")
	public void user_enters_username_and_password1(DataTable credentials) {
		List<List<String>> data = credentials.asLists();
		driver.findElement(By.id("user-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}

	@Then("^Locked user clicks on login button$")
	public void user_clicks_on_login_button_Locked() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}

	@Then("^user get the error message of locaked user$")
	public void user_enters_username_and_password_locked() {
		boolean error = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).isDisplayed();
		Assert.assertTrue(error);
	}


	@Then("^Message is Epic sadface: Sorry, this user has been locked out$")
	public void message_is() {
		String Error_message = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
		System.out.println("Title of the element is :" + Error_message);
		Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", Error_message);
	}
	@Then("^Close the browser locked user$")
	public void close_the_browser_locaked() {
		driver.quit();
	}








	@Given("^invalid user is already on Login Page-invalid user$")
	public void user_already_on_login_page_invalid() {
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters Locked username and password-invalid user")
	public void user_enters_locked_username_and_password_invalid_user( DataTable credentials) {
		List<List<String>> data = credentials.asLists();
		driver.findElement(By.id("user-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}
	@Then("user clicks on login button-invalid user")
	public void user_clicks_on_login_button_invalid_user() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}
	@Then("user get the error message of invalid credentials user-invalid user")
	public void user_get_the_error_message_of_invalid_credentials_user_invalid_user() {
		boolean error = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).isDisplayed();
		Assert.assertTrue(error);
	}
	@Then("Message is Epic sadface: Username and password do not match any user in this service-invalid user")
	public void message_is_epic_sadface_username_and_password_do_not_match_any_user_in_this_service_invalid_user() {
		String invalid_password_message = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", invalid_password_message);
	}
	@Then("Close the browser-invalid user")
	public void close_the_browser_invalid_user() {
		driver.quit();
	}







	@Given("^invalid user is already on Login Page-invalid username$")
	public void user_already_on_login_page_invalid_user() {
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters Locked username and password-invalid username")
	public void user_enters_locked_username_and_password_invalid_username(DataTable credentials) {
			List<List<String>> data = credentials.asLists();
			driver.findElement(By.id("user-name")).sendKeys(data.get(0).get(0));
			driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}
	@Then("user clicks on login button-invalid username")
	public void user_clicks_on_login_button_invalid_username() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}
	@Then("user get the error message of invalid credentials user-invalid username")
	public void user_get_the_error_message_of_invalid_credentials_user_invalid_username() {
		boolean error = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).isDisplayed();
		Assert.assertTrue(error);
	}
	@Then("Message is Epic sadface: Username and password do not match any user in this service-invalid username")
	public void message_is_epic_sadface_username_and_password_do_not_match_any_user_in_this_service_invalid_username() {
		String invalid_password_message = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", invalid_password_message);
	}
	@Then("Close the browser-invalid username")
	public void close_the_browser_invalid_username() {
		driver.quit();
	}

	@Given("^invalid user is already on Login Page-invalid username Close button$")
	public void user_already_on_login_page_invalid_user_Close() {
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters Locked username and password--invalid username Close button")
	public void user_enters_locked_username_and_password_invalid_username_close_button(DataTable credentials) {
		List<List<String>> data = credentials.asLists();
		driver.findElement(By.id("user-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}
	@Then("user clicks on login button--invalid username Close button")
	public void user_clicks_on_login_button_invalid_username_close_button() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}
	@Then("Close button should close the error message--invalid username Close button")
	public void close_button_should_close_the_error_message_invalid_username_close_button() {
		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/button")).click();
	}




//twtawtawtt
}

