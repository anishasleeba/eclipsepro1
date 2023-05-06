package testngpack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Makemytripdate {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		driver = new EdgeDriver();
	}

	@BeforeMethod
	public void urlloading() {
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void test1() {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("webklipper-publisher-widget-container-notification-frame")));
		driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));
		driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]"))
				.click(); // Close Ad
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class=\"DayPicker-Months\"]/div[1]/div[1]/div")));

		while (true) {
			String date = driver.findElement(By.xpath("//div[@class=\"DayPicker-Months\"]/div[1]/div[1]/div"))
					.getText();
			if (date.equalsIgnoreCase("June 2023")) {
				break;

			} else {
				driver.findElement(By.xpath(
						"/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]"))
						.click();
			}
		}

		List<WebElement> dats = driver.findElements(By.xpath(
				"//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div/div/div/p[1]"));
		for (WebElement li : dats) {
			String day = li.getText();
			if (day.equalsIgnoreCase("30")) {
				li.click();
				break;
			}

		}
	}

	@AfterMethod
	public void aftrmethd() {

	}

	@AfterTest
	public void quit() {
		// driver.quit();
	}

}

