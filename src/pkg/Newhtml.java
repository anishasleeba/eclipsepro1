package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newhtml {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Anu/Desktop/hi.html");

	}

	@Test
	public void textVeri() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		// driver.switchTo().alert().accept();//dismiss method also there

		Alert a = driver.switchTo().alert();

		String alerttext = a.getText();

		if (alerttext.equals("Hello! I am an alert box!!"))

		{
			System.out.println("pass");
		}

		else {
			System.out.println("fail");
		}

		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Ann");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Sleeba");

	}

	@After
	public void tearDown() {

	}

}
