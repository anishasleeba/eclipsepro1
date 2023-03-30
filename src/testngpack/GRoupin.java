package testngpack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GRoupin {
ChromeDriver driver;
	
	@BeforeTest(alwaysRun = true)
	public void setUp() {
		driver=new ChromeDriver();	
		
	}
	
	@BeforeMethod(alwaysRun = true)//before every test will be executed 
	public void urlloading() {
		driver.get("https://www.facebook.com/");
		System.out.println("url loading");
	}
	
	@Test(groups= {"smoke","sanity"})// for repeating a particular test 3 times
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups= {"smoke"})//to not execute a test enabled =false given
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups= {"regression"})// if priority not given will execute i alphabetic order
	public void test3() {
		System.out.println("test3");
	}
	
	@AfterMethod//after every test will be executed
	public void aftrmethd() {
		System.out.println("aftrmethd");
	}
	
	@AfterTest
	public void quit() {
		System.out.println("quit");
	}


}
