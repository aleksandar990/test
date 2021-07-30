import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;

public class SecTest {
	
	public WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		 driver.manage().window().maximize();  
		 driver.get("http://automationpractice.com/index.php");
		 Thread.sleep(2000);
		 
		
	}
	
	@Test
	public void goToAp() throws Exception {
		WebElement signIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		signIn.click();
		
		WebElement createEmail = driver.findElement(By.id("email_create"));
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(10000);  
		createEmail.sendKeys("username"+ randomInt +"@gmail.com"); 
		
		
		
		
		WebElement createAnAccount = driver.findElement(By.id("SubmitCreate"));
		createAnAccount.click();
		Thread.sleep(5000);
	
		
		WebElement selectGender = driver.findElement(By.id("id_gender1"));
		selectGender.click();
		
		WebElement userName = driver.findElement(By.id("customer_firstname"));
		userName.sendKeys("Gjorgija");
		Thread.sleep(5000);
		
		
		WebElement userLastName = driver.findElement(By.id("customer_lastname"));
		userLastName.sendKeys("Grizikoskoski");
		
		
		WebElement userPass = driver.findElement(By.id("passwd"));
		userPass.sendKeys("Bale@123");
		
		
		WebElement userDate = driver.findElement(By.id("days"));
		userDate.sendKeys("23");
		
		
		WebElement userMonth = driver.findElement(By.id("months"));
		userMonth.sendKeys("January");
		
		
		WebElement userYear = driver.findElement(By.id("years"));
		userYear.sendKeys("2000");
		
		
		WebElement userAdress = driver.findElement(By.id("address1"));
		userAdress.sendKeys("DobrivojaR");
		
		WebElement userCity = driver.findElement(By.id("city"));
		userCity.sendKeys("Tampa");
		
		
		WebElement userState = driver.findElement(By.id("id_state"));
		userState.sendKeys("Florida");
		
		
		WebElement userZip = driver.findElement(By.id("postcode"));
		userZip.sendKeys("33605");
		
		
		WebElement userCountry = driver.findElement(By.id("id_country"));
		userCountry.sendKeys("United States");
		
		
		WebElement userPhone = driver.findElement(By.id("phone_mobile"));
		userPhone.sendKeys("0123456789");
		Thread.sleep(2000);
		
		WebElement registerAc = driver.findElement(By.id("submitAccount"));
		registerAc.click();
		
		
		}
	
	/*@Test
	public void goToAp1() throws Exception {
		WebElement signIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		signIn.click();
		
		WebElement enterEmail = driver.findElement(By.id("email"));
		enterEmail.sendKeys("TC12@gmail.com");
		
		WebElement enterPass = driver.findElement(By.id("passwd"));
		enterPass.sendKeys("Bale123");
		
		WebElement logIn = driver.findElement(By.id("SubmitLogin"));
		logIn.click();
		
		Thread.sleep(3000);
		
		WebElement selectCategory = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		selectCategory.click();
		Thread.sleep(2000);
		
	
	}
	
	*/
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

}


