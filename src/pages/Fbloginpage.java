package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;
	
	By fbemail=By.id("email");
	By fbpaswrd=By.id("pass");
	By fblogin=By.name("login");
	//we are doing this so when email or pasword changes we dont have to do it everywhere
	
	public Fbloginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setValues(String email,String paswrd) {
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpaswrd).sendKeys(paswrd);
	}
	
	public void login() {
		driver.findElement(fblogin).click();;
	}
	
	

}
