package TestngScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngScript1 {
	
	@Test(invocationCount = 3,priority=2)
	public void createCust() {
		Reporter.log("customer created succesfully",true);
	}
	@Test(priority=3)
	public void modityCust() {
		Reporter.log("customer modified",true);
		
	}
	@Test(enabled = false
			)
	public void deleteCust() {
		Reporter.log("customer deleted",true);
	}
	

}
