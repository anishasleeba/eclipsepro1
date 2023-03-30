package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpage;

public class Fblogintest extends Baseclass {
//	WebDriver driver;
//	
//	@BeforeTest
//	public void setUp() {
//		driver =  new EdgeDriver();
//		driver.get("https://www.facebook.com");
//	}
	
	@Test
	public void testlogin() {
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setValues("abc@gmail.com","12345");
		ob.login();
		
	}

}
