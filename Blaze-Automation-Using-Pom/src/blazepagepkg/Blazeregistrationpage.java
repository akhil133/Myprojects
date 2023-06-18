package blazepagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Blazeregistrationpage {

	WebDriver driver;
	
	By username=By.xpath("//*[@id=\"sign-username\"]");
	By password=By.xpath("//*[@id=\"sign-password\"]");
	By signupbutton=By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
	
	public Blazeregistrationpage(WebDriver driver1) {
		
		this.driver=driver1;
	}
	
	public void username(String uid) {
		
		driver.findElement(username).sendKeys(uid);
	}
	
	public void password(String psw) {
		driver.findElement(password).sendKeys(psw);
	}
	public void signbutton() {
		
		driver.findElement(signupbutton).click();
	}
	
}