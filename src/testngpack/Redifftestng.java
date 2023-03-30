package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifftestng {
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
	public void test1() {
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean a = radio.isSelected();// check box or radio button is selected
		if (a) {
			System.out.println("radio button is selected");
		} else {
			System.out.println("radio button is not selected");
		}
	}

	@Test()
	public void test2() {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b = logo.isDisplayed();// check box or radio button is selected
		if (b) {
			System.out.println("logo is displayed");
		} else {
			System.out.println("logo is not displayed");
		}
	}

	@Test()
	public void test3() {
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		boolean c = button.isEnabled();// check box or radio button is selected
		if (c) {
			System.out.println("button is enabled");
		} else {
			System.out.println("button is disabled");
		}
	}

	@AfterTest
	public void quit() {
		System.out.println("quit");
	}

}
