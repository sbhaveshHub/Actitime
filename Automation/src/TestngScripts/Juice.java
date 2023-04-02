package TestngScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Juice extends Baseclass {

	
	@Test
	public void Fruit() {
		Reporter.log("Fruit juice",true);
	}

	@Test
	public void Apple() {
		Reporter.log("Apple juice",true);
		
	}
	
}
