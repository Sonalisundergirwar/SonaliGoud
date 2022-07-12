package UtilityClass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClass.KiteBase;

public class ListenerClass  extends KiteBase implements ITestListener {
  KiteBase b=new KiteBase();
	@Override
public void onTestSuccess(ITestResult result) {
Reporter.log("welcome tc is successful tc name is"+result.getName(),true);
}
@Override
	public void onTestFailure(ITestResult result) {
	Reporter.log("sorry tc is fail tc name is"+result.getName(),true);
String name=result.getName();
	try 
	{
	b.captureScreenshot(name);
  } catch (IOException e)
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
