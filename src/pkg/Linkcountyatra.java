package pkg;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkcountyatra {

	FirefoxDriver driver;

	@Before

	public void setUp() {

		driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");
	}

	@Test

	public void linkcount() {

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("total no of links=" + linklist.size());

	}

	@After
	public void tearDown() {
		driver.close();
	}

}
