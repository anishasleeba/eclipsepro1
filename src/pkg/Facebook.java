package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@Test
	public void textVeri() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc123");
		// driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

	}

	@After
	public void tearDown() {
		// driver.quit();
	}

}
