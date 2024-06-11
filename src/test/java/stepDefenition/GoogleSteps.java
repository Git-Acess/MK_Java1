package stepDefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
	WebDriver driver ;

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");


		driver = new ChromeDriver();

		driver.get("http://www.google.co.in");

	}

	@When("I complete action")
	public void i_complete_action() {
		
		System.out.println("when condition");

	}

	@And("some other action")
	public void some_other_action() {
		System.out.println("and condition");

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("then condition");

	}




}
