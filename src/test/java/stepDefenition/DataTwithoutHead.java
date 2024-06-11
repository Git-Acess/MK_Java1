package stepDefenition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTwithoutHead {

	WebDriver driver;

	@Given("navigating to OrangeHRM site")
	public void navigating_to_OrangeHRM_site() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	@When("enter the below credential")
	public void enter_the_below_credential(DataTable dataTable) {

		List<String> Credintial=dataTable.asList(String.class);

		String name=	Credintial.get(0);

		String password = Credintial.get(1);


		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@And("click submit button")
	public void click_submit_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}



}
