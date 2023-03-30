package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		String exp="Google";
		
		// TODO Auto-generated method stub
		ChromeDriver drivr=new ChromeDriver();
		
		
		//to load url we use get method
		drivr.get("https://www.google.com/");
		
		
		//to get title we have getTitle method
		String at=drivr.getTitle();
		System.out.println(at);
		
		if(at.equals(exp)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		drivr.quit();
		//to automatically close the browser
	}

}
