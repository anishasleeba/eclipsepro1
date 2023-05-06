package pkg;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wappalyzer {
	WebDriver driver;

	@Before
	public void setUp() {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.wappalyzer.com");
		
	}
	

	@Test
	public void textVeri() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='d-none d-md-block flex-grow-1 flex-shrink-0 text-right col']/button[2]")).click();
		driver.findElement(By.xpath("//a[@id='list-item-50']")).click();	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a")).click();
		driver.findElement(By.xpath("//div[@class='v-alert__content']/a")).click();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.findElement(By.xpath("//input[@placeholder=\"Find a technology\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"E.g. ecommerce or Shopify\"]")).sendKeys("java",Keys.ENTER);

	}

	@After
	public void tearDown() {

	}

}
