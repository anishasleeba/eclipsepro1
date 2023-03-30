package pkg;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wappalyzer {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.wappalyzer.com");

	}

	@Test
	public void textVeri() {
		driver.findElement(
				By.xpath("//div[@class='d-none d-md-block flex-grow-1 flex-shrink-0 text-right col']/button[2]"))
				.click();
		driver.findElement(By.xpath("//a[@id='list-item-50']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='/technologies/ecommerce/shopify/']")).click();
		driver.findElement(By.xpath("//div[@class='v-alert__content']/a")).click();
		// driver.findElement(By.xpath("//div[@value='technologies']/button")).click();
		// driver.findElement(By.xpath("//div[@class='v-select__selections']/input")).sendKeys("java");

	}

	@After
	public void tearDown() {

	}

}
