package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {

	WebDriver driver;

	@Before
	public void Setup() {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	@After
	public void teardown() {
		driver.quit();

	}
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		driver.get("https://saucedemo.com");
		String Title_OF_Login = driver.getTitle();
		System.out.println(Title_OF_Login);
		Assert.assertEquals("Swag Labs", Title_OF_Login);

	}
	@When("^title of login page is Swap Labs$")
	public void title_of_login_page_is_free_CRM() {
		String title_verify = driver.getTitle();
		System.out.println(title_verify);
		Assert.assertEquals("Swag Labs", title_verify);
	}
	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);

	}

	 @Then("^user is on home page$")
	 public void user_is_on_home_page(){
	 String title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("Products", title);
	 }
//	 
	 @Then("^Close the browser$")
		 public void Close_the_browser() {

		driver.quit();
		}
//	 
//	 
//	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contacts_details(String firstname, String lastname, String position){
//		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	 }
//	 
//
//	 @Then("^Close the browser$")
//	 public void close_the_browser(){
//		 driver.quit();
//	 }
//	
//	
//	
//
//}
}