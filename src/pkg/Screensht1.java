package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screensht1 {

	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

	@Test
	public void textVeri() throws IOException {
		// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// taking entire page screenshot
		// FileHandler.copy(src, new File("D://error1.png"));// saving file to drive

		WebElement search = driver.findElement(By.name("btnK"));
		File src1 = search.getScreenshotAs(OutputType.FILE);// taking specific element page screenshot
		FileHandler.copy(src1, new File("./Screenshot//error2.png"));// saving file to current project by manually
																		// creating screenshot folder

	}

	@After
	public void tearDown() {

	}

}
