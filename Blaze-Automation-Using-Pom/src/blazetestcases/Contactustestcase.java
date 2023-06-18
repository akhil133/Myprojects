package blazetestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import blazepagepkg.Contactus;

public class Contactustestcase {
	
	@Test
	public void contactus() throws InterruptedException
	{
		System.getProperty("Webdriver.chrome.driver","D:\\akhil\\Chromedriver32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		
		
		Contactus sendm=new Contactus(driver);
		sendm.email("ak32");
		sendm.name("ak23");
		sendm.message("dsdsds");
		sendm.sendbutton();

		Thread.sleep(4000);
		driver.quit();
			
		}
	}
	
 
