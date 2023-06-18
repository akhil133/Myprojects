package blazepagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addtocart {

	WebDriver driver;
	
	By phone=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
	By cartbutton=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
	
	public Addtocart(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void phone() {
		driver.findElement(phone).click();
	}
	
	public void cartbutton() {
		driver.findElement(cartbutton).click();
	}
}
