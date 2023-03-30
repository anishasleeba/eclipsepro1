package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoitfileupload {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
	}

	@Test
	public void test() throws Exception {

		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\testing\\Autoit1.exe");
		Thread.sleep(4000);

	}

}
