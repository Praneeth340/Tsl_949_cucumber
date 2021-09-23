package StepDefinition;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeliniumDevSteps {

	WebDriver driver;
	
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver =new ChromeDriver();
	}
	@After
	public void after() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Given("User is on Home Page of Selinium")
	public void user_is_on_home_page_of_selinium() {
		
		
		 driver.get("http://selenium.dev");
	}
	@When("user clicks on Download link")
	public void user_clicks_on_download_link() {
		driver.findElement(By.linkText("Downloads")).click();
	}
	@Then("title should be {string}")
	public void title_should_be(String expectedTitle) {
		Assert.assertEquals(expectedTitle, driver.getTitle());
	}

}
