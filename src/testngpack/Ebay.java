package testngpack;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {

	ChromeDriver driver;

	@BeforeTest
	public void before() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void before1() {
		driver.get("https://www.ebay.com/");
	}

	@Test
	public void test() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));

		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele);
		action.perform();

		
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
				
	}
}
