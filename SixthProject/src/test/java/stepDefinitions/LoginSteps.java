package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AuthenticationPage;

public class LoginSteps {
	WebDriver driver;
	AuthenticationPage objAuthentication;
	

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objAuthentication = PageFactory.initElements(driver, pages.AuthenticationPage.class);
		driver.get("http://automationpractice.com/index.php");
		
	}
	@Given ("I am on the aut page")
	public void i_am_on_the_aut_page() {
		setUp();
		objAuthentication.clickSignIn1Button();
	}
	@When ("I provide valid credentials")
	public void i_provide_valid_credentials() {
	objAuthentication.setEmailAddress2TextField("TC12@gmail.com");
	objAuthentication.setPasswordPasswordField("Bale123");
	
}
	@And ("I click on the sign in button")
	public void i_click_on_the_sign_in_button() {
		objAuthentication.clickSignIn2Button();
		
	}
   public void tearDown() throws InterruptedException {
	   Thread.sleep(5000);
	   driver.close();
}
   
}
