package Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class GrpExample {
	@Test
	public void a()
	{
	
	Reporter.log("a is running", true);
	}
	@Test(groups = {"regression"})
	public void b()
	{
	Reporter.log("b is running regression", true);
	}
	@Test(groups = {"sanity"})
	public void c()
	{
	Reporter.log("c is running,sanity", true);
	}
	@Test(groups = {"regression"})
	public void d()
	{
	Reporter.log("d is running,regression", true);
	}
	 
  }

