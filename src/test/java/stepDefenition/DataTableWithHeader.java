package stepDefenition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithHeader {
	
	WebDriver driver;
	
	
	@Given("visiting to orange site")
	public void visiting_to_orange_site() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
	}

	@When("executing with values")
	public void executing_with_values(io.cucumber.datatable.DataTable dataTable) {
		
		     List<Map<String,String>> keyValuePair   =dataTable.asMaps(String.class, String.class);
		     
		String username=     keyValuePair.get(0).get("UserName");
		 String password=    keyValuePair.get(0).get("Password");
		 
		 driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
	    
	}

	@And("click submitButton at end")
	public void click_submitButton_at_end() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	}



}
