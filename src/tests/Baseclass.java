package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver =  new EdgeDriver();
		driver.get("https://www.facebook.com");
	}

}
