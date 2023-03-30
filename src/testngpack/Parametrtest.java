package testngpack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrtest {
	@Parameters("a")
	@Test
	public void parametr(String a) {
		System.out.println(a);
		
	}

}
