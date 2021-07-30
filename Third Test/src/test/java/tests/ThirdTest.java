package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.AdressPage;
import pages.AuthenticationPage;
import pages.BankWirePage;
import pages.CheckPaymentPage;
import pages.DressesPage;
import pages.HomePage;
import pages.PaymentPage;
import pages.RegistrationPage;
import pages.ShippingPage;
import pages.ShoppingCartPage;
import pages.TshirtPage;
import pages.WomenPage;

public class ThirdTest {
	public static WebDriver driver;
	RegistrationPage objRegistration;
	AuthenticationPage objAuthentication;
	DressesPage objDresses;
	WomenPage objWomen;
	TshirtPage objTshirt;
	ShoppingCartPage objShoppingCart;
	HomePage objHome;
	AdressPage objAdress;
	PaymentPage objPayment;
	ShippingPage objShipping;
	BankWirePage objBank;
	CheckPaymentPage objCheck;

	
	@Before
	public void setUp() {
    System.setProperty("webdriver.chrome.driver", "chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    objRegistration = PageFactory.initElements(driver, pages.RegistrationPage.class);
    objAuthentication = PageFactory.initElements(driver, pages.AuthenticationPage.class);
    objDresses = PageFactory.initElements(driver, pages.DressesPage.class);
    objTshirt = PageFactory.initElements(driver, pages.TshirtPage.class);
    objWomen = PageFactory.initElements(driver, pages.WomenPage.class);
    objShoppingCart = PageFactory.initElements(driver, ShoppingCartPage.class);
    objHome = PageFactory.initElements(driver, pages.HomePage.class);
    objAdress = PageFactory.initElements(driver, AdressPage.class);
    objBank = PageFactory.initElements(driver, BankWirePage.class);
    objPayment = PageFactory.initElements(driver, PaymentPage.class);
    objShipping = PageFactory.initElements(driver, ShippingPage.class);
    objCheck = PageFactory.initElements(driver, CheckPaymentPage.class);
    
    driver.get("http://automationpractice.com/index.php");
}
	@Test
	public void registerNewAccount() throws Exception {
		objRegistration.clickSignInLink();
		objAuthentication.setEmailAddress1TextField("ooossooooojoj@gmail.com");
		objAuthentication.clickCreateAnAccountButton();
		Thread.sleep(2000);
		objRegistration.setMrRadioButtonField();
		Thread.sleep(2000);
		objRegistration.setFirstName1TextField("Petranka");
		objRegistration.setLastName1TextField("Kostadinova");
		objRegistration.setPasswordPasswordField("Tikvar@eden");
		objRegistration.setAddressTextField("Ul.temnica bb");
		objRegistration.setCityTextField("Tampa");
		objRegistration.setStateDropDownListField("Florida");
		objRegistration.setZippostalCodeTextField("33601");
		objRegistration.setCountryDropDownListField("United States");
		objRegistration.setMobilePhoneTextField("0123456789");
		objRegistration.clickRegisterButton();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void registerWithExcistingAccount() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objRegistration.clickSignInLink();
		objAuthentication.setEmailAddress2TextField("TC12@gmail.com");
		objAuthentication.setPasswordPasswordField("Bale123");
		objAuthentication.clickSignIn2Button();
		objWomen.clickWomen1Link();
		objWomen.clickFadedShortSleeveLink();
		objWomen.verifyPageLoaded();
		objWomen.clickAddToCart1Link();
		objWomen.clickProceedToCheckoutLink();
		objShoppingCart.verifyPageLoaded();
		objShoppingCart.clickProceedToCheckout2Link();
		objAdress.verifyPageLoaded();
		objAdress.clickProceedToCheckout2Button();
		objShipping.verifyPageLoaded();
		objShipping.setIAgreeToTheTermsOfCheckboxField();
		objShipping.clickProceedToCheckout2Button();
		objPayment.verifyPageLoaded();
		objPayment.clickPayByBankWireOrderLink();
		objBank.verifyPageLoaded();
		objBank.clickIConfirmMyOrderButton();
		Thread.sleep(5000);
		
       
	}
	
	
	@Test
	public void registerWithExcistingAccount1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objRegistration.clickSignInLink();
		objAuthentication.setEmailAddress2TextField("TC12@gmail.com");
		objAuthentication.setPasswordPasswordField("Bale123");
		objAuthentication.clickSignIn2Button();
		objDresses.clickDresses1Link();
		Thread.sleep(2000);
		objDresses.clickPrintedDress2Link();
		objDresses.verifyPageLoaded();
		Thread.sleep(2000);
		objDresses.clickAddToCart1Link();
		Thread.sleep(2000);
		objDresses.clickContinueShoppingLink();
		objTshirt.clickTshirt1Link();
		Thread.sleep(2000);
		objTshirt.clickFadedShortSleeveTshirtLink();
		Thread.sleep(2000);
		objTshirt.clickAddToCartLink();
		Thread.sleep(3000);
		objTshirt.clickProceedToCheckoutLink();
		objShoppingCart.verifyPageLoaded();
		objShoppingCart.clickProceedToCheckout2Link();
		objAdress.verifyPageLoaded();
		objAdress.clickProceedToCheckout2Button();
		objShipping.verifyPageLoaded();
		objShipping.setIAgreeToTheTermsOfCheckboxField();
		objShipping.clickProceedToCheckout2Button();
		objPayment.verifyPageLoaded();
		objPayment.clickPayByCheckOrderProcessingLink();
		Thread.sleep(3000);
		objCheck.clickIConfirmMyOrderButton();
		Thread.sleep(3000);
		
		
		
		
		
		

	
	}
	@After
	public void tearDown() {
		driver.close();
	}
	
}



