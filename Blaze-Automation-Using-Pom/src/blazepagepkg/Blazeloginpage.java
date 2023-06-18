package blazepagepkg;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blazeloginpage {

	
	WebDriver driver;
	
	By username=By.xpath("//*[@id=\"loginusername\"]");
	By password=By.xpath("//*[@id=\"loginpassword\"]");
	By logbutton=By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	
	
	public Blazeloginpage(WebDriver driver) {
		 this.driver=driver;
		 
	}
	
	public void setvalues(String Username, String Password) {
		
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(Username);
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(Password);
	}
		public void login()
		{
			
			driver.findElement(logbutton).click();
		}
}
