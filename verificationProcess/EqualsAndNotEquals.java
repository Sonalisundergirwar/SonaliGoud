package verificationProcess;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class EqualsAndNotEquals {
	@Test
	public void myMethod()
	{
	String a="Pune";
	String b="Pune";
	// Assert.assertEquals(a, b," a and b values are not matching TC failed");
	// Reporter.log(" a and b values are matching TC PASSED",true);
	Assert.assertEquals(a, b," a and b values are matching TC failed");
	Reporter.log(" a and b values are not matching TC Passed",true);
	
	
  }
}
