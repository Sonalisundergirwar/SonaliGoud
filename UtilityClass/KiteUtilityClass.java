package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
//Screenshots....
//reading data from proprtiesfile...
//1.create property file from main project....
//2.store data in key value pairs...
//3.takefileinputStream Class.....

public class KiteUtilityClass 
{
	public static void captureScreenshot(WebDriver driver, String TCID) throws
	IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("D:\\SELENIUM\\screenshot\\MyScreenshot"+TCID+".png");
	FileHandler.copy(src, dest);
	}
	public static String getDataFromPropertyFile  (String key) throws IOException
	{
	Properties prop= new Properties();// created object of properties 
	FileInputStream myfile= new
	FileInputStream("C:\\Users\\HP\\eclipse-workspace\\SONALI SELENIUM\\myPropertyFile.properties");
	prop.load(myfile);
	String value = prop.getProperty(key);
	return value;

	}
}
