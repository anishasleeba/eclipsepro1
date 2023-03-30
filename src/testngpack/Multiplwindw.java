package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplwindw {
EdgeDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver=new EdgeDriver();		
	}
	
	@BeforeMethod
	public void urlloading() {
		driver.get("https://demo.guru99.com/popup.php");
	}
	
	@Test
	public void test1() {
		String currentHandle= driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		
	}
	
	@AfterMethod
	public void aftrmethd() {
		System.out.println("aftrmethd");
	}
	
	@AfterTest
	public void quit() {
		System.out.println("quit");
	}


}
