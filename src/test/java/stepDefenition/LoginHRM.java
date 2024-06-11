package stepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginHRM {
	
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	}
	
	@When("^The user enter the login certindial username and password$")
	public void The_user_enter_the_login_certindial_username_and_password() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	}
	@And("click login Button")
	public void click_login_Button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
		
		String value=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		
		System.out.println(value);
	    
	}




}
