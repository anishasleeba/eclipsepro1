package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99upload {
	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void urlloading() {
		driver.get("https://demo.guru99.com/test/upload/");
	}

	@Test()
	public void test1() {

		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\Anu\\Downloads\\practicequestion.txt");
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		boolean a = radio.isSelected();// check box or radio button is selected
		if (a) {
			System.out.println("radio button is selected");
		} else {
			System.out.println("radio button is not selected");
		}
		radio.click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
	}

	@AfterTest
	public void quit() {
		System.out.println("quit");
	}

}
