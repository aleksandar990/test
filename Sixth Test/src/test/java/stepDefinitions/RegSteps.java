package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AuthenticationPage;
import pages.RegistrationPage;

public class RegSteps {
	WebDriver driver;
	AuthenticationPage objAuthentication;
	RegistrationPage objRegistration;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		objAuthentication = PageFactory.initElements(driver, pages.AuthenticationPage.class);
		objRegistration = PageFactory.initElements(driver, pages.RegistrationPage.class);
		driver.get("http://automationpractice.com/index.php");
	}

	
	@Given ("I am on the authentication page")
	public void i_am_on_the_authentication_page() {
		setUp();
		objAuthentication.clickSignIn1Button();		
		
	}
	
	@When ("I provide email with valid credentials")
	 public void i_provide_email_with_valid_credentials() {
		objAuthentication.setEmailAddress1TextField("roksoslkoo@gmail.com");
		
	}
	
	@Then ("I click on the create account button")
	public void i_click_on_the_create_account_button() throws InterruptedException {
		objAuthentication.clickCreateAnAccountButton();
		Thread.sleep(3000);
		
	}
	
	@And ("I fill the registration form")
	public void i_fill_the_registration_form() throws InterruptedException {
		objRegistration.setMrRadioButtonField();
		Thread.sleep(3000);
		objRegistration.setFirstName1TextField("Petravilj");
		Thread.sleep(3000);
		objRegistration.setLastName1TextField("Pecipajkoski");
		Thread.sleep(3000);
		objRegistration.setPasswordPasswordField("Cicomico123");
		Thread.sleep(3000);
		objRegistration.setAddressTextField("Temnica 12");
		Thread.sleep(3000);
		objRegistration.setCityTextField("Miami");
		Thread.sleep(3000);
		objRegistration.setStateDropDownListField("Florida");
		Thread.sleep(3000);
		objRegistration.setZippostalCodeTextField("33024");
		objRegistration.setCountryDropDownListField("United States");
		Thread.sleep(3000);
		objRegistration.setMobilePhoneTextField("0123456789");
		Thread.sleep(3000);
		
	}
	
	@Then ("I click on the register button")
	public void i_click_on_the_register_button() {
		objRegistration.clickRegisterButton();
	
	}
	public void tearDown() {
		driver.quit();
	
	}
	
}
	
	

