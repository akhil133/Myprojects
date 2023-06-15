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

public class Homepage {
	
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
	public void Homepageverification()
	{
		WebElement Home=driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
		Home.click();
		
		
	      //WebElement email = driver.findElement(By.id("loginusername"));
	        //WebElement password = driver.findElement(By.id("loginpassword"));
	        //WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
	 
	        //email.clear();
	        //System.out.println("Entering the email");
	        //email.sendKeys("samves67");
	 
	        //password.clear();
	        //System.out.println("entering the password");
	        //password.sendKeys("samves43");
	 
	        System.out.println("Clicking login button");
	        Home.click();
	        
	        
	        WebElement cart=driver.findElement(By.xpath("//*[@id=\"cartur\"]"));
			cart.click();
	}
	//@AfterMethod
	//public void teardown()
	{
	//driver.quit();
	}

}