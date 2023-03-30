package tests;

import org.testng.annotations.Test;

import pages.Createapage;
public class Createpagetest extends Baseclass{
	

	@Test
	public void testlogin() {
		Createapage ob1=new Createapage(driver);
		ob1.pageclick();
		ob1.getStarted();
		
	}


}
