package blazetestcases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import blazepagepkg.Blazeloginpage;
import blazepagepkg.Blazeregistrationpage;

public class Blazesignuptestcase {
	
	@Test
	public void Verifylogin() throws InterruptedException
	{
		System.getProperty("Webdriver.chrome.driver","D:\\akhil\\Chromedriver32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
				
		Blazeregistrationpage signup=new Blazeregistrationpage(driver);
		signup.username("ak82");
		signup.password("ak83");
		signup.signbutton();
		Thread.sleep(4000);
		driver.quit();
	

}
}
