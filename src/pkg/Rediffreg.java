package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffreg {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

	}

	@Test
	public void textVeri() {
		String s = driver.getPageSource();
		if (s.contains("register")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		// Select date = new
		// Select(driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]")));
		// fruits.selectByVisibleText("Austria");
		// selectByValue
		// date.selectByIndex(6);

		// or

		WebElement date = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select s1 = new Select(date);
		s1.selectByValue("02");

		WebElement month = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select s2 = new Select(month);
		s2.selectByIndex(04);

		WebElement year = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select s3 = new Select(year);
		s3.selectByIndex(03);

	}

	@After
	public void tearDown() {

	}
}
