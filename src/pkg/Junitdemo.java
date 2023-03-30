package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void test1() {
		String exp = "Google";

		String at = driver.getTitle();
		System.out.println(at);

		if (at.equals(exp)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
