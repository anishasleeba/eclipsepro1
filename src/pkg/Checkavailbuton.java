package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkavailbuton {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

	}

	@Test
	public void textVeri() {
		WebElement li = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		String url = li.getAttribute("value");

		if (url.equals("Check availability")) {

			System.out.println("success");
		} else {
			System.out.println("fail");
		}

	}

	@After
	public void tearDown() {
		// driver.quit();
	}

}
