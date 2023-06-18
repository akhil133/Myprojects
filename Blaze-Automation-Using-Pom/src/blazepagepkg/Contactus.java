package blazepagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contactus {
	
	WebDriver driver;
	
	By email=By.xpath("//*[@id=\"recipient-email\"]");
	By name=By.xpath("//*[@id=\"recipient-name\"]");
	By message=By.xpath("//*[@id=\"message-text\"]");
	By sendbutton=By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
	
	public  Contactus(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void email(String eid) {
		
		driver.findElement(email).sendKeys(eid);
	}

	public void name(String uid) {
		driver.findElement(name).sendKeys(uid);
	}
	
	public void message(String ms) {
		driver.findElement(message).sendKeys(ms);
	}
	
	public void sendbutton() {
		
		driver.findElement(sendbutton).click();
	}
}

