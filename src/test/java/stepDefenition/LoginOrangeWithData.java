package stepDefenition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOrangeWithData {
	
	WebDriver driver;
	
	
	@Given("navigating to OrangeHRM")
	public void navigating_to_OrangeHRM() {
		

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	  
	}

	@When("providing the credintails {string} and {string}")
	public void providing_the_credintails_and(String name, String password) {
		
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
	 
	}

	@And("clicking the submit button")
	public void clicking_the_submit_button() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	@Then("verifying the login page")
	public void verifying_the_login_page() throws IOException {
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		
		File sourceFile= screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationFile = new File("loginWithData.png");
		
		FileHandler.copy(sourceFile, destinationFile);
	   
	}




}
