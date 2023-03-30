package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createapage{
WebDriver driver;
	
	By cap=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By gs=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button");
	
	public Createapage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void pageclick() {
		driver.findElement(cap).click();
	}
	
	public void getStarted() {
		driver.findElement(gs).click();
	}

}
