package verificationProcess;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void myMethod()
	{
	String a="Pune1";
	String b="Pune";
	Assert.assertEquals(a, b,"TC is failed values are equal");           // in verification process..............
	                                                                                                             //if first test case is false then it will not go to the net step ...
	                                                                                                            //execution will stop here self only its a drawback of Hard assert.......
	Assert.assertNotNull(b, "TC is failed value is null");
	}
	
  }

