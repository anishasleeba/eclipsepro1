package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textverifictn {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	@Test
	public void textVeri() {
		String s=driver.getPageSource();
		if(s.contains("Images")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	@After
	public void tearDown() {
		driver.quit();
	}

}
