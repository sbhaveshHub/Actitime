package TestngScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ItestDesigning.class)
public class ListenerImplementation extends Baseclass {
	
	@Test
	public void CrateCustomer() {
		Assert.fail();
		Reporter.log("customer created",true);
	}

}
