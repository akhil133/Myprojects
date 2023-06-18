package blazetestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import blazepagepkg.Addtocart;

public class Addtocarttestcase {
	
	@Test
	public void addtocart() {
		
		System.getProperty("Webdriver.chrome.driver","D:\\akhil\\Chromedriver32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		
		
		Addtocart cartadd=new Addtocart(driver); 
		cartadd.phone();
		cartadd.cartbutton();
		
	}
	
	
		
	

}
