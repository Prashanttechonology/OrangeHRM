package StepDefinatiions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMLogin {

	WebDriver driver;

	@Given("Browser is open")
	public void browser_is_open() throws InterruptedException {
		System.out.println("inside Step-Browser is open");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@And("user is on OrangeHRM page")
	public void user_is_on_orange_hrm_page() {
		System.out.println("inside Step-user is on login page");

	}

	@When("user enters a login credentials in login page")

	public void user_enters_a_login_credentials_in_login_page() {
		System.out.println("user enters login credentials");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

	}

	@And("hits login")
	public void hits_login() {
		System.out.println("inside step click on login");
		driver.findElement(By.xpath("(//button[normalize-space()='Login'])")).click();
	}

	@Then("user is navigates to home page")
	public void user_is_navigates_to_home_page() {
		System.out.println("inside step-user is navigated to homepage");

		System.out.println(driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed());
		driver.close();
		driver.quit();
	}

}
