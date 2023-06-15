package pages_Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BlazeSignup {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.getProperty("Webdriver.chrome.driver","D:\\akhil\\Chromedriver32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.demoblaze.com/");
	}
	
	@Test
	public void verifylogin()
	{
		WebElement login=driver.findElement(By.xpath("//*[@id=\"signin2\"]"));
		login.click();
		
	      WebElement email = driver.findElement(By.id("sign-username"));
	        WebElement password = driver.findElement(By.id("sign-password"));
	        WebElement signButton = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
	 
	        email.clear();
	        System.out.println("Entering the email");
	        email.sendKeys("samves68");
	 
	        password.clear();
	        System.out.println("entering the password");
	        password.sendKeys("samves44");
	 
	        System.out.println("Clicking signupbutton");
	        signButton.click();
	}
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
	
}
