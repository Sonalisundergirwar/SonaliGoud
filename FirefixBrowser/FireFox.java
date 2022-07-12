package FirefixBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox {@Test
	public void myMethod()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\geckodriver.exe");  //"D:\\SELENIUM\\selenium location path
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	}
 
  }

