package stepDefenition;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSearch {
	
	WebDriver driver;
	
	@Given("user is enteing the url {string}")
	public void user_is_enteing_the_url(String string) {
		
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");

		
		 driver = new ChromeDriver();
		 
		 driver.navigate().to(string);
		
	
	    
	}

	@When("user is providing the search {string}")
	public void user_is_providing_the_search(String string) {
		
		driver.findElement(By.name("q")).sendKeys(string+Keys.ENTER);
	   
	}

	@And("search result are visible to user")
	public void search_result_are_visible_to_user() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	}

	@Then("taking the screenshot of the search result")
	public void taking_the_screenshot_of_the_search_result() throws AWTException, IOException {
		
		
		//one way of taking screen
	
		/*TakesScreenshot sc=(TakesScreenshot) driver;
	File sourceFile=	sc.getScreenshotAs(OutputType.FILE);
	
	
	File destinationFile=new File("sample.png");
	
		FileHandler.copy(sourceFile, destinationFile);*/
		
		// Screenshot using Robot Class java.awt package
		
		Robot rb = new Robot();
		
	Dimension ScreenSize=	Toolkit.getDefaultToolkit().getScreenSize();
	
	Rectangle rectangle = new Rectangle(ScreenSize);
	
	BufferedImage sourceImage= rb.createScreenCapture(rectangle);
	
	File destinationFile = new File("RobotImage.png");
	
	ImageIO.write(sourceImage, "png", destinationFile);
		
	
		
		
	    
	}



}
