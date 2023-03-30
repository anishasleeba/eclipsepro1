package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actns {
	ChromeDriver driver;

	@BeforeTest()
	public void setUp() {
		driver = new ChromeDriver();

	}

	@BeforeMethod()
	public void urlloading() {
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test()
	public void test3() {
		WebElement first = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement rediff = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		first.sendKeys("arun");

		Actions act = new Actions(driver);

		act.keyDown(first, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(first, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(rediff, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);

		act.perform();

	}

	@AfterTest
	public void quit() {

	}

}
