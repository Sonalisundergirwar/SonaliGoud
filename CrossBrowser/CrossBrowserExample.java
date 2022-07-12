package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserExample {

	@Parameters("browserName")
	@Test
	public void myMethod(String name) throws InterruptedException
	{
	WebDriver driver = null;
	if(name.equals("firefox"))
	{
	System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\geckodriver.exe");
	driver= new FirefoxDriver();
	}
	else if (name.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
	driver= new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(2000);
	driver.close();
	}
	
}
