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

public class Dragndrop {

	ChromeDriver driver;

	@BeforeTest()
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeMethod()
	public void urlloading() {
		driver.get("https://demoqa.com/droppable/");
	}

	@Test()
	public void test1() {
		WebElement start = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement stop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		Actions act = new Actions(driver);
		act.dragAndDrop(start, stop);
		act.perform();

		String s = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();

		if (s.equals("Dropped!")) {
			System.out.println("Text changed");
		} else {
			System.out.println("Text not changed");
		}

	}

	@AfterTest
	public void quit() {

	}

}
