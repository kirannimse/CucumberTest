package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

	WebDriver  driver= null;
	
	
	@Given("Browser is open")   
	public void browser_is_open() {
		System.out.println("Inside steps- Browser is open");
		System.setProperty("webdriver.chrome.driver", "D:/Temp folder/Test/Project/CucumberTest/src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
	}

	@And("User enter URL")
	public void user_enter_url() {
		System.out.println("Inside steps- Enter the URL");
	}

	@When("Click on search button")
	public void click_on_search_button() {
		System.out.println("Inside steps- Click search");  
	}

	@Then("user navigates to desired page")
	public void user_navigates_to_desired_page() {
		System.out.println("Inside steps- User is on search page"); 
	}
}
