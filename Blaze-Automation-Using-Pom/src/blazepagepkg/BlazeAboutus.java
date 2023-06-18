package blazepagepkg;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BlazeAboutus {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.getProperty("Webdriver.chrome.driver","D:\\akhil\\Chromedriver32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.demoblaze.com/");
	}
	
	@Test
	public void verifyAboutuspage()
	{
		WebElement c=driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a"));
		c.click();
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
