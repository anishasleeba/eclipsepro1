package testngpack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99 {

	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void urlloading() {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}

	@Test()
	public void test1() throws InterruptedException {
		WebElement first = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act = new Actions(driver);
		act.contextClick(first).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		driver.switchTo().alert().accept();

		WebElement second = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(second).perform();
		Alert s = driver.switchTo().alert();
		String s1 = s.getText();
		System.out.println(s1);
		Thread.sleep(500);//not dynamic it will wait for 500ms 
		//and then accept main difference btw wait is wait is dynamic 
		//that is if we give 5 sec if the element loads for 3 sec rest second is dropped.
		s.accept();

	}

	@AfterTest
	public void quit() {
		System.out.println("quit");
	}

}
