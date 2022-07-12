package RunFailedTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestCases {
  
  @Test
	 public void x()
	 {
	 Reporter.log("x is running",true);
	 Assert.fail();
	 }
	 @Test
	 public void y()
	 {
	 Reporter.log("y is running",true);
	 }
	 @Test
	 public void z()
	 {
	 Reporter.log("z is running",true);
	 }
}
