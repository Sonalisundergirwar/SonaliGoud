package KiteWithPOM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import UtilityClass.KiteUtilityClass;

public class BaseClass
{
	protected WebDriver driver;
	
public void openchromeBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(KiteUtilityClass.getDataFromPropertyFile("URL"));
   driver.manage().window().maximize();
	Reporter.log("Launching browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}	
public void openfirefoxBrowser() throws IOException {
	System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\geckodriver.exe");
	driver.get(KiteUtilityClass.getDataFromPropertyFile("URL"));
	driver.manage().window().maximize();
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));


}
}
